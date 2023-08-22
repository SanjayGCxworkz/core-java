class ZomatoTester{
	
	
public static void main(String foodcorier[]){
System.out.println("main started:");


double price=Zomato.find("Zucchini Noodles");
double priceWithQuantity=Zomato.find("Zucchini Noodles",3);


System.out.println("Price of Zucchini Noodles: "+price+"Rs");
System.out.println("Price of Zucchini Noodles with quantity: "+priceWithQuantity+"Rs");

System.out.println("main ended:");
}
}