package edu.knoldus.enumeration.errorcodedemo.exceptions;

import lombok.Getter;

@Getter
public enum ErrorCode {
    MY_EXCEPTION("01", MyException.class);
    
    private final String error;
    
    private final Class<? extends Throwable> tClass;
    
    ErrorCode(String code, Class<? extends Throwable> tClass) {
        this.error = "error-code::" + code;
        this.tClass = tClass;
    }
    
    @Override
    public String toString() {
        return error;
    }
}
