import java.util.Scanner;

public class NumberOfCharactersInSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str1 = scanner.nextLine();

        String[] stringArray=str1.split(" ");
        String[] original=stringArray;
        int[] numberArray=new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            int count=0;
            count=stringArray[i].length();
            numberArray[i]=count;
        }
        System.out.println("Number of characters in each substrings:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]+"="+numberArray[i]);
        }
    }
}