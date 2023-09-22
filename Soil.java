class Soil{    //encapsulated class

private String soilName;          //private datamembers
private String  humus;
private int price;




	public Soil(){    //default constructor 
		
	}
	
	
	public void setSoilName(String soilName){    //setter method 
		
		this.soilName=soilName;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getSoilName(){     //getter method
		
		return soilName;
		
	}
	
	
	public void setHumus(String humus){
		
		this.humus=humus;
	}
	public String getHumus(){
		return humus;
	}
	
	
	public void setPrice(int price){
		
		this.price=price;
	}
	public int getPrice(){
		
		return price;
	}
}