class Apartment{


		 String apartmentName;
		 int apartmentID;
		 String location;
		 int apartmentFloors;
		 int apartmenttwoBhkFlats;
		 int apartmentthreeBhkFlats;



		public Apartment(){
			
			
			this("Jindal",1,"Madhavara",25,75,45);
			
			System.out.println("Invoke default constructor");
			
		}
		
		
		
		 public Apartment(String apartmentName,int apartmentID,String location,int apartmentFloors,int apartmenttwoBhkFlats,int apartmentthreeBhkFlats){
						
				        this.apartmentName =apartmentName;
						this.apartmentID=apartmentID;
						this.location=location;
						this.apartmentFloors=apartmentFloors;
						this.apartmenttwoBhkFlats=apartmenttwoBhkFlats;
						this.apartmentthreeBhkFlats=apartmentthreeBhkFlats;
						
	
                      System.out.println("Object is created");

		             }

public void provideAcomadation(){

System.out.println("This is your apartment:");
System.out.println("Name of the Apartment: "+this.apartmentName);
System.out.println("ID of the Apartment: "+this.apartmentID);
System.out.println("Address of the Apartment: "+this.location);
System.out.println("No. of floors in the Apartment: "+this.apartmentFloors);
System.out.println("No. of twoBhk Flates in the Apartment: "+this.apartmenttwoBhkFlats);
System.out.println("No. of threeBHk flates in the Apartment: "+this.apartmentthreeBhkFlats);
System.out.println("-------------------------------------------");

}


}