package com.xworkz.dmartapp.supermarket.impl;

import com.xworkz.dmartapp.exception.*;
import com.xworkz.dmartapp.products.Products;
import com.xworkz.dmartapp.supermarket.SuperMarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DMartImpl implements SuperMarket {

    int id = 0;
    List<Products> products = new ArrayList<>();


    @Override
    public boolean addProduct(Products product) {
        boolean isAdded = false;

        if (product != null) {
            this.products.add(product);
            product.setId(++id);

        }


        return isAdded;
    }

    @Override
    public void getAllProductsDetails() {
        System.out.println("getAllProductsDetails method is invoked:");
        for (Products product : products
        ) {
            System.out.println(product);
        }

    }

    @Override
    public String getProductDetailsByName(String name) {
        String pro = null;
        System.out.println("getProductDetailsByName method is invoked:");
        try {
            for (Products product : products
            ) {
                if (product.getProductName().equals(name)) {
                    pro = product.getProductName();
                    System.out.println(product);
                }
            }
            if (pro == null) {
                ProductNotFoundException productNotFoundException = new
                        ProductNotFoundException("Product not found...!");

                throw productNotFoundException;

            }
        } catch (ProductNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return pro;
    }


    @Override
    public void deleteByName(String name) {
        System.out.println("deleteByName method is invoked:");
        

        Iterator<Products> iterator = products.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getProductName().equals(name)) {
                iterator.remove();
            }
        }

    }



    @Override
    public void updateCompanyNameByOldName(String oldName, String newName) {
        System.out.println("updateCompanyNameByOldName method is  invoked:");
        for (Products product:products
             ) {
            if (product.getProductName().equals(oldName)){
                product.setCompany(newName);
            }
        }
        getAllProductsDetails();
    }

    @Override
    public String getProductDetailsById(int id) {
        String name=null;

        System.out.println("getProductDetailsById method is invoked:");
       try {
           for (Products product:products
                ) {
               if (product.getId()==id){
                   name=product.getProductName();
                   System.out.println(product);

               }
           }
           if (name==null){
               ProductNotFoundException productNotFoundException=new
                       ProductNotFoundException("Product not found...!");

               throw productNotFoundException;

           }
       }catch (ProductNotFoundException e){

           System.out.println(e);
           e.printStackTrace();

       }

        return name;
    }

    @Override
    public void deleteByManufacturingDate(String date) {
        System.out.println("deleteByManufacturingDate method is invoked:");

         Iterator<Products> iterator =     products.iterator();
         while (iterator.hasNext()){
                       if(iterator.next().getManufacturingDate().equals(date)){
                           iterator.remove();
                       }
         }
    }



    @Override
    public String getProductDetailsByExpiryDate(String expiry) {
        String name=null;
        System.out.println("getProductDetailsByExpiryDate method is invoked:");
        try {
            for (Products product:products
                 ) {
                if (product.getExpiryDate().equals(expiry)) {
                name=product.getProductName();
                    System.out.println(product);
            }
                if (name==null){
                    ProductNotFoundException productNotFoundException=new
                            ProductNotFoundException("Product not found...!");

                    throw productNotFoundException;

                }
            }
        }catch (ProductNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return name;
    }
@Override
    public String getManufacturingDateByName(String name) {
    String date=null;
        System.out.println("getManufacturingDateByName method is invoked:");
        try {
            for (Products product:products
                 ) {
                if (product.getProductName().equals(name)){
                    date=product.getManufacturingDate();
                    System.out.println(product.getManufacturingDate());
                }
            }
            if (date==null){
                DateNotFoundException dateNotFoundException=
                        new DateNotFoundException("Manufacturing date not found...!");
                throw dateNotFoundException;
            }
        }catch (DateNotFoundException e){
            System.out.println(e);
        }
    return date;
}

    @Override
    public String getTypeByName(String name) {
        String typeOf=null;
        System.out.println("getTypeByName method is invoked:");
        try {
            for (Products product:products
                 ) {
                if (product.getProductName().equals(name)) {
                    typeOf=product.getType();
                    System.out.println(product.getType());

                }
            }
            if (typeOf==null) {
                TypeNotFoundException typeNotFoundException=
                        new TypeNotFoundException("Type not found please enter valid input..!");
                throw  typeNotFoundException;
            }
        }catch (TypeNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return typeOf;
    }




    @Override
    public String getManufacturingAndExpiryDate(int id) {
        String date=null;
        System.out.println("getManufacturingAndExpiryDate method is invoked:");
       try {
           for (Products product:products
                ) {
               if (product.getId()==id){
                   date=product.getExpiryDate();
                   System.out.println(product.getExpiryDate()+" "+product.getManufacturingDate());
               }
           }
           if (date==null){
               DateNotFoundException dateNotFoundException=
                       new DateNotFoundException("Manufacturing and expiry date not found...!");
               throw dateNotFoundException;
           }
       }catch (DateNotFoundException e){
           System.out.println(e);
           e.printStackTrace();
       }
        return date;
    }

    @Override
    public double getPriceByProductName(String name) {
        double priceVal=0.0;
        System.out.println("getPriceByProductName method is invoked:");
       try {
           for (Products product :products
                ) {
               if (product.getProductName().equals(name)) {
                   priceVal=product.getPrice();
                   System.out.println(product.getPrice());

               }
           }
           if (priceVal==0.0){
               PriceNotFoundException priceNotFoundException=
                       new PriceNotFoundException("Price not found..!");
               throw  priceNotFoundException;
           }
       }catch (PriceNotFoundException e){
           System.out.println(e);
           e.printStackTrace();
       }
        return priceVal;
    }
    @Override
    public String getTypeById(int id) {
        String typeOf=null;
        System.out.println("getTypeById method is invoked:");
        try {
            for (Products product:products
                 ) {
                if (product.getId()==id){
                    typeOf=product.getType();
                    System.out.println(product.getType());
                }
            }
            if (typeOf==null) {
                TypeNotFoundException typeNotFoundException=
                        new TypeNotFoundException("Type not found please enter valid input..!");
                throw  typeNotFoundException;
            }
        }catch (TypeNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return typeOf;
    }
    @Override
    public void getWeightByName(String name) throws WeightNorFoundException{

        System.out.println("getWeightByName method is invoked:");

        for (Products product:products
             ) {
            if (product.getProductName().equals(name)){
                System.out.println("weight:"+product.getNetWeight());
            }
        }




    }

    @Override
    public double getNameWeightAndPriceById(int id) {
        double priceVal=0;
        System.out.println("getNameWeightAndPriceById method is invoked:");
      try {
          for (Products product:products
               ) {
              if (product.getId()==id){
                  priceVal=product.getPrice();
                  System.out.println(product.getId()+" "+product.getProductName()+" "+product.getNetWeight());
              }
          }

              if (priceVal==0.0){
                  PriceNotFoundException priceNotFoundException=
                          new PriceNotFoundException("Price not found..!");
                  throw  priceNotFoundException;
              }

      }catch (PriceNotFoundException e){
          System.out.println(e);
          e.printStackTrace();
      }
        return priceVal;
    }
    @Override
    public double getIdWeightAndPriceByName(String name) {
        double priceVal=0;
        System.out.println("getIdWeightAndPriceByName method is invoked:");
      try {
          for (Products product:products
               ) {
              if (product.getProductName().equals(name)){
                  priceVal=product.getPrice();
                  System.out.println(product.getId()+" "+product.getNetWeight());
              }
          }
          if (priceVal==0.0){
              PriceNotFoundException priceNotFoundException=
                      new PriceNotFoundException("Price not found..!");
              throw  priceNotFoundException;
          }
      }catch (PriceNotFoundException e){
          System.out.println(e);
          e.printStackTrace();
      }
        return priceVal;
    }
    @Override
    public String getTypeByCompanyName(String name) {
        System.out.println("getTypeByCompanyName method is invoked:");
        String typeOf=null;
        try {
            for (Products product :products
                 ) {
                if (product.getCompany().equals(name)){
                    typeOf=product.getType();
                    System.out.println(product.getType());
                }
            }
            if (typeOf==null) {
               TypeNotFoundException typeNotFoundException=
                       new TypeNotFoundException("Type not found please enter valid input..!");
               throw  typeNotFoundException;
            }
        } catch (TypeNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return typeOf;
    }


}
