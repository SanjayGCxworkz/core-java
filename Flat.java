class Flat{    //encapsulated class

private int noOfFlats;          //private datamembers
private String  managmentName;
private String address;




	public Flat(){    //default constructor 
		
	}
	
	
	public void setNoOfFlats(int noOfFlats){    //setter method 
		
		this.noOfFlats=noOfFlats;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public int getNoOfFlats(){     //getter method
		
		return noOfFlats;
		
	}
	
	
	public void setAddress(String address){
		
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	
	
	public void setManagmentName(String managmentName){
		
		this.managmentName=managmentName;
	}
	public String getManagmentName(){
		
		return managmentName;
	}
}