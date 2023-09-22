class WoodTest{

	public static void main(String test[]){
		
		Wood wood=new Wood();  //creating object using new keyword
		wood.setType("Polished");
		wood.setWoodName("TeekWood");
		wood.setPrice(3500);
		
		
		Furniture furniture=new Furniture();  
		furniture.furnitureName="Chair";
		furniture.tree=wood;   //Has-A relationship
		
		
		System.out.println("Furniture name: "+furniture.furnitureName);
		System.out.println("Type of wood: "+furniture.tree.getType());
		System.out.println("Wood name: "+furniture.tree.getWoodName());
		System.out.println("Price of wood: "+furniture.tree.getPrice()+"Rs/mtr");
		
		
		
		
	}
}