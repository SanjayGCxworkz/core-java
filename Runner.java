package com.xworkz;

import com.xworkz.dto.ProductDetails;
import com.xworkz.service.ProductService;
import com.xworkz.service.ProductServiceImpl;

import java.util.Scanner;

public class Runner {
    static Scanner sc=new Scanner(System.in);
    static ProductService productService=new ProductServiceImpl();
    public static void data(){
        System.out.println("enter product name: ");
        String name= sc.next();
        System.out.println("enter company name: ");
        String company= sc.next();
        System.out.println("enter price: ");
        double price=sc.nextDouble();
        System.out.println("enter manufacture data: ");
        String mData=sc.next();
        System.out.println("enter expiry data: ");
        String exDate=sc.next();
        productService.insertMethod(new ProductDetails(name,company,mData,exDate,price));
    }

    public static void main(String[] args) {
        int option;
        String again;
        do {
            System.out.println("press 1 to insert data to db");
            System.out.println("press 2 to get All Products Details");
            System.out.println("press 3 to get Product Details By Name");
            System.out.println("press 4 to get product details by id");
            System.out.println("press 5 to delete product by name");
            System.out.println("press 6 to delete product by id");
            System.out.println("press 7 to update company name by product name");
            option= sc.nextInt();
            switch(option){
                case 1:data();
                    break;
                case 2: productService.getAllProducts();
                    break;
                case 3:
                    System.out.println("enter product name to get its details.");
                    productService.getProductDetailsByName(sc.next());
                    break;
                case 4:
                    System.out.println("enter product id to get its details.");
                    productService.getProductDetailsById(sc.nextInt());
                    break;
                case 5:
                    System.out.println("enter product name to delete its details.");
                    productService.deleteByName(sc.next());
                    break;
                case 6:
                    System.out.println("enter product id to delete its details");
                    productService.deleteById(sc.nextInt());
                    break;
                case 7:
                    System.out.println("enter product name and new company name to update");
                    productService.updateCompanyByProduct(sc.next(), sc.next());
                    break;
                default:
                    System.out.println("please press the proper input as mentioned above.");
                    break;
            }
            System.out.println("enter y to continue");
            again= sc.next();

        }while (again.equals("y"));
        System.out.println("thank you!!!!!!!!!!!");
    }
}
