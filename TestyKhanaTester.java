class TestyKhanaTester{


public static void main(String foodDelivery[]){
System.out.println("main started:");

double price=TestyKhana.find("Shrimp Poached in Wine");
double priceWithQuantity=TestyKhana.find("Shrimp Poached in Wine",3);

System.out.println("Price of Shrimp Poached in Wine "+price+"Rs");
System.out.println("Price of Shrimp Poached in Wine with quantity:"+priceWithQuantity+"Rs");

System.out.println("main ended:");
}
}