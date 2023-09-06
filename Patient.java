public class Patient{


private int wardNumber;    
private String patientName;
private String diseases;
private int age;
private String gender;
private long contactNumber;
private String address;
private String consultantDoctor;
private String date;

	public void setWardNumber(int wardNumber){

		this.wardNumber=wardNumber;


	} 
	
	public int getWardNumber(){
	
		return wardNumber;
	}
	
	
	
	public void setPatientName(String patientName){
	
		this.patientName=patientName;
		
	
	}
	public String getPatientName(){
	
		return patientName;
	
	}
	
	public void setDiseases(String diseases){
	
		this.diseases=diseases;
		
	
	}
	public String getDiseases(){
	
		return diseases;
	
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

	
	
	public void setContactNumber(long contactNumber){
	
		this.contactNumber=contactNumber;
	
	}
	public long getContactNumber(){
	
		return contactNumber;
	}
	
	
	
	public void setAddress(String address){
	
		this.address=address;
	
	
	}
	public  String getAddress(){
		
		return address;
	
	}
	
	
	
	
	public void setConsultantDoctor(String consultantDoctor){
	
		this.consultantDoctor=consultantDoctor;
	
	}
	public String getConsultantDoctor(){
		return consultantDoctor;
	}
	
	
	
	public void setDate(String date){
	
		this.date=date;
	
	}
	public String getDate(){
	
		return date;
	}




}