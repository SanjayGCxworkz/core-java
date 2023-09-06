public class Bank{


private int ifscCode;    
private String bankName;
private String address;
private int branchCode;
private String branchName;

	public void setIfscCode(int ifscCode){

		this.ifscCode=ifscCode;


	} 
	
	public int getIfscCode(){
	
		return ifscCode;
	}
	
	
	
	public void setBankName(String bankName){
	
		this.bankName=bankName;
		
	
	}
	public String getBankName(){
	
		return bankName;
	
	}
	
	public void setAddress(String address){
	
		this.address=address;
		
	
	}
	public String getAddress(){
	
		return address;
	
	}
	
	
	public void setBranchCode(int branchCode){

		this.branchCode=branchCode;


	} 
	
	public int getBranchCode(){
	
		return branchCode;
	}
	
	
	
	
	public void setBranchName(String branchName){
	
		this.branchName=branchName;
	}
	public String getBranchName(){
	
		return branchName;
	}

	
	




}