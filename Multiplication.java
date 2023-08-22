class Multiplication{
static int result=0;

public static void main(String sanjay[]){
System.out.println("Main started:");
//calling method function
getMul(6,2);
getMul(37,3);
getMul(21,5,14);
getMul(23,6);
getMul(74,33);
getMul(855,14);
getMul(12,6);
getMul(88,7);
getMul(24,6,54);
getMul(50,2,4);
getMul(44,3,13);
getMul(987,18);
getMul(545,7);
getMul(287,0);
getMul(77,4,12);
getMul(487,13);
getMul(20,5,17);
getMul(378,8);

System.out.println("Main ended:");
}
public static void getMul(int first,int second){
result=first*second;
System.out.println("The "+first+" times of "+second+" is :"+result);
System.out.println("-----------------------------------------------");

}




public static void getMul(int first,int second,int third){
result=first*second*third;
System.out.println("The multiplication of "+first+","+second+" and "+third+" is :"+result);
System.out.println("---------------------------------------------------");

}
}