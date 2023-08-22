class Factorial{
public static void main(String sanjay[]){
	//calling get method
	System.out.println("main started");
getfact(4);
getfact(5);
getfact(6);
System.out.println("main ended");
}
public static void getfact(int factNumbeer){
	System.out.println("main started");
int fact=1;
for(int num=1;num<=factNumbeer;num++ ){
fact=num*fact;
}
System.out.println("main ended");
System.out.println("factorial of "+factNumbeer+" is "+fact);
}
}