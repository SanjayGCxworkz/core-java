import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size for pattern.");
        int size=scanner.nextInt();
        for (int i = 0; i <size+1 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(j+1+" ");

            }
            System.out.println();
        }
        scanner.close();
    }
}

//output:
//1
//1 2
//1 2 3
//1 2 3 4
