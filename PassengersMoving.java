class PassengersMoving{

	public static void main(String pas[]){
		
		Passengers peoples=new Passengers();  //creating object using new keyword
		peoples.setNoOfPassengers(55);
		peoples.setTicketPrice("75Rs");
		peoples.setNoOfSeats(65);
		
		
		Train train=new Train();  
		train.trainName="Hassan express";
		train.passengers=peoples;   //Has-A relationship
		
		
		System.out.println("Train name: "+train.trainName);
		System.out.println("No. of passengers:  "+train.passengers.getNoOfPassengers());
		System.out.println("Ticket price: "+train.passengers.getTicketPrice());
		System.out.println("No. of seats: "+train.passengers.getNoOfSeats());
		
		
		
		
	}
}