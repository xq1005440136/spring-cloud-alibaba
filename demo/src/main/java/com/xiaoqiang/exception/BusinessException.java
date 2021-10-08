package com.xiaoqiang.exception;

/**
 * @Author xiaoqiang
 * @Date 2021/10/8 0008 11:26
 * @Version 1.0
 */

public class BusinessException extends RuntimeException {
    private Integer code;
    private String message;
    public  BusinessException(String message){
        super(message);

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
