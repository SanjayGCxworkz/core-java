class Apartment{


		 String apartmentName;
		 int apartmentID;
		 String location;
		 int apartmentFloors;
		 int apartmenttwoBhkFlats;
		 int apartmentthreeBhkFlats;

		 public Apartment(String name,int id,String place,int countFloors,int countTwoBhkFlats,int countThreeBhkFlats){
				
				        apartmentName =name;
						apartmentID=id;
						location=place;
						apartmentFloors=countFloors;
						apartmenttwoBhkFlats=countTwoBhkFlats;
						apartmentthreeBhkFlats=countThreeBhkFlats;
						
	
                      System.out.println("Object is created");

		             }

public void provideAcomadation(){

System.out.println("This is your apartment:");
System.out.println("Name of the Apartment: "+apartmentName);
System.out.println("ID of the Apartment: "+apartmentID);
System.out.println("Address of the Apartment: "+location);
System.out.println("No. of floors in the Apartment: "+apartmentFloors);
System.out.println("No. of twoBhk Flates in the Apartment: "+apartmenttwoBhkFlats);
System.out.println("No. of threeBHk flates in the Apartment: "+apartmentthreeBhkFlats);
System.out.println("-------------------------------------------");

}


}