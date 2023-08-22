class Division{
static int result=0;
public static void main(String sanjay[]){
System.out.println("Main started:");
//calling method function
getDiv(6,2);
getDiv(9859,3);
getDiv(108,4);
getDiv(178,9);
getDiv(137,5);
getDiv(118,97);
getDiv(108,7);
getDiv(100,48);
getDiv(7787,77);
getDiv(58,2);
getDiv(105,5);
getDiv(6798,6);
getDiv(337,17);
getDiv(32,16);
getDiv(46,4);
getDiv(6147,75);
getDiv(1278,84);
getDiv(2178,38);
getDiv(347,2);
getDiv(1214,87);

getDiv(6,4,2);
getDiv(9859,4,3);
getDiv(108,4,4);
getDiv(178,4,9);
getDiv(137,4,5);
getDiv(118,4,97);
getDiv(108,4,7);
getDiv(100,4,48);
getDiv(7787,4,77);
getDiv(58,4,2);
getDiv(105,4,5);
getDiv(6798,4,6);
getDiv(337,4,17);
getDiv(32,4,16);
getDiv(46,4,4);
getDiv(6147,4,75);
getDiv(1278,4,84);
getDiv(2178,4,38);
getDiv(347,4,2);
getDiv(1214,4,87);
System.out.println("Main ended:");
}
public static void getDiv(int first,int second){
result=first/second;
System.out.println(" Quotient when "+first+" is divided by "+second+" is :"+result);
System.out.println("--------------------------------------------------------------");

}


public static void getDiv(int first,int second,int third){
result=first/second/third;
System.out.println("Division of "+first+","+second+" and "+third+" is :"+result);
System.out.println("--------------------------------------------------------------");

};
}