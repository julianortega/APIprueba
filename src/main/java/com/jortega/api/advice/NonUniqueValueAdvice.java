package com.jortega.api.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jortega.api.exceptions.NonUniqueValueException;

@ControllerAdvice
public class NonUniqueValueAdvice {

    @ResponseBody
    @ExceptionHandler(NonUniqueValueException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String nonUniqueValueHandler(NonUniqueValueException ex) {
        return ex.getMessage();
    }
}
