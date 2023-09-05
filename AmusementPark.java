class AmusementPark{

String name; //  declaraiton of instance variables
String location;
int noOfAmusementRide;
int acers;

	
	public AmusementPark(){//default constructor
	
		this("Wonderla Amusement Park","Bangalore",60,30); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public AmusementPark(String name,String location,int noOfAmusementRide,int acers){
		
		// parameterized constructor
		this.name=name;
		this.location=location;
		this.noOfAmusementRide=noOfAmusementRide;
		this.acers=acers;
		
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
	
		System.out.println("Name of the Amusement park: "+this.name);

		System.out.println("Location: "+this.location);
		System.out.println("Number of Amusement rides available: "+this.noOfAmusementRide);
		System.out.println("total area : "+this.acers);
		

		
		
		
	}
	
	
	public static void play(String games[]){  // method to print an array
		
		
		System.out.println("Water games available: ");

		for(int index=0;index<games.length;index++){
		
		System.out.println("                   "+games[index]);
	
		}
		
		
		
	}
		


}