import java.util.Scanner;

public class CountingSheeps{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter how many sheeps or size of array:");
        int size=scanner.nextInt();
        boolean[] attendance=new boolean[size];
        System.out.println("Enter attendance of sheeps:");
        for (int i = 0; i < size; i++) {
            attendance[i]=scanner.nextBoolean();
        }

        System.out.println("Attendance of sheeps");
        System.out.print("[");
        for (int a = 0; a < attendance.length; a++) {
            System.out.print(attendance[a]+ ", ");
        }
        System.out.print("]");
        int count=0;
        int absent=0;
        for (int num=0;num< attendance.length;num++){
            boolean isPresent=true;
            if (attendance[num]==isPresent){
                count++;
            }
            else{
                absent++;
            }
        }

        System.out.println("\n"+"Number of sheeps present:"+count);
        System.out.println("Number of sheeps absent:"+absent);
    }
}
