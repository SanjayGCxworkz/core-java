class Museum{

String name; //  declaraiton of instance variables
int year;
String state;
String opening;
String closing;

	
	public Museum(){//default constructor
	
		this("Visvesvaraya museum",1962,"Karnataka","9:30am","7:00pm"); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public Museum(String name,int year,String state,String opening,String closing){
		
		// parameterized constructor
		this.name=name;
		this.year=year;
		this.state=state;
		this.opening=opening;
		this.closing=closing;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
	
		System.out.println("Name of the museum: "+this.name);

		System.out.println("Founded in the year: "+this.year);
		System.out.println("Located in the state: "+this.state);
		System.out.println("opening time: "+this.opening);
		System.out.println("closing time: "+this.closing);


		
		
		
	}
	
	
	public static void other(String things[]){  // method to print an array
		
		
		System.out.println("other things we can see in visvesvaraya museum:");

		for(int index=0;index<things.length;index++){
		
		System.out.println("                   "+things[index]);
	
		}
		
		
		
	}
		


}