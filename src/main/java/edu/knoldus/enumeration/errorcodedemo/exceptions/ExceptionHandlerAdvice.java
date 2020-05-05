package edu.knoldus.enumeration.errorcodedemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    
    @ExceptionHandler(value = {MyException.class})
    public ResponseEntity<String> handleMyException(
            MyException myException) {
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                .body(myException.getMessage() + myException.getErrorCode());
    }
}
