class PostOfficeWork{


	public static void main(String arg[]){
	
	
		System.out.println("Main Started");
		
		PostOffice postOffice=new PostOffice();
		
		postOffice.setOfficePinCode(562123);
		System.out.println("PostOffice pin code: "+ postOffice.getOfficePinCode());
		
		
		
		postOffice.setBranchName("Nelamangla");
		System.out.println("Branch name: "+ postOffice.getBranchName());
		
		
		
		postOffice.setHelplineNumber(8027722866l);
		System.out.println("Customer care number : "+ postOffice.getHelplineNumber());
		
		
		
		postOffice.setNoOfStaff(17);
		System.out.println("Number of staff working: "+ postOffice.getNoOfStaff());
		
		
		
		
		postOffice.setManagerName("Mr.Shankar");
		System.out.println("Manager name: "+ postOffice.getManagerName());
		
		System.out.println("Main ended");

			
	}




}