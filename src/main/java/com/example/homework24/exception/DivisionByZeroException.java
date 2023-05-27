package com.example.homework24.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivisionByZeroException extends IllegalArgumentException{

    public DivisionByZeroException() {
    }

    public DivisionByZeroException(String s) {
        super(s);
    }
}
