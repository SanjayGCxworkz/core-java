package com.xworkz.emarketapp;

import com.xworkz.emarketapp.flipkart.FlipKartApplication;
import com.xworkz.emarketapp.users.Users;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        FlipKartApplication flipKartApplication=new FlipKartApplication(size);

        for (int num=0;num<size;num++){
            Users users=new Users();
            System.out.println("Enter user name:");
            users.setUserName(sc.next());

            System.out.println("Enter user address:");
            users.setAddress(sc.next());

            System.out.println("Enter gender:");
            users.setGender(sc.next());

            System.out.println("Enter user email:");
            users.setEmail(sc.next());

            System.out.println("Enter phone number:");
            users.setPhoneNumber(sc.nextLong());

            System.out.println("Enter age:");
            users.setAge(sc.nextInt());

            System.out.println("Enter passward: ");
            users.setPassward(sc.next());

            System.out.println("Enter confirm passward:");
            users.setConfirmPassward(sc.next());

            System.out.println("Enter debit card number:");
            users.setDebitCard(sc.next());

            flipKartApplication.addUserDetails(users);
        }
        String input=null;

        do {
            System.out.println("press 1 to get all users details:");
            System.out.println("press 2 to update age by id:");
            System.out.println("press 3 to delete any user by id:");
            System.out.println("press 4 to get user information by id:");

            int option= sc.nextInt();
            switch (option){
                case 1:flipKartApplication.getAllDetailsOfUsers();
                break;

                case 2:
                    System.out.println("Enter id and new age:");
                    flipKartApplication.updateAgeById(sc.nextInt(), sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter user id to delete:");
                    flipKartApplication.deleteById(sc.nextInt());
                    break;

                case 4:System.out.println("Enter user id to get information of respective user:");
                    flipKartApplication.getUserInformationById(sc.nextInt());
                    break;
                default:
                    System.out.println("choose correct option from above:");
                    break;


            }
            System.out.println("Do you want to continue press Y or else  N:");
            input=sc.next();

        }while (input.equals("Y"));
        System.out.println("Thank you for using visit again:");


    }
}
