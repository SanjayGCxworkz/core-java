class SwiggyExecutor  {

public static void main(String foodDelivery[]){
System.out.println("main started:");

float totalWithQuantity=Swiggy.search("samosa",2);
float total=Swiggy.search("samosa");

System.out.println("Price of samosa with quantity: "+totalWithQuantity+"Rs");
System.out.println("Price of samosa: "+total+"Rs");

System.out.println("main ended:");
}
}