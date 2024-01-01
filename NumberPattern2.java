import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size for pattern.");
        int size=scanner.nextInt();
        int num=1;
        for (int i = 0; i <size+1 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
//output:
//Enter the size for pattern.
//3
//
//1
//2 3
//4 5 6