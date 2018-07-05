package com.smmot.suamo.core;

/**
 * Created by adams on 2017/4/19.
 */
public class ReturnBean {
    /**
     * 查询成功代码
     */
    public static final String CODE_SUCCESS = "200";
    /**
     * 用户登录超时报错
     */
    public static final String CODE_FAIL = "201";
    /**
     * 类型已存在
     */
    public static final String CODE_FAIL_TYPE = "202";


    /**
     * 返回码
     */
    private  String code;
    /**
     * 返回描述
     */
    private String message;

    /**
     * 返回数据值
     */
    private Object datas = new Object();

    public ReturnBean(String code, String mmessage, Object datas) {
        super();
        this.code = code;
        this.message = mmessage;
        this.datas = datas;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMmessage() {
        return message;
    }
    public void setMmessage(String mmessage) {
        this.message = mmessage;
    }
    public Object getDatas() {
        return datas;
    }
    public void setDatas(Object data) {
        this.datas = datas;
    }
}
