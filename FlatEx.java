class FlatEx{

	public static void main(String test[]){
		
		Flat flat=new Flat();  //creating object using new keyword
		flat.setAddress("Makli");
		flat.setManagmentName("Jindal authority");
		flat.setNoOfFlats(40);
		
		
		Apartments apartments=new Apartments();  
		apartments.apartmentName="jindal";
		apartments.flatInfrastructure=flat;   //Has-A relationship
		
		
		System.out.println("Apartments  name: "+apartments.apartmentName);
		System.out.println("Apartments address: "+apartments.flatInfrastructure.getAddress());
		System.out.println("Number of flats: "+apartments.flatInfrastructure.getNoOfFlats());
		System.out.println("Under the managment of : "+apartments.flatInfrastructure.getManagmentName());
		
		
		
		
	}
}