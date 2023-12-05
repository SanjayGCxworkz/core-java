package com.xworkz.collection;

import java.util.Scanner;

public class TargetProgram1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=scanner.nextInt();
        int[] numbersArray=new int[size];


        System.out.println("Enter elements for Array:");
        for (int i = 0; i < size; i++) {
            numbersArray[i]=scanner.nextInt();
        }

        System.out.println("Original Array:");
        for (int numbers :numbersArray) {
            System.out.print(numbers+" ");
        }
        System.out.println("\n"+"Enter the target number:");
        int target=scanner.nextInt();

        System.out.println("Index are: ");
        for (int first=0;first< numbersArray.length;first++){
            for (int second=first+1;second<numbersArray.length;second++){
                if (numbersArray[first]*numbersArray[second]==target){
                    System.out.println("[ "+first+" , "+second+" ]");

                }

            }
            if (numbersArray[first]==target){
                System.out.println("[ "+first+" ]");
            }
        }

    }
}
