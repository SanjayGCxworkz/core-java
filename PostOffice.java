public class PostOffice{


private int officePinCode;    
private String branchName;
private long helpLineNumber;
private int noOfStaff;
private String managerName;

	public void setOfficePinCode(int officePinCode){

		this.officePinCode=officePinCode;


	} 
	
	public int getOfficePinCode(){
	
		return officePinCode;
	}
	
	
	
	public void setBranchName(String branchName){
	
		this.branchName=branchName;
		
	
	}
	public String getBranchName(){
	
		return branchName;
	
	}
	
	public void setHelplineNumber(long helpLineNumber){
	
		this.helpLineNumber=helpLineNumber;
		
	
	}
	public long getHelplineNumber(){
	
		return helpLineNumber;
	
	}
	
	
	public void setNoOfStaff(int noOfStaff){

		this.noOfStaff=noOfStaff;


	} 
	
	public int getNoOfStaff(){
	
		return noOfStaff;
	}
	
	
	
	
	public void setManagerName(String managerName){
	
		this.managerName=managerName;
	}
	public String getManagerName(){
	
		return managerName;
	}

	
	




}