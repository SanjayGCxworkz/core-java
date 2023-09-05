class ZooVisit{

	public static void main(String arg[]){  //main method
	
		String animals[]={"Elephants","tigers","Deer","crocodial"};
		
		System.out.println("Main started");
		
		Zoo zoo=new Zoo();  // creating an object 
		zoo.other(animals); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}