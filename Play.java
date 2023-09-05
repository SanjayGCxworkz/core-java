class Play{

	public static void main(String arg[]){  //main method
	
		String games[]={"Fallout 4","Farming simulator","Kanon","Ghosts in goblins","Rampage","World of wars","Space ace","College hoops"};
		
		System.out.println("Main started");
		
		PlayStation playstation=new PlayStation();  // creating an object 
		playstation.play(games); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}