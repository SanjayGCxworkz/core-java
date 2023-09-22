class ClientsEx{

	public static void main(String test[]){
		
		Clients clients=new Clients();  //creating object using new keyword
		clients.setClientCompany("xworkz software technologies");
		clients.setAddress("Rajajinagar");
		clients.setNoOfProjects(7);
		
		
		Company company=new Company();  
		company.companyName="IBM";
		company.partner=clients;   //Has-A relationship
		
		
		System.out.println("Company name: "+company.companyName);
		System.out.println("Client company name: "+company.partner.getClientCompany());
		System.out.println("Address: "+company.partner.getAddress());
		System.out.println("Number of projects working on: "+company.partner.getNoOfProjects());
		
		
		
		
	}
}