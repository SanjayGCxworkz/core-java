class Modulus{
static int result=0;
public static void main(String sanjay[]){
System.out.println("Main started:");
//calling method function
getMod(144,6);
getMod(2392,2);
getMod(137,7);
getMod(1007,13,42);
getMod(972,84);
getMod(56,4,23);
getMod(187,58);
getMod(378,65);
getMod(742,4,2);
getMod(237,43);
getMod(1218,11);
getMod(816,74,42);
getMod(7215,64);
getMod(845,33);
getMod(432,3,43);
getMod(9446,77);
getMod(164,10,2);
getMod(1725,124);
getMod(147,19,3);
getMod(1507,15);

System.out.println("Main ended:");
}
public static void getMod(int first,int second){
result=first%second;
System.out.println(result+": is the remainder when "+first+" is divided by "+second);
System.out.println("-----------------------------------------------------------------------");

}


public static void getMod(int first,int second,int third){
result=first%second%third;
System.out.println(result+": is the remainder when division between"+first+","+second+"and"+third);
System.out.println("--------------------------------------------------------------");

}
}