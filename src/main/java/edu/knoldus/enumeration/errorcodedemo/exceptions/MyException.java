package edu.knoldus.enumeration.errorcodedemo.exceptions;

import lombok.Getter;

@Getter
public class MyException extends RuntimeException {
    private static final String INTERNAL_MESSAGE = "Generated my exception with error code = ";
    public final String errorCode = ErrorCode.MY_EXCEPTION.getError();
    
    public MyException() {
        super(INTERNAL_MESSAGE);
    }
    
}
