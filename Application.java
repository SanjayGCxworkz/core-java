class Application{    //encapsulated class

private String name;          //private datamembers
private double sizeInMb;
private String companyName;
private String version;
private String rating;



	public Application(){    //default constructor 
		
	}
	
	
	public void setName(String name){    //setter method 
		
		this.name=name;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getName(){     //getter method
		
		return name;
		
	}
	
	
	public void setSizeInMb(double sizeInMb){
		
		this.sizeInMb=sizeInMb;
	}
	public double getSizeInMb(){
		return sizeInMb;
	}
	
	
	public void setCompanyName(String companyName){
		
		this.companyName=companyName;
	}
	public String getCompanyName(){
		
		return companyName;
	}


	public void setVersion(String version){
		
		this.version=version;
		
	}
	public String getVersion(){
		
		return version;
	}
	
	
	
	public void setRating(String rating){
		this.rating=rating;
	}
	public String getRating(){
		
		return rating;
	}
}