class Transport{


String name;  //  declaraiton of instance variables
String owner;
int founded;
int noOfWorkers;
int noOfBuses;


	public Transport(){//default constructor
	
		this("KSRTC","Gov of Karnataka",1961,34904,15072); // invoking parameterized constructor
		System.out.println("Default constructor is invoked");
	
	}


	public Transport(String name,String owner,int founded,int noOfWorkers,int noOfBuses){
		
		// parameterized constructor
		this.name=name;
		this.owner=owner;
		this.founded=founded;
		this.noOfWorkers=noOfWorkers;
		this.noOfBuses=noOfBuses;
	
		display(); // calling method to display details of object
	
	}
	
	public void display(){   // method to display details of object
	
		System.out.println("Transport Name: "+this.name);
		System.out.println("Transport owner: "+this.owner);
		System.out.println("Founded year: "+this.founded);
		System.out.println("No of workers : "+this.noOfWorkers);
		System.out.println("No of buses available: "+this.noOfBuses);

	
	
	
	}

}