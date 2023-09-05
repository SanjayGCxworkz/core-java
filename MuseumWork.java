class MuseumWork{

	public static void main(String arg[]){  //main method
	
		String things[]={"Science on a sphere","Spark theatre","International space station"};
		
		System.out.println("Main started");
		
		Museum museum=new Museum();  // creating an object 
		museum.other(things); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}