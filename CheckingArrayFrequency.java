import java.util.Scanner;

public class CheckingArrayFrequency{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=scanner.nextInt();
        int[] numbersArray=new int[size];
        int[] frequencyArray=new int[size];

        System.out.println("Enter elements for Array:");
        for (int i = 0; i < size; i++) {
            numbersArray[i]=scanner.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]+" ");
        }

        int isChecked=-1;
        for (int i = 0; i < numbersArray.length; i++) {
            int count=1;
            for (int j=i+1;j< numbersArray.length;j++){

                if (numbersArray[i]==numbersArray[j]){
                    count++;
                    numbersArray[j]=isChecked;
                }
            }

            if (numbersArray[i]!=isChecked){
                frequencyArray[i]=count;
            }
        }
        System.out.println("\n"+"Element|frequency");
        for (int i = 0; i < frequencyArray.length; i++) {
            if (numbersArray[i]!=isChecked)
                System.out.println(" "+numbersArray[i]+"     "+"|"+"     "+frequencyArray[i]);
        }
    }
}
