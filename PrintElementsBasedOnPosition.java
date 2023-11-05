import java.util.Scanner;

public class PrintElementsBasedOnPosition{
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

        System.out.println("Elements in odd position:");
        for (int num=0;num<numbersArray.length;num=num+2){
            System.out.print(numbersArray[num]+" ");
        }

        System.out.println("Elements in even position:");
        for (int num=1;num<numbersArray.length;num=num+2){
            System.out.print(numbersArray[num]+" ");
        }
   }
}
