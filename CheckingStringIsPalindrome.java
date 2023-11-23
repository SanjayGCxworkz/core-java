import java.util.Scanner;

public class CheckingStringIsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str1 = scanner.nextLine();

        String str2="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            str2=str2+str1.charAt(i);
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(str1+" and "+str2+" are palindrome.");
        }else {
            System.out.println(str1+" and "+str2+" are not palindrome.");
        }
    }
}
