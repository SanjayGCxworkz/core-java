class Wood{    //encapsulated class

private int price;          //private datamembers
private String  woodName;
private String type;




	public Wood(){    //default constructor 
		
	}
	
	
	public void setPrice(int price){    //setter method 
		
		this.price=price;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public int getPrice(){     //getter method
		
		return price;
		
	}
	
	
	public void setWoodName(String woodName){
		
		this.woodName=woodName;
	}
	public String getWoodName(){
		return woodName;
	}
	
	
	public void setType(String type){
		
		this.type=type;
	}
	public String getType(){
		
		return type;
	}
}