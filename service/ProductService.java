package com.xworkz.service;

import com.xworkz.dto.ProductDetails;

public interface ProductService {

    void insertMethod(ProductDetails productDetails);

    void updateCompanyByProduct(String name,String newCompany);

    void deleteByName(String name);

    void getProductDetailsByName(String name);

    void getAllProducts();

    void deleteById(int id);
    void getProductDetailsById(int id);
}
