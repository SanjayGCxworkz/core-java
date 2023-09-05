class PlayStation{


int noOfGames;  //  declaraiton of instance variables
int id;
String startTime;
String endTime;

	
	public PlayStation(){//default constructor
	
		this(10,51765,"9:00am","10:00pm"); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public PlayStation(int noOfGames,int id,String startTime,String endTime){
		
		// parameterized constructor
		this.noOfGames=noOfGames;
		this.id=id;
		this.startTime=startTime;
		this.endTime=endTime;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
		System.out.println("Number of games in PlayStation: "+this.noOfGames);
		System.out.println("PlayStation id: "+this.id);
		System.out.println("Opening time : "+this.startTime);
		System.out.println("closing time: "+this.endTime);

		
		
		
	}
	
	
	public static void play(String games[]){
		
		
		System.out.println("Available games are:");

		for(int index=0;index<games.length;index++){
		
		System.out.println("                   "+games[index]);
	
		}
		
		
		
	}
		


}