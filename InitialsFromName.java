import java.util.Scanner;

public class InitialsFromName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name..");

        String name= scanner.nextLine();
        name=name.toUpperCase();
        name=" "+name;
        System.out.println("Name initials: ");
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)==' ') {
                System.out.print(name.charAt(i+1)+".");
            }
        }


    }
}
