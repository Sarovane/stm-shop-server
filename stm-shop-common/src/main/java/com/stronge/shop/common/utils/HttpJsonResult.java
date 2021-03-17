package com.stronge.shop.common.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @author Rocket
 * @Title: HttpJsonResult.java
 * @Description: 自定义响应数据结构，将JSON数据封装到一个对象中
 * 这个类是提供给门户，ios，安卓，微信商城用的
 * 门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 其他自行处理
 * 200：表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 */
public class HttpJsonResult {
    /**
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();
    /**
     * 响应业务状态
     */
    private Integer status;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应中的数据
     */
    private Object data;

    public static HttpJsonResult build(Integer status, String msg, Object data) {
        return new HttpJsonResult(status, msg, data);  //3个参数
    }

    public static HttpJsonResult ok(Object data) {
        return new HttpJsonResult(data);  //1个参数
    }

    public static HttpJsonResult ok() {
        return new HttpJsonResult(null);  //data为空进行构造
    }

    public static HttpJsonResult errorMsg(String msg) {
        return new HttpJsonResult(500, msg, null); //500：表示错误，错误信息在msg字段中
    }

    public static HttpJsonResult errorMap(Object data) {
        return new HttpJsonResult(501, "error", data);  //501：bean验证错误
    }

    public static HttpJsonResult errorTokenMsg(String msg) {
        return new HttpJsonResult(502, msg, null);  //502：拦截器拦截到用户token出错
    }

    public static HttpJsonResult errorException(String msg) {
        return new HttpJsonResult(555, msg, null);     //555：异常抛出信息
    }

    public HttpJsonResult() {

    }

    //3参构造函数
    public HttpJsonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    //1参构造函数
    public HttpJsonResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @param jsonData
     * @param clazz
     * @return
     * @Description: 将json结果集转化为LeeJSONResult对象
     * 需要转换的对象是一个类
     */
    public static HttpJsonResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, HttpJsonResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param json
     * @return
     * @Description: 没有object对象的转化
     */
    public static HttpJsonResult format(String json) {
        try {
            return MAPPER.readValue(json, HttpJsonResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param jsonData
     * @param clazz
     * @return
     * @Description: Object是集合转化
     * 需要转换的对象是一个list
     */
    public static HttpJsonResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}
