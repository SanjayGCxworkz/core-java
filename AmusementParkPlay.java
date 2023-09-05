class AmusementParkPlay{

	public static void main(String arg[]){  //main method
	
		String games[]={"Drop loop","Jungle lagoon","Lazy river","Boomerange","Harakiri"};
		
		System.out.println("Main started");
		
		AmusementPark amusementPark=new AmusementPark();  // creating an object 
		amusementPark.play(games); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}