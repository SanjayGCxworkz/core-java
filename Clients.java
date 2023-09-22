class Clients{    //encapsulated class

private int noOfProjects;          //private datamembers
private String  clientCompany;
private String address;




	public Clients(){    //default constructor 
		
	}
	
	
	public void setNoOfProjects(int noOfProjects){    //setter method 
		
		this.noOfProjects=noOfProjects;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public int getNoOfProjects(){     //getter method
		
		return noOfProjects;
		
	}
	
	
	public void setClientCompany(String clientCompany){
		
		this.clientCompany=clientCompany;
	}
	public String getClientCompany(){
		return clientCompany;
	}
	
	
	public void setAddress(String address){
		
		this.address=address;
	}
	public String getAddress(){
		
		return address;
	}
}