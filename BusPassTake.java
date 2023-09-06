class BusPassTake{


	public static void main(String arg[]){ //main method
	
	
		System.out.println("Main Started");
		
		BusPass busPass=new BusPass();   //creating an object using new keyword
		
		busPass.setPassNumber(26177);    //invoking setter method for initialization of instance variable
		System.out.println("BusPass number: "+ busPass.getPassNumber());
		
		
		
		busPass.setStarting("Nelamangla");
		System.out.println("Starting bus stop: "+ busPass.getStarting());  //getting data by invoking getter method
		
		
		busPass.setName("Sanjay");
		System.out.println("Passenger name: "+ busPass.getName());
		
		
		busPass.setAge(22);
		System.out.println("Passenger age: "+ busPass.getAge());
		
		
		
		busPass.setGender("Male");
		System.out.println("Gender: "+ busPass.getGender());
		
		
		
		
		busPass.setAdhar(2864);
		System.out.println("Passenger adhar last four digit: "+ busPass.getAdhar());
		
		
		busPass.setEnding("Yeshwanthpura");
		System.out.println("Last bus stop: "+ busPass.getEnding());
		
		System.out.println("Main ended");

			
	}




}