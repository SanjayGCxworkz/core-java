package com.xworkz.dmartapp;

import com.xworkz.dmartapp.exception.WeightNorFoundException;
import com.xworkz.dmartapp.supermarket.impl.DMartImpl;
import com.xworkz.dmartapp.products.Products;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
      
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many products to be added:");
        int size= scanner.nextInt();
        DMartImpl dMart=new DMartImpl();

        for (int i = 0; i < size; i++) {
            Products products=new Products();
            System.out.println("Enter product name: ");
            products.setProductName(scanner.next());

            System.out.println("Enter company name: ");
            products.setCompany(scanner.next());

            System.out.println("Enter expiry date:");
            products.setExpiryDate(scanner.next());

            System.out.println("Enter manufacturing date: ");
            products.setManufacturingDate(scanner.next());

            System.out.println("Enter price of product:");
            products.setPrice(scanner.nextDouble());

            System.out.println("Enter type of product:");
            products.setType(scanner.next());

            System.out.println("Enter product weight;");
            products.setNetWeight(scanner.nextInt());

            dMart.addProduct(products);
        }

        String input=null;

        do {
            System.out.println("press 1 to get details of the products: ");
            System.out.println("press 2 to get products details by name:");
            System.out.println("press 3 to delete product by name:");
            System.out.println("press 4 to update company name :");
            System.out.println("press 5 to get details by id:");
            System.out.println("press 6 to delete product by manufacturing date:");
            System.out.println("press 7 to get manufacturing date by name:");
            System.out.println("press 8 to get product details by expiry date:");
            System.out.println("press 9 to get product type by name:");
            System.out.println("press 10 to get product type by id:");
            System.out.println("press 11 to get product manufacturing and expiry date by id:");
            System.out.println("press 12 to get product price by name:");
            System.out.println("press 13 to get product product weight by name:");
            System.out.println("press 14 to get product id, price and weight by name:");
            System.out.println("press 15 to get type by company name:");

            int option=scanner.nextInt();
            switch (option){

                case 1:   dMart.getAllProductsDetails();
                    break;
                case 2:
                    System.out.println("Enter product name to get details:");
                    dMart.getProductDetailsByName(scanner.next());
                    break;
                case 3:
                    System.out.println("Enter product name to delete:");
                     dMart.deleteByName(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter old company name and new company name to update:");
                    dMart.updateCompanyNameByOldName(scanner.next(),scanner.next());
                    break;
                case 5:
                    System.out.println("Enter product id:");
                     dMart.getProductDetailsById(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Enter manufacturing date to delete the product:");
                    dMart.deleteByManufacturingDate(scanner.next());
                    break;
                case 7:
                    System.out.println("Enter product name to get manufacturing date:");
                   dMart.getManufacturingDateByName(scanner.next());
                    break;
                case 8:
                    System.out.println("Enter expiry date to get product details:");
                    dMart.getProductDetailsByExpiryDate(scanner.next());
                    break;
                case 9:
                    System.out.println("Enter product name to get type of product:");
                    dMart.getTypeByName(scanner.next());
                    break;
                case 10:
                    System.out.println("Enter product id to get its type:");
                    dMart.getTypeById(scanner.nextInt());
                    break;
                case 11:
                    System.out.println("Enter id to get product manufacturing date and expiry date :");
                    dMart.getManufacturingAndExpiryDate(scanner.nextInt());
                    break;
                case 12:
                    System.out.println("Enter product name to get price:");
                    dMart.getPriceByProductName(scanner.next());
                    break;
                case 13:
                    System.out.println("Enter product name to get its weight:");
                    try {
                        dMart.getWeightByName(scanner.next());
                    } catch (WeightNorFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 14:
                    System.out.println("Enter product name to get id, price and weight of product:");
                    dMart.getIdWeightAndPriceByName(scanner.next());
                    break;
                case 15:
                    System.out.println("Enter company name to get type");
                    dMart.getTypeByCompanyName(scanner.next());
                    break;
                default:
                    System.out.println("please press the correct options mentioned above:");
                    break;
            }
            System.out.println("do you want to continue..: Y/N");
            input=scanner.next();

        }while (input.equals("Y"));
        System.out.println("Thank you visit again:");
    }
}
