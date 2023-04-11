package com.example.mongoaggregation.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ServiceException extends Exception{
    public ServiceException() {super();}

    public ServiceException(String s) {super();}
}
