import java.util.Scanner;

public class VowelsAndConsonantsInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string:");
        String str1=scanner.nextLine();
        System.out.println("Total length of string including whitespaces "+str1.length());
        int noOfVowels=0;
        int noOfConsonants=0;
        str1.toLowerCase();
        for (int num=0;num<str1.length();num++){
            if (str1.charAt(num)=='a'||str1.charAt(num)=='e'||str1.charAt(num)=='i'||str1.charAt(num)=='o'
                    ||str1.charAt(num)=='u'){
                noOfVowels++;
            } else if (str1.charAt(num)>='a'||str1.charAt(num)<='z') {
                noOfConsonants++;
            }
        }
        System.out.println("Number of vowels in string is "+noOfVowels);
        System.out.println("Number of consonants in string is "+noOfConsonants);
    }
}