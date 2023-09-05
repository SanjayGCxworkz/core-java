class Tour{

	public static void main(String arg[]){  //main method
	
		String places[]={"Stone charoit","huge Vittala temple","Daroji bear sanctuary"};
		
		System.out.println("Main started");
		
		TouristPlace touristPlace=new TouristPlace();  // creating an object 
		touristPlace.other(places); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}