class FassoTester{
	
	
	public static void main(String foodDelivery[]){
	
	
	System.out.println("main started:");


	double price=Fasso.find("Beef Wellington");
	double priceWithQuantity=Fasso.find("Beef Wellington",5);
	
	System.out.println("Price of Beef Wellington: "+price+"Rs");
	System.out.println("Price of Beef Wellington with quantity: "+priceWithQuantity+"Rs");
	
	
	System.out.println("main ended:");
}
}