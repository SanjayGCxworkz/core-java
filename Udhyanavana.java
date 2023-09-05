class Udhyanavana{


int noOfGates;  //  declaraiton of instance variables
int id;
String startTime;
String endTime;

	
	public Udhyanavana(){//default constructor
	
		this(10,1,"7:00am","7:00pm"); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public Udhyanavana(int noOfGates,int id,String startTime,String endTime){
		
		// parameterized constructor
		this.noOfGates=noOfGates;
		this.id=id;
		this.startTime=startTime;
		this.endTime=endTime;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
		System.out.println("Welcome to Udhyanavana");

		System.out.println("Number of gates in Udhyanavana: "+this.noOfGates);
		System.out.println("Udhyanavana id: "+this.id);
		System.out.println("Opening time : "+this.startTime);
		System.out.println("closing time: "+this.endTime);

		
		
		
	}
	
	
	public static void huvvu(String flowers[]){
		
		
		System.out.println("Available flowers are:");

		for(int index=0;index<flowers.length;index++){
		
		System.out.println("                   "+flowers[index]);
	
		}
		
		
		
	}
		


}