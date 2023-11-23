import java.util.Scanner;

public class OneStringRotationOfAnother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string..");
        String firstString=scanner.nextLine();
        System.out.println("Enter second string..");
        String secondString=scanner.nextLine();
        boolean isChecked=false;
        String checkingString=null;
        if (firstString.length()==secondString.length()){
            checkingString=firstString+firstString;
            firstString.contains(secondString);
            isChecked=true;
        }

        if (isChecked){
            System.out.println(firstString+" is rotation of "+secondString);
        }
        else {
            System.out.println(firstString+" is not rotation of "+secondString);
        }
    }
}
