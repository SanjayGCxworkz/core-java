package com.xworkz.dmartapp.exception;

public class TypeNotFoundException extends RuntimeException{
    public TypeNotFoundException(String errMsg){
        System.out.println(errMsg);
    }
}
