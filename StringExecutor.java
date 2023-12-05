package com.xworkz.collection;

import java.util.Scanner;

public class StringExecutor {

    public static void firstOutput(String name1,String name2){
        char[] ch=name1.toLowerCase().toCharArray();
        char[] ch1=name2.toUpperCase().toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i]==' ') {
                ch[i+1]=ch1[i+1];
            }
        }
        System.out.println("output-1");
        for (char c:ch
        ) {
            System.out.print(c);
        }

    }

    public static void secondOutput(String name1,String name2){
        char[] ch=name1.toLowerCase().toCharArray();
        char[] ch1=name2.toUpperCase().toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i]==' ') {
                ch1[i+1]=ch[i+1];
            }
        }
        System.out.println("\n"+"output-2");
        for (char c:ch1
        ) {
            System.out.print(c);
        }

    }

    public static void thirdOutput(String name1,String name2){
        char[] ch=name1.toLowerCase().toCharArray();
        char[] ch1=name2.toUpperCase().toCharArray();
        for (int i = 0; i < ch1.length; i=i+2) {
            ch[i]=ch1[i];
        }
        System.out.println("\n"+"output-3");
        for (char c:ch
        ) {
            System.out.print(c);
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String name= scanner.nextLine();
        System.out.println("original string: "+ name);
        String name1=" "+name;
        String name2=" "+name;
        firstOutput(name1,name2);
        secondOutput(name1,name2);
        thirdOutput(name1,name2);
        }

    }

