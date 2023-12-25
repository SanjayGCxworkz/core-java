import java.util.Scanner;

public class AlphabetPatternProgram1 {
    public static void main(String[] args) {

        char character='A';
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter pattern size ...");
        int size=scanner.nextInt();
        System.out.println("-----------------------------"+"\n"+"sub pattern 1");
        for (int i = 1; i <= size; i++) {    //iterating rows
            for (int j = 1; j <=i ; j++) {      // iterating columns
                System.out.print(character+" ");
            }
            System.out.println();// jump to next line
            character++;
        }
        System.out.println("-------------------------------"+"\n"+"sub pattern 2");
        for (int i = 1; i <=size; i++) {
            character='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(character+" ");
                character++;
            }
            System.out.println();
        }
        System.out.println("--------------------------------"+"\n"+"sub pattern 3");
        for (int i = 1; i <=size; i++) {
            character='A';
            for (int j = size; j>=i ; j--) {
                System.out.print(character+" ");
                character++;
            }
            System.out.println();
        }
        System.out.println("--------------------------------"+"\n"+"sub pattern 4");

        for (int i = 1; i <=size; i++) {
            character='A';
            for (int j = 1 ; j<=size ; j++) {
                if (i==j || i<j){
                    System.out.print(character+" ");
                    character++;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------"+"\n"+"sub pattern 5");
        for (int i = 1; i <=size; i++) {
            character='A';
            for (int j = 1 ; j<=size ; j++) {
                if (i==j || i==1 || j==size){
                    System.out.print(character+" ");
                    character++;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
