package com.xworkz.dmartapp.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Products {
    private String  productName;
    private String expiryDate;
    private String manufacturingDate;
    private double price;
    private String company;
    private int netWeight;
    private String type ;
    private int id;

    public Products(){

    }
}
