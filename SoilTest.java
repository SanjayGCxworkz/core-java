class SoilTest{

	public static void main(String test[]){
		
		Soil soil=new Soil();  //creating object using new keyword
		soil.setSoilName("Black soil");
		soil.setHumus("4%-16%");
		soil.setPrice(346);
		
		
		Plant plant=new Plant();  
		plant.plantName="Cotton plant";
		plant.nutrientSoil=soil;   //Has-A relationship
		
		
		System.out.println("Plant name: "+plant.plantName);
		System.out.println("Soil name: "+plant.nutrientSoil.getSoilName());
		System.out.println("humus content in soil: "+plant.nutrientSoil.getHumus());
		System.out.println("Price: "+plant.nutrientSoil.getPrice()+"Rs  1 kg");
		
		
		
		
	}
}