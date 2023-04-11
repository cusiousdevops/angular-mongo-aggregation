package com.example.mongoaggregation.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class DAOException extends Exception{
    public DAOException() {super();}

    public DAOException(String s) {super();}
}
