class CustomerExecutor{


	public static void main(String arg[]){
	
		Customer customer=new Customer();
		
		customer.setCustomerId(1);
		System.out.println("User id is : "+ customer.getCustomerId());
		
		
		customer.setCustomerName("Sanjay");
		System.out.println("User name is : "+ customer.getCustomerName());
		
		customer.setGender("Male");
		System.out.println("User gender is : "+ customer.getGender());
		
		customer.setContactNumber(9110286610l);
		System.out.println("User phone number is : "+ customer.getContactNumber());
		
		customer.setAddress("Bangalore");
		System.out.println("User location is : "+ customer.getAddress());
		
		customer.setEmail("Sanjay@gmail.com");
		System.out.println("User email is : "+ customer.getEmail());
		
		customer.setDob("23 feb");
		System.out.println("User dob is : "+ customer.getDob());
			
	}




}