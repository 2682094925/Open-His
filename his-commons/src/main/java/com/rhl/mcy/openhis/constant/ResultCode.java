package com.rhl.mcy.openhis.constant;

/**
 * 状态码定义：
 * <br/>
 * <table border="1">
 * <tr>
 *    <th>状态码</th>
 *    <th>说明</th>
 * </tr>
 * <tr>
 *    <td>1</td>
 *    <td>访问成功</td>
 * </tr>
 * <tr>
 *    <td>10xx</td>
 *    <td>系统级的错误，例如1002表示服务器内部错误</td>
 * </tr>
 * <tr>
 *     <td>aabbxxx</td>
 *     <td>业务状态码，aa是模块代号，从20开始；bb是子模块代号，从00开始；xxx是具体的状态码</td>
 * </tr>
 * </table>
 */
public enum ResultCode {

    /**
     * 1, 操作成功
     */
    SUCCESS(1, "操作成功"),

    /**
     * 1002, 服务器内部错误
     */
    INTERNAL_ERROR(1002, "服务器内部错误"),

    /**
     * 1003, 非法的访问类型
     */
    INVALID_ACCESS(1003, "非法的访问"),

    /**
     * 1004, 身份认证失败
     */
    AUTH_FAILED(1004, "身份认证失败"),
    
    /**
     * 1005 alert统一错误相应
     */
    ALERT_ERROR(1005,"alert统一错误相应"),

    /**
     * 1006, 没有数据改变，请使用缓存
     */
    NO_DATA_CHANGE(1006, "没有数据改变，请使用缓存"),

    /**
     * 1007, 防护码失败
     */
    PROTECTCODE_ERROR(1007, "防护码失败"),

    /**
     * 1008, 参数错误
     */
    PARAM_ERROR(1008, "参数错误"),
    
    /**
     * 1009, 服务器开小差，请稍后再试
     */
    SERVER_ERROR(1009, "服务器开小差，请稍后再试"),
    
    /**
     * 1010, 请求频繁，请稍后再试
    */
    REPETITION_ERROR(1010, "请求频繁，请稍后再试"),

    /**
     * 1997, token错误
     */
    CSRF_CODE_ERROR(1997, "token错误"),
    /**
     * 303, 图形验证码错误
     */
    VERIFYCODE_IMAGE_ERROR(303, "图形验证码错误"),
	
    FLOW_SENTINEL_ERROR(508, "当前访问人数较多，请稍后重试");
	
    private int state;
    private String message;

    ResultCode(int state) {
        this(state, null);
    }

    ResultCode(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

}