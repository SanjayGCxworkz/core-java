class Fishing{

	public static void main(String meenu[]){
		
		Fish fish=new Fish();  //creating object using new keyword
		fish.setfishName("Catfish");
		fish.setColor("Grey");
		fish.setWeight("10-12kg");
		
		
		Water water=new Water();  
		water.oceanName="Bay of Bengal";
		water.machli=fish;   //Has-A relationship
		
		
		System.out.println("  "+water.oceanName);
		System.out.println("About fish:  "+water.machli.getfishName());
		System.out.println("colour: "+water.machli.getColor());
		System.out.println("fish weight: "+water.machli.getWeight());
		
		
		
		
	}
}