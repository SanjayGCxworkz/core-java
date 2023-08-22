class FoodMingoTester{
public static void main(String foodDelivery[]){
	
	
System.out.println("main started:");

double price=FoodMingo.find("Buffalo Wings");
double priceWithQuantity=FoodMingo.find("Buffalo Wings",3);


System.out.println("Price of Buffalo Wings: "+price+"Rs");
System.out.println("Price of Buffalo Wings with quantity: "+priceWithQuantity+"Rs");


System.out.println("main ended:");
}
}