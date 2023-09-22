class SimTest{

	public static void main(String test[]){
		
		Sim sim=new Sim();  //creating object using new keyword
		sim.setSimCardName("Jio sim");
		sim.setCompany("Reliance");
		sim.setPrice(499);
		
		
		CellPhone cell=new CellPhone();  
		cell.cellPhoneName="Jio smart phone";
		cell.card=sim;   //Has-A relationship
		
		
		System.out.println("Phone name: "+cell.cellPhoneName);
		System.out.println("Sim name: "+cell.card.getSimCardName());
		System.out.println("Company name: "+cell.card.getCompany());
		System.out.println("Price of sim: "+cell.card.getPrice()+"Rs");
		
		
		
		
	}
}