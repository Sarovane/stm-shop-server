package com.ihealthink.reptile.common.constant;

/**
 * 通用常量信息
 *
 * @author xiaoyang
 */
public class Constants {
    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK 字符集
     */
    public static final String GBK = "GBK";

    /**
     * RMI 远程方法调用
     */
    public static final String LOOKUP_RMI = "rmi:";

    /**
     * LDAP 远程方法调用
     */
    public static final String LOOKUP_LDAP = "ldap:";

    /**
     * LDAPS 远程方法调用
     */
    public static final String LOOKUP_LDAPS = "ldaps:";

    /**
     * http请求
     */
    public static final String HTTP = "http://";

    /**
     * https请求
     */
    public static final String HTTPS = "https://";

    /**
     * 成功标记
     */
    public static final Integer SUCCESS = 200;

    /**
     * 失败标记
     */
    public static final Integer FAIL = 500;

    /**
     * 登录成功状态
     */
    public static final String LOGIN_SUCCESS_STATUS = "0";

    /**
     * 登录失败状态
     */
    public static final String LOGIN_FAIL_STATUS = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 注册
     */
    public static final String REGISTER = "Register";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String IS_ASC = "isAsc";

    /**
     * 验证码 redis key
     */
    public static final String CAPTCHA_CODE_KEY = "captcha_codes:";

    /**
     * 验证码有效期（分钟）
     */
    public static final long CAPTCHA_EXPIRATION = 2;


    /**
     * 参数管理 cache key
     */
    public static final String SYS_CONFIG_KEY = "sys_config:";

    /**
     * 字典管理 cache key
     */
    public static final String SYS_DICT_KEY = "sys_dict:";

    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    /**
     * 否
     */
    public static final String NO = "0";
    /**
     * 是
     */
    public static final String YES = "1";

    /**
     * 否
     */
    public static final String STR_NO = "NO";
    /**
     * 是
     */
    public static final String STR_YES = "YES";




    /**
     * 文件类型-体检中心图片
     */
    public static final String FILE_REFER_TYPE_CENTER_PIC = "CENTER_PIC";
    /**
     *  文件的使用状态 使用中=USING  未使用=NOT_USE
     */
    public static final String FILE_USE_STATUS_USE = "USING";

    public static final String FILE_USE_STATUS_NOT_USE = "NOT_USE";
    /**
     * 源文件标志  其他File表中为linked_file_id
     */
        public static final String FILE_TYPE_LINK_ORIGIN = "ORIGIN";
    /**
     * 使用文件的模块分类
     */
    public static final String FILE_REFER_CODE_EXAM_BASIC = "ks-exam-basic";


}
