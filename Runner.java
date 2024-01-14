package com.xworkz.wildlife;

import com.xworkz.wildlife.service.AnimalService;
import com.xworkz.wildlife.service.WildlifeService;

import java.util.Scanner;

public class Runner {
    static Scanner sc=new Scanner(System.in);
    static WildlifeService wildlifeService=new AnimalService();
    public static void takingInput(){
        System.out.println("enter the animal name.");
        String name=sc.next();
        System.out.println("enter animal age.");
        int age= sc.nextInt();
        System.out.println("enter animal weight.");
        int weight= sc.nextInt();
        wildlifeService.validateAndInsert(name,age,weight);

    }

   static int option=0;
    static String op=null;
    public static void main(String[] args) {

        do {
            System.out.println("to insert data enter 1.");
            System.out.println("to get all animals details enter 2.");
            System.out.println("to get animal details by name enter 3.");
            System.out.println("to delete animal details by name enter 4.");
            System.out.println("to update animal age by name enter 5.");
            option=sc.nextInt();

            switch (option){
                case 1: takingInput();
                    break;
                case 2:wildlifeService.getAllAnimalsDetails();
                break;
                case 3:
                    System.out.println("enter animal name.");
                    wildlifeService.getAnimalDetailsByName(sc.next());
                    break;
                case 4:
                    System.out.println("enter animal name to delete");
                    wildlifeService.validateAndDelete(sc.next());
                    break;
                case 5:
                    System.out.println("enter name and age to update");
                    wildlifeService.validateAndUpdate(sc.next(), sc.nextInt());
                    break;
                default:
                    System.out.println("enter correct option!");
                    break;
            }

            System.out.println("do you want to continue. press y");
             op= sc.next();
        }while (op.equals("y")) ;



    }
}
