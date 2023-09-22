class Passengers{    //encapsulated class

private int noOfPassengers;          //private datamembers
private String  ticketPrice;
private int noOfSeats;




	public Passengers(){    //default constructor 
		
	}
	
	
	public void setNoOfPassengers(int noOfPassengers){    //setter method 
		
		this.noOfPassengers=noOfPassengers;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public int getNoOfPassengers(){     //getter method
		
		return noOfPassengers;
		
	}
	
	
	public void setTicketPrice(String ticketPrice){
		
		this.ticketPrice=ticketPrice;
	}
	public String getTicketPrice(){
		return ticketPrice;
	}
	
	
	public void setNoOfSeats(int noOfSeats){
		
		this.noOfSeats=noOfSeats;
	}
	public int getNoOfSeats(){
		
		return noOfSeats;
	}
	
}