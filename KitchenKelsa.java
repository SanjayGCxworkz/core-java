class KitchenKelsa{

	public static void main(String kelsa[]){
		
		Kitchen kitchen=new Kitchen();  //creating object using new keyword
		kitchen.setColor("red and green");
		kitchen.setGraniteType("polished");
		kitchen.setSize(200);
		
		
		Hotel hotel=new Hotel();  
		hotel.hotelName="Raama hotel";
		hotel.cookingArea=kitchen;   //Has-A relationship
		
		
		System.out.println("Hotel name :"+hotel.hotelName);
		System.out.println("Kitchen colour: "+hotel.cookingArea.getColor());
		System.out.println("Type of granite in kitchen area: "+hotel.cookingArea.getGraniteType());
		System.out.println("Kitchen size: "+hotel.cookingArea.getSize()+"sqt");
		
		
		
		
	}
}