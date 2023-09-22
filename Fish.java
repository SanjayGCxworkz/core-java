class Fish{    //encapsulated class

private String fishname;          //private datamembers
private String  color;
private String weight;




	public Fish(){    //default constructor 
		
	}
	
	
	public void setfishName(String fishname){    //setter method 
		
		this.fishname=fishname;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getfishName(){     //getter method
		
		return fishname;
		
	}
	
	
	public void setColor(String color){
		
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	
	public void setWeight(String weight){
		
		this.weight=weight;
	}
	public String getWeight(){
		
		return weight;
	}
	
}