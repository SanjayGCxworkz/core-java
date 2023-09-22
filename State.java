class State{    //encapsulated class

private String stateName;          //private datamembers
private String  presentGov;
private int noOfDistrict;




	public State(){    //default constructor 
		
	}
	
	
	public void setStateName(String stateName){    //setter method 
		
		this.stateName=stateName;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getStateName(){     //getter method
		
		return stateName;
		
	}
	
	
	public void setPresentGov(String presentGov){
		
		this.presentGov=presentGov;
	}
	public String getPresentGov(){
		return presentGov;
	}
	
	
	public void setNoOfDistrict(int noOfDistrict){
		
		this.noOfDistrict=noOfDistrict;
	}
	public int getNoOfDistrict(){
		
		return noOfDistrict;
	}
	
}