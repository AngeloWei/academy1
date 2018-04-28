package com.cnacademy.dto;

import java.io.Serializable;

public class ComResult implements Serializable {

    private Integer code;
    private String msg;
    private Object object;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ComResult(Integer code, String msg, Object object) {
        this.code = code;
        this.msg = msg;
        this.object = object;
    }

    public ComResult(Integer code) {
        this.code = code;
    }

    public ComResult(Integer code, String msg) {

        this.code = code;
        this.msg = msg;
    }
    public static ComResult ok() {
        return new ComResult(REnum.RESULT_SUCCESS.getCode(), REnum.RESULT_SUCCESS.getMsg());
    }

    public static ComResult ok(Object o) {
        return new ComResult(REnum.RESULT_SUCCESS.getCode(), REnum.RESULT_SUCCESS.getMsg(), o);
    }

    public static ComResult bad() {
        return new ComResult(REnum.RESULT_FAIL.getCode(), REnum.RESULT_FAIL.getMsg());
    }

    public static ComResult common(REnum rEnum) {
        return new ComResult(rEnum.getCode(), rEnum.getMsg());
    }
    public static ComResult common(REnum rEnum,Object o) {
        return new ComResult(rEnum.getCode(), rEnum.getMsg(),o);
    }
}
