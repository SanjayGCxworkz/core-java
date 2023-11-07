import java.util.Scanner;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter sentence..");

        String sentence= scanner.nextLine();
        sentence=sentence.toLowerCase();
        System.out.println("Frequency of each character in given sentence...");
        System.out.println("Character | Frequency");
        for (char character='a';character<='z';character++){
            int count=0;
           for (int i=0;i<sentence.length();i++){

               if (character==sentence.charAt(i)){
                  count++;
               }
           }
           if (count!=0){
               System.out.println("      "+character+"   |  "+count+"  ");
           }
        }


    }
}
