package com.xworkz.dmartapp.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
