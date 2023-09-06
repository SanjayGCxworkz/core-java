class BankExecutor{


	public static void main(String arg[]){
	
	
		System.out.println("Main Started");
		
		Bank bank=new Bank();
		
		bank.setIfscCode(1);
		System.out.println("Bank IFSC code: "+ bank.getIfscCode());
		
		
		
		bank.setBankName("Canara Bank");
		System.out.println("Bank name : "+ bank.getBankName());
		
		
		
		bank.setAddress("Adharshanagar");
		System.out.println("Location  : "+ bank.getAddress());
		
		
		
		bank.setBranchCode(31425);
		System.out.println("Bank code: "+ bank.getBranchCode());
		
		
		
		
		bank.setBranchName("Arsinakunte");
		System.out.println("bank gender  : "+ bank.getBranchName());
		
				System.out.println("Main ended");

			
	}




}