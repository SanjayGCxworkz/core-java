public class BusPass{


private int passNumber;    // declaration of instance variable
private String starting;
private String name;
private int age;
private String gender;
private int adhar;
private String ending;


	public void setPassNumber(int passNumber){   //setter method

		this.passNumber=passNumber;   //avoiding conflict between instance variable and parameter variable using this keyword


	} 
	
	public int getPassNumber(){   //getter method
	
		return passNumber;
	}
	
	
	
	public void setStarting(String starting){
	
		this.starting=starting;
		
	
	}
	public String getStarting(){
	
		return starting;
	
	}
	
	public void setName(String name){
	
		this.name=name;
		
	
	}
	public String getName(){
	
		return name;
	
	}
	
	
	public void setAge(int age){

		this.age=age;


	} 
	
	public int getAge(){
	
		return age;
	}
	
	
	
	
	public void setGender(String gender){
	
		this.gender=gender;
	}
	public String getGender(){
	
		return gender;
	}
	
	
	
	public void setAdhar(int adhar){

		this.adhar=adhar;


	} 
	
	public int getAdhar(){
	
		return adhar;
	}
	
	
	public void setEnding(String ending){
	
		this.ending=ending;
	}
	public String getEnding(){
	
		return ending;
	}

	
	




}