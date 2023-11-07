


import java.util.Scanner;

public class ArrayElementsRotating {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size ;


        System.out.println("Enter size of an array:");
        size=scanner.nextInt();

        int[] numbersArray=new int[size];
        int[] originalArray=new int[size];
        System.out.println("Enter elements of an array:");
        for (int i=0;i<size;i++){
           int element=scanner.nextInt();
            numbersArray[i]=element;
            originalArray[i]=element;
        }
        System.out.println("Original array:");
        for (int num=0;num<numbersArray.length;num++){
            System.out.print(numbersArray[num]+" ");

        }


        System.out.println("\n"+"Enter number of times you want to rotate an array:");
        int times=scanner.nextInt();

        for (int index=0;index<times;index++){
            int newIndex,lastElement;
            lastElement=numbersArray[numbersArray.length-1];

            for (newIndex=numbersArray.length-1;newIndex>0;newIndex--){
                numbersArray[newIndex]=numbersArray[newIndex-1];
            }

            numbersArray[0]=lastElement;
        }

        System.out.println("Array after "+times+" time right side  rotated:");
        for (int num=0;num<numbersArray.length;num++){
            System.out.print(numbersArray[num]+" ");
        }


        for (int i = 0; i < times; i++) {
            int firstNumber,index;
            firstNumber=originalArray[0];
            for (index=0;index< originalArray.length-1;index++){
                originalArray[index]=originalArray[index+1];
            }
            originalArray[originalArray.length-1]=firstNumber;
        }

        System.out.println("\n"+"Array after "+times+" time rotated left side:");
        for (int num=0;num< originalArray.length;num++){
            System.out.print(originalArray[num]+" ");
        }
    }
}
