import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheckingProgram{
    public static void checkingAnagrams(String firstWord,String secondWord){
        String string1=firstWord.replaceAll("\\s","");
        String string2=secondWord.replaceAll("\\s","");

        boolean check=true;
        if (string1.length()!=string2.length()){
            check=false;
        }
        else {
            char[] firstArray=string1.toLowerCase().toCharArray();
            char[] secondArray=string2.toLowerCase().toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            check=Arrays.equals(firstArray,secondArray);
        }

        if (check){
            System.out.println(firstWord+" and "+secondWord+" are anagrams");
        }else {
            System.out.println(firstWord+" and "+secondWord+" are anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String firstWord=scanner.next();
        System.out.println("Enter second string:");
        String secondWord=scanner.next();

        checkingAnagrams(firstWord,secondWord);

    }
}
