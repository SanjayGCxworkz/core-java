class Library{

String name; //  declaraiton of instance variables
int year;
String location;
int noOfVolumes;
	
	public Library(){//default constructor
	
		this("Mysore university library",1918,"Mysore",2311); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public Library(String name,int year,String location,int noOfVolumes){
		
		// parameterized constructor
		this.name=name;
		this.year=year;
		this.location=location;
		this.noOfVolumes=noOfVolumes;
		
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
	
		System.out.println("Name of the library: "+this.name);

		System.out.println("Founded in the year: "+this.year);
		System.out.println("Located in the district: "+this.location);
		System.out.println("Numbers of volumes : "+this.noOfVolumes);
		

		
		
		
	}
	
	
	public static void other(String works[]){  // method to print an array
		
		
		System.out.println("Special collections: ");

		for(int index=0;index<works.length;index++){
		
		System.out.println("                   "+works[index]);
	
		}
		
		
		
	}
		


}