class Subraction{
static int result=0;
public static void main(String sanjay[]){
System.out.println("Main started:");
//calling method function
getSub(4,2);
getSub(8,3,9);
getSub(399,34);
getSub(4,2,43);
getSub(783,6,646);
getSub(4,47);
getSub(7848,688);
getSub(477,55);
getSub(98,5,45);
getSub(54,89);
getSub(7838,4,56);
getSub(324,909);
getSub(97,34);
getSub(9,457);
getSub(525,72,778);
getSub(267,877);
getSub(766,443);
getSub(929,43,893);
getSub(55,37,99);
getSub(32,54);

System.out.println("Main ended:");
}
// method to subtract two numbers
public static void getSub(int first,int second){
result=first-second;
System.out.println("Difference between "+first+" and "+second+" is :"+result);
System.out.println("-------------------------------------------------");

}



public static void getSub(int first,int second,int third){
result=first-second;
System.out.println("subraction of "+first+","+second+" and "+third+" is :"+result);
System.out.println("----------------------------------------------------------");

}
}