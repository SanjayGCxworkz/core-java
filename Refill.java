class Refill{    //encapsulated class

private int length;          //private datamembers
private String  color;
private String type;




	public Refill(){    //default constructor 
		
	}
	
	
	public void setLength(int length){    //setter method 
		
		this.length=length;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public int getLength(){     //getter method
		
		return length;
		
	}
	
	
	public void setColor(String color){
		
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	
	public void setType(String type){
		
		this.type=type;
	}
	public String getType(){
		
		return type;
	}
}