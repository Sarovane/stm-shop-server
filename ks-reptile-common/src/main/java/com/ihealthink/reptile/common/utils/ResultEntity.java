package com.ihealthink.reptile.common.utils;



import com.ihealthink.reptile.common.constant.CommonDictConstants;
import com.ihealthink.reptile.common.constant.Constants;

import java.io.Serializable;

/**
 * 响应信息主体
 *
 * @author xiaoyang
 */
public class ResultEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int SUCCESS = Constants.SUCCESS;

    /**
     * 失败
     */
    public static final int FAIL = Constants.FAIL;

    /**
     * 成功信息
     */
    public static final String MESSAGE_OK = CommonDictConstants.Message.OK;

    /**
     * 失败信息
     */
    public static final String MESSAGE_FAIL = CommonDictConstants.Message.FAIL;

    private int code;

    private String msg;

    private T data;

    public static <T> ResultEntity<T> ok() {
        return restResult(null, SUCCESS, MESSAGE_OK);
    }

    public static <T> ResultEntity<T> ok(T data) {
        return restResult(data, SUCCESS, MESSAGE_OK);
    }

    public static <T> ResultEntity<T> ok(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> ResultEntity<T> fail() {
        return restResult(null, FAIL, MESSAGE_FAIL);
    }

    public static <T> ResultEntity<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> ResultEntity<T> fail(T data) {
        return restResult(data, FAIL, MESSAGE_FAIL);
    }

    public static <T> ResultEntity<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    public static <T> ResultEntity<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    private static <T> ResultEntity<T> restResult(T data, int code, String msg) {
        ResultEntity<T> apiResult = new ResultEntity<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
