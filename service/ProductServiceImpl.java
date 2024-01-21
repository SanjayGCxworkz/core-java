package com.xworkz.service;

import com.xworkz.dto.ProductDetails;
import com.xworkz.repository.ProductImpl;
import com.xworkz.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository=new ProductImpl();
    @Override
    public void insertMethod(ProductDetails productDetails) {
        if (productDetails!=null){
            productRepository.insertProductDetails(productDetails);
        }
    }

    @Override
    public void updateCompanyByProduct(String name, String newCompany) {
        if (name!=null && !name.isEmpty() && newCompany!=null && !newCompany.isEmpty()){
            productRepository.updateCompanyNameByProductName(name,newCompany);
        }
    }

    @Override
    public void deleteByName(String name) {
        if (name!=null&& !name.isEmpty()){
            productRepository.deleteByName(name);
        }
    }

    @Override
    public void getProductDetailsByName(String name) {
        if (name!=null && !name.isEmpty()){
            productRepository.getProductDetailsByName(name);
        }
    }

    @Override
    public void getAllProducts() {
        productRepository.getAllProductsDetails();
    }

    @Override
    public void deleteById(int id) {
        if (id!=0){
            productRepository.deleteProductById(id);
        }
    }

    @Override
    public void getProductDetailsById(int id) {
        if (id!=0){
            productRepository.getProductDetailsById(id);
        }
    }
}
