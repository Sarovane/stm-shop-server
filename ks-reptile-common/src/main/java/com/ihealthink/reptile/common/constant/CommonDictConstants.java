package com.ihealthink.reptile.common.constant;

/**
 * @ClassName CommonDict
 * @Description 公共字典
 * @Author actor
 * @Date 2022/4/13 14:40
 * @Version 1.0
 */
public class CommonDictConstants {
    /**
     * 分隔符
     */
    public interface Split {
        String COMMA = ",";
        String HORIZONTAL_LINE = "-";
        String DOWN_LINE = "_";
        String EQ = "=";
        String AND = "&";
        String QM = ":";
        String MULTIPLY = "x";
        String SEMICOLON = ";";
        String QS = "\\?";
        String VERTICAL_LINE = "\\|";
        String POINT = ".";
        String ASTERISK = "\\*";
        String OBLIQUE_LINE = "/";
        String PERCENT_SIGN = "%";
        String XML = "_xml";
        String TXT = ".txt";
        String JPG = "_JPG";
        String NAME = "-验证集";
        String TEST = "test.txt";
        String TRAIN = "train.txt";
        String LOG = ".log";
        String PNG = ".png";
        String SUFFIX_XML = ".xml";
        String SUFFIX_JPG = ".jpg";
        String SUF_JPG = "jpg";
        String PRE_XML = "xml";
        String PRE_JPG = "pic";
        String PRE_THUM = "thum";
        String DATA = "data";
        String LEFT_BRA = "(";
        String RIGHT_BRA = ")";
        String JIN_HAO = "#";
        String ZHUAN_YI_FU_HAO = "%23";
    }

    /**
     * 返回前端信息内容
     */
    public interface Message{
        String OK = "操作成功!";
        String FAIL = "操作失败!";
    }

    public interface SmsUrl{
        /**
         * 验证码
         */
        String SEND_SMS = "api/v2/single_send";

        /**
         * 批量短信
         */
        String SEND_BATCH_SMS = "api/v2/send";

        /**
         * 短信余额
         */
        String SMS_ACCOUNT = "query/account";

        /**
         * 添加短信签名
         */
        String ADD_SMS_SIGN = "open/api/addSign";

        /**
         * 修改短信接口
         */
        String MODIFY_SMS_SIGN = "open/api/modifySign";

        /**
         * 查询短信签名
         */
        String QUERY_SMS_SIGN = "query/signlist";

        /**
         * 添加短信模板
         */
        String ADD_SMS_TEMPLATE = "open/api/addTemplate";

        /**
         * 修改短信模板
         */
        String MODIFY_SMS_TEMPLATE = "open/api/modifyTemplate";

        /**
         * 查询短信模板
         */
        String QUERY_SMS_TEMPLATE = "query/templatelist";

        /**
         * 查询单条短信模板
         */
        String QUERY_ONE_SMS_TEMPLATE = "query/getTemplate";
    }

    /**
     * 表字段
     */
    public interface TableColumn{
        String ROLE_ID = "roleId";
        String DEL_FLAG = "del_flag";
    }


    /**
     * sql条件查询
     */
    public interface SqlSearch{
        /**
         * 精确查询
         */
        String EQ = "eq";
        /**
         *不等于
         */
        String NE = "ne";
        /**
         * 模糊左边
         */
        String LIKE = "like";
        /**
         * 模糊查询开头
         */
        String LIKE_LEFT = "likeLeft";
        /**
         * 模糊查询结尾
         */
        String LIKE_RIGHT = "likeRight";
        /**
         * 不用模糊
         */
        String NOT_LIKE = "notLike";
        /**
         * 小于
         */
        String LT = "lt";
        /**
         * 大于
         */
        String GT = "gt";
        /**
         * 大于等于
         */
        String GE = "ge";
        /**
         * 小于等于
         */
        String LE = "le";
        /**
         * 升序
         */
        String ASC = "asc";
        /**
         * 降序
         */
        String DESC = "desc";
    }


    /**
     * M目录 C菜单 F按钮
     */
    public interface Letter{
        String MENU_M = "M";
        String MENU_C = "C";
        String MENU_F = "F";
    }

    public interface Charset {
        String UTF_8 = "UTF-8";
    }

    /**
     * 定义一些常量的数字
     */
    public interface Num {

        Integer ZERO = 0;

        Integer ONE = 1;

        Integer TWO = 2;

        Integer THREE = 3;

        Integer FOUR = 4;

        Integer FIVE = 5;

        Integer SIX = 6;

        Integer SEVEN = 7;

        Integer EIGHT = 8;

        Integer NINE = 9;

        Integer TEN = 10;

        Integer ELEVEN = 11;

        Integer TWELVE = 12;

        Integer THIRTEEN = 13;

        Integer FOURTEEN = 14;

        Integer FIFTEEN = 15;

        Integer SIXTEEN = 16;

        Integer SEVENTEEN = 17;

        Integer EIGHTEEN = 18;

        Integer THIRTY_ONE = 31;

        Integer SIXTY_SIX = 66;

        Integer ONE_THOUSAND = 1000;

        Integer ONE_THOUSAND_AND_ONE = 1001;
    }


    /**
     * 定义一些请求方式
     */
    public interface ReqMethod {
        String PUT = "PUT";
        String GET = "GET";
        String POST = "POST";
        String DELETE = "DELETE";
        String OPTIONS = "OPTIONS";
    }

    /**
     * 请求方式
     */
    public interface ReqContentType{
        String CONTENT_JSON = "application/json;charset=UTF-8";
        String MULTIPART_FORM_DATA ="multipart/form-data";
    }

    /**
     * 请求返回结果
     * 1000开始定义
     * 1001 参数和url为空
     * 1002 请求接口异常
     * 1002 文件为空
     */
    public interface ReqResult{
        String PARAM_URL_NULL = "{\"code\":\"1001\",\"msg\":\"参数或者url为空\"}";
        String HTTP_REQ_FAIL =  "{\"code\":\"1002\",\"msg\":\"请求接口异常\"}";
        String FILE_REQ_FAIL =  "{\"code\":\"1003\",\"msg\":\"文件为空!\"}";
    }

    /**
     * 审核类型
     */
    public interface VerifyType{
        String VERIFY_TYPE_REGISTER = "register";

        String VERIFY_TYPE_UPDATE = "update";
    }

    /**
     * 语言
     */
    public interface Language{
        String ZH_CH = "zh-cn";
    }

    /**
     * excel表头信息
     */
    public interface ExcelHeader{

    }

    /**
     * excel文件信息
     */
    public interface ExcelFileName{
        String  STAFF_USER_TEMPLATE = "导入用户模板";
        String  ERR_STAFF_EXCEL= "异常员工信息";
    }


}
