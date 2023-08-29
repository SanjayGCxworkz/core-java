class LensKartOperation{

public static void main(String lens[]){

LensKart glass=new LensKart();

glass.companyName ="LensKart";
glass.productName ="Sun glass";
glass.productID =1;
glass.productColor ="Black";
glass.productType ="Wayfarer";
glass.warranty =1;


glass.provideProduct();

System.out.println("Name of the company: "+glass.companyName);
System.out.println("Product Name: "+glass.productName);
System.out.println("Product ID: "+glass.productID);
System.out.println("Product colour: "+glass.productColor);
System.out.println("Product type: "+glass.productType);
System.out.println("Warranty for the product: "+glass.warranty+"year");
System.out.println("-------------------------------------------");




LensKart glass2=new LensKart();

glass2.companyName ="LensKart";
glass2.productName ="PIRASO";
glass2.productID =2;
glass2.productColor ="Black with red";
glass2.productType ="Wayfarer";
glass2.warranty =3;


glass.provideProduct();

System.out.println("Name of the company: "+glass2.companyName);
System.out.println("Product Name: "+glass2.productName);
System.out.println("Product ID: "+glass2.productID);
System.out.println("Product colour: "+glass2.productColor);
System.out.println("Product type: "+glass2.productType);
System.out.println("Warranty for the product: "+glass2.warranty+"years");
System.out.println("-------------------------------------------");





LensKart glass3=new LensKart();

glass3.companyName ="LensKart";
glass3.productName ="Poloport";
glass3.productID =3;
glass3.productColor ="Gold with Black";
glass3.productType ="Wayfarer";
glass3.warranty =2;


glass.provideProduct();

System.out.println("Name of the company: "+glass3.companyName);
System.out.println("Product Name: "+glass3.productName);
System.out.println("Product ID: "+glass3.productID);
System.out.println("Product colour: "+glass3.productColor);
System.out.println("Product type: "+glass3.productType);
System.out.println("Warranty for the product: "+glass3.warranty+"years");
System.out.println("-------------------------------------------");






LensKart glass4=new LensKart();

glass4.companyName ="LensKart";
glass4.productName ="John jacobs";
glass4.productID =4;
glass4.productColor ="Silver";
glass4.productType ="UV protection";
glass4.warranty =3;


glass.provideProduct();

System.out.println("Name of the company: "+glass4.companyName);
System.out.println("Product Name: "+glass4.productName);
System.out.println("Product ID: "+glass4.productID);
System.out.println("Product colour: "+glass4.productColor);
System.out.println("Product type: "+glass4.productType);
System.out.println("Warranty for the product: "+glass4.warranty+"years");
System.out.println("-------------------------------------------");





LensKart glass5=new LensKart();

glass5.companyName ="LensKart";
glass5.productName ="Silver kartz";
glass5.productID =5;
glass5.productColor ="Gold with silver";
glass5.productType ="Wayfarer";
glass5.warranty =5;


glass.provideProduct();

System.out.println("Name of the company: "+glass5.companyName);
System.out.println("Product Name: "+glass5.productName);
System.out.println("Product ID: "+glass5.productID);
System.out.println("Product colour: "+glass5.productColor);
System.out.println("Product type: "+glass5.productType);
System.out.println("Warranty for the product: "+glass5.warranty+"years");
System.out.println("-------------------------------------------");


}



}