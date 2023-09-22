class Patient{    //encapsulated class

private String patientName;          //private datamembers
private String  address;
private int age;




	public Patient(){    //default constructor 
		
	}
	
	
	public void setPatientName(String patientName){    //setter method 
		
		this.patientName=patientName;   //this keyword used to avoid the conflict between instance variable and parameter
	}
	public String getPatientName(){     //getter method
		
		return patientName;
		
	}
	
	
	public void setAddress(String address){
		
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	
	
	public void setAge(int age){
		
		this.age=age;
	}
	public int getAge(){
		
		return age;
	}
	
}