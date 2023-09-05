class Gym{

String name;
int noOfitems;  //  declaraiton of instance variables
int id;
String startTime;
String endTime;

	
	public Gym(){//default constructor
	
		this("Fortune fitness",7,28763,"6:00am","10:00pm"); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public Gym(String name,int noOfitems,int id,String startTime,String endTime){
		
		// parameterized constructor
		this.name=name;
		this.noOfitems=noOfitems;
		this.id=id;
		this.startTime=startTime;
		this.endTime=endTime;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
	
		System.out.println("Gym name: "+this.name);

		System.out.println("Number of items in Gym: "+this.noOfitems);
		System.out.println("Gym id: "+this.id);
		System.out.println("Opening time : "+this.startTime);
		System.out.println("closing time: "+this.endTime);

		
		
		
	}
	
	
	public static void fit(String type[]){
		
		
		System.out.println("Available gym set are:");

		for(int index=0;index<type.length;index++){
		
		System.out.println("                   "+type[index]);
	
		}
		
		
		
	}
		


}