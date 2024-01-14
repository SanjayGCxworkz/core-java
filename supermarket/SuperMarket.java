package com.xworkz.dmartapp.supermarket;

import com.xworkz.dmartapp.exception.WeightNorFoundException;
import com.xworkz.dmartapp.products.Products;

public interface SuperMarket {

    public boolean addProduct(Products product);

    public void getAllProductsDetails();

    public String getProductDetailsByName(String name);

    public void deleteByName(String name);

    public void updateCompanyNameByOldName(String oldName,String newName);

    String getProductDetailsById(int id);

    void deleteByManufacturingDate(String date);

    String getProductDetailsByExpiryDate(String expiry);

    String getManufacturingDateByName(String name);

    String getTypeByName(String name);

    String getTypeById(int id);

    String getManufacturingAndExpiryDate(int id);

    double getPriceByProductName(String name);

    void getWeightByName(String name) throws WeightNorFoundException;

    double getNameWeightAndPriceById(int id);

    double getIdWeightAndPriceByName(String name);

    String getTypeByCompanyName(String name);
}
