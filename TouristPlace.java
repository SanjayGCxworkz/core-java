class TouristPlace{

String name; //  declaraiton of instance variables
int year;
String state;
String special;

	
	public TouristPlace(){//default constructor
	
		this("Hampi",14,"Karnataka","Virupaksha temple"); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public TouristPlace(String name,int year,String state,String special){
		
		// parameterized constructor
		this.name=name;
		this.year=year;
		this.state=state;
		this.special=special;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
	
		System.out.println("Name of the place: "+this.name);

		System.out.println("century: "+this.year+"th century");
		System.out.println("Located in the state: "+this.state);
		System.out.println("Famous for: "+this.special);

		
		
		
	}
	
	
	public static void other(String places[]){  // method to print an array
		
		
		System.out.println("Also famous for :");

		for(int index=0;index<places.length;index++){
		
		System.out.println("                   "+places[index]);
	
		}
		
		
		
	}
		


}