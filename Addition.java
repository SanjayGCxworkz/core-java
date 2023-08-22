class Addition{
static int result=0;
	public static void main(String sanjay[]){

	System.out.println("Main started:");
//calling method function
	getAdd(4,2);
	getAdd(13,180);
	getAdd(7,34);
	getAdd(55,45);
	getAdd(984,2032);
	getAdd(65,64);
	getAdd(8994,767);
	getAdd(8946,7893);
	getAdd(544,55);
	getAdd(8989,12,3);
	getAdd(556,878,5);
	getAdd(132,125,334);
	getAdd(32,1520,7);
	getAdd(785,132,4);
	getAdd(455,102,93);
	getAdd(654,65,2);
	getAdd(155,132,65);
	getAdd(884,253,673);
	getAdd(589,165);

System.out.println("Main ended:");
}
public static void getAdd(int first,int second){
result=first+second;
System.out.println("Addition of "+first+" and " +second+" is :"+result);
System.out.println("--------------------------------------------");

}


public static void getAdd(int first,int second,int third){
result=first+second+third;
System.out.println("Addition of "+first+","+second+" and "+third+" is :"+result);
System.out.println("-------------------------------------------");

}
}