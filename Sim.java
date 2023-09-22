class Sim{    //encapsulated class

private int price;          //private datamembers
private String  simCardName;
private String company;




	public Sim(){    //default constructor 
		
	}
	
	
	public void setPrice(int price){    //setter method 
		
		this.price=price;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public int getPrice(){     //getter method
		
		return price;
		
	}
	
	
	public void setSimCardName(String simCardName){
		
		this.simCardName=simCardName;
	}
	public String getSimCardName(){
		return simCardName;
	}
	
	
	public void setCompany(String company){
		
		this.company=company;
	}
	public String getCompany(){
		
		return company;
	}
}