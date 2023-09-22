class JVM{    //encapsulated class

private String fullName;          //private datamembers
private String  whatDoes;
private int bits;




	public JVM(){    //default constructor 
		
	}
	
	
	public void setFullName(String fullName){    //setter method 
		
		this.fullName=fullName;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getFullName(){     //getter method
		
		return fullName;
		
	}
	
	
	public void setWhatDoes(String whatDoes){
		
		this.whatDoes=whatDoes;
	}
	public String getWhatDoes(){
		return whatDoes;
	}
	
	
	public void setBits(int bits){
		
		this.bits=bits;
	}
	public int getBits(){
		
		return bits;
	}
}