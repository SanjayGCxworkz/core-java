import java.util.Scanner;

public class CharacterFrequencyInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string:");
        String str1=scanner.nextLine();
        char[] charArray=str1.toCharArray();
        int[] frequency=new int[charArray.length];
        int number=-1;

       for (int first=0;first<charArray.length;first++){
           int count=1;
           for (int second=first+1;second< charArray.length;second++){
               if (charArray[first]==charArray[second]){
                   count++;
                   frequency[second]=number;
               }
           }
           if(frequency[first]!=number){
               frequency[first]=count;
           }
       }

        System.out.println("frequency"+" | "+"character");

        for (int num=0;num< frequency.length;num++){
            if (frequency[num]!=number){
                System.out.println("      "+charArray[num]+"|"+frequency[num]);
            }
        }
    }
}
