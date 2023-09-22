class Kitchen{    //encapsulated class

private String color;          //private datamembers
private String  graniteType;
private int size;




	public Kitchen(){    //default constructor 
		
	}
	
	
	public void setColor(String color){    //setter method 
		
		this.color=color;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getColor(){     //getter method
		
		return color;
		
	}
	
	
	public void setGraniteType(String graniteType){
		
		this.graniteType=graniteType;
	}
	public String getGraniteType(){
		return graniteType;
	}
	
	
	public void setSize(int size){
		
		this.size=size;
	}
	public int getSize(){
		
		return size;
	}
	
}