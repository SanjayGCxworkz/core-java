class SensorTesting{

public static void main(String test[]){
	
	
System.out.println("main started:");

Sensors sensor=new Sensors();

sensor.companyName ="Sharvi electronics";
sensor.productName ="DHT 11 sensor";
sensor.productID =1;
sensor.productMaterial ="Fiber glass";
sensor.productPrize =150;
sensor.weight =30;


sensor.electronics();

System.out.println("Name of the company: "+sensor.companyName);
System.out.println("Product Name: "+sensor.productName);
System.out.println("Product ID: "+sensor.productID);
System.out.println("Product Material: "+sensor.productMaterial);
System.out.println("Product Prize: "+sensor.productPrize+"Rs");
System.out.println("weight of the product: "+sensor.weight+"gms");
System.out.println("-------------------------------------------");




Sensors sensor1=new Sensors();

sensor1.companyName ="Robo electronics";
sensor1.productName ="IR reciver sensor";
sensor1.productID =2;
sensor1.productMaterial ="stainless steel";
sensor1.productPrize =20;
sensor1.weight =15;


sensor.electronics();

System.out.println("Name of the company: "+sensor1.companyName);
System.out.println("Product Name: "+sensor1.productName);
System.out.println("Product ID: "+sensor1.productID);
System.out.println("Product material: "+sensor1.productMaterial);
System.out.println("Product prize: "+sensor1.productPrize+"Rs");
System.out.println("weight of the product: "+sensor1.weight+"gms");
System.out.println("-------------------------------------------");



System.out.println("main ended:");
}




}