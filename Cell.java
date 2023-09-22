class Cell{    //encapsulated class

private String name;          //private datamembers
private String  capacity;
private String dimension;




	public Cell(){    //default constructor 
		
	}
	
	
	public void setName(String name){    //setter method 
		
		this.name=name;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getName(){     //getter method
		
		return name;
		
	}
	
	
	public void setCapacity(String capacity){
		
		this.capacity=capacity;
	}
	public String getCapacity(){
		return capacity;
	}
	
	
	public void setDimension(String dimension){
		
		this.dimension=dimension;
	}
	public String getDimension(){
		
		return dimension;
	}
	
}