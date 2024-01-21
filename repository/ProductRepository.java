package com.xworkz.repository;

import com.xworkz.dto.ProductDetails;

public interface ProductRepository {

    void insertProductDetails(ProductDetails productDetails);

    void updateCompanyNameByProductName(String name,String newCompany);

    void deleteByName(String name);

    void getProductDetailsByName(String name);

    void getAllProductsDetails();

    void getProductDetailsById(int id);

    void deleteProductById(int id);
}
