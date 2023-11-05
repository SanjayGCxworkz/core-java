
import java.util.Scanner;
class AscendingAndDescendingOrder{

public static void printAscendingOrder(int[] numbersArray){  //method to print array in assending order
    System.out.println("Original array:");

    for (int num=0;num<numbersArray.length;num++){
        System.out.print(numbersArray[num]+" ");
    }


    for (int num=0;num<numbersArray.length;num++){
        for (int num2=num+1;num2<numbersArray.length;num2++){
            if (numbersArray[num]>numbersArray[num2]){
                int container=numbersArray[num];
                numbersArray[num]=numbersArray[num2];
                numbersArray[num2]=container;
            }
        }
    }

    System.out.println("\n"+"Given array in ascending order..:");
    for (int num=0;num<numbersArray.length;num++){
        System.out.print(numbersArray[num]+" ");
    }
}

public static void printDescendingOrder(int[] numbersArray){  //method to print array in descending order.
    for (int num=0;num<numbersArray.length;num++){
        for (int num2=num+1;num2<numbersArray.length;num2++){
           if (numbersArray[num]<numbersArray[num2]){
                int container=numbersArray[num];
                numbersArray[num]=numbersArray[num2];
                numbersArray[num2]=container;
            }
        }
    }

    System.out.println("\n"+"Given array in descending order..:");
    for (int num=0;num<numbersArray.length;num++){
        System.out.print(numbersArray[num]+" ");
    }
}

 public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size =sc.nextInt();
        int[] numbersArray=new int[size];

        System.out.println("Enter the values for an array:");
        for (int num=0;num<size;num++){
            numbersArray[num]=sc.nextInt();
        }

        printAscendingOrder(numbersArray);
        printDescendingOrder(numbersArray);
    }
}