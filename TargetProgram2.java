package com.xworkz.collection;

import java.util.Scanner;

public class TargetProgram2 {
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
                for (int third = second+1; third < numbersArray.length; third++) {
                    if (numbersArray[first]+numbersArray[second]+numbersArray[third]==target){
                        System.out.println("[ "+first+" , "+second+" , "+third+" ]");

                    }
                }

            }
            if (numbersArray[first]==target){
                System.out.println("[ "+first+" ]");
            }
        }

    }
}
//Enter size of an array:
//6
//Enter elements for Array:
//1
//2
//3
//4
//5
//6
//Original Array:
//1 2 3 4 5 6
//Enter the target number:
//6
//Index are:
//[ 0 , 1 , 2 ]
//[ 5 ]
