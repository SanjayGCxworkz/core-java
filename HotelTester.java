class HotelTester{
	public static void main(String hots[]){

		HotelShriKrishna hot = new HotelShriKrishna();
		hot.addMenu("peri peri plate");
		hot.addMenu("Lassi");
		hot.addMenu("Juice");
		hot.addMenu("Burger");
		hot.addMenu("Sandwich");
		hot.addMenu("Cold Drinks");
		hot.addMenu("Veg items");
		hot.addMenu("Chats");
		hot.addMenu("Snacks");
		hot.addMenu("Pizza");
		
		
		
		hot.getMenu();
		hot.addMenu("Pizza");
		
		
		String section=hot.searchInList("Juice");
		System.out.println("Here is your list: "+section);
		
		
		boolean deleted=hot.deleteByMenuName("Burger");
		

	}
}
