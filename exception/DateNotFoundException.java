package com.xworkz.dmartapp.exception;

public class DateNotFoundException extends  Exception{
    public DateNotFoundException(String errorMsg){
        System.out.println(errorMsg);
    }
}
