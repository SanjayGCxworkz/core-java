class StateRun{

	public static void main(String run[]){
		
		State state=new State();  //creating object using new keyword
		state.setStateName("Karnataka");
		state.setPresentGov("congress");
		state.setNoOfDistrict(31);
		
		
		Country country=new Country();  
		country.countryName="India";
		country.nadu=state;   //Has-A relationship
		
		
		System.out.println("Our country name: "+country.countryName);
		System.out.println("State name: "+country.nadu.getStateName());
		System.out.println("Present running government: "+country.nadu.getPresentGov());
		System.out.println("No. of districts: "+country.nadu.getNoOfDistrict());
		
		
		
		
	}
}