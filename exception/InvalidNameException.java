package com.xworkz.dmartapp.exception;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(String errorMsg){
        System.out.println(errorMsg);
    }
}
