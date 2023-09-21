class ChatShopTester{

	public static void main(String shop[]){
		
		ChatShop chatShop=new ChatShop();
		chatShop.addNames("Samosa");
		chatShop.addNames("Pani puri");
		chatShop.addNames("Gobi");
		chatShop.addNames("Vada pav");
		chatShop.addNames("Masala puri");
		chatShop.addNames("Snadwitch");
		chatShop.addNames("Gobi");
		chatShop.addNames("noodels");
		chatShop.addNames("gobi rice");
		chatShop.addNames("egg burgi");
		chatShop.addNames("kara bannu");
		

		chatShop.getNames();
		chatShop.addNames("egg");
		
		String item=chatShop.searchChats("Gobi");
		System.out.println("Thankyou for your order: "+item);
	
		chatShop.deleteByChatsName("noodels");
	
	}





}