class Zoo{

String name; //  declaraiton of instance variables
int year;
String state;
String special;

	
	public Zoo(){//default constructor
	
		this("Bannerghatta",1974,"Karnataka","White tiger"); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public Zoo(String name,int year,String state,String special){
		
		// parameterized constructor
		this.name=name;
		this.year=year;
		this.state=state;
		this.special=special;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
	
		System.out.println("Name of the Zoo: "+this.name);

		System.out.println("Founded in the year: "+this.year);
		System.out.println("Located in the state: "+this.state);
		System.out.println("Famous for: "+this.special);

		
		
		
	}
	
	
	public static void other(String animals[]){  // method to print an array
		
		
		System.out.println("Animals include :");

		for(int index=0;index<animals.length;index++){
		
		System.out.println("                   "+animals[index]);
	
		}
		
		
		
	}
		


}