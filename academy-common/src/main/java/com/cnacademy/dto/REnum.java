package com.cnacademy.dto;
/**
 * 定义通用的错误码
 */
public enum REnum {
    RESULT_SUCCESS(0, "option success"),
    RESULT_FAIL(3, "something wrong"),

    SERVICE_INSERT_ERR(3001, "insert fail"),
    SERVICE_UPDATE_ERR(3002, "update fail"),
    SERVICE_DELETE_ERR(3003, "delete fail"),
    ;
    private Integer code;
    private String msg;

    REnum(Integer code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(Integer code) {

        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
