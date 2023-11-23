import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str1 = scanner.nextLine();
        String str2="";
        for (int i = str1.length(); i>0; i--) {
            str2=str2+str1.charAt(i-1);
        }

        System.out.println("String after reversing:"+str2);
    }
}
