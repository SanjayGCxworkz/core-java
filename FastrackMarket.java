class FastrackMarket{

public static void main(String fast[]){

System.out.println("main started:");

Fastrack watch=new Fastrack();

watch.companyName ="Fastrack Pvt.ltd";
watch.productName ="Minimalists analog watch";
watch.productID =38024;
watch.productColor ="Black";
watch.productPrize =850;
watch.type ="Thick straps";


watch.production();

System.out.println("Name of the company: "+watch.companyName);
System.out.println("Product Name: "+watch.productName);
System.out.println("Product ID: "+watch.productID);
System.out.println("Product colour: "+watch.productColor);
System.out.println("Product Prize: "+watch.productPrize+"Rs");
System.out.println("type of the product: "+watch.type);
System.out.println("-------------------------------------------");




Fastrack watch1=new Fastrack();

watch1.companyName ="Fastrack Pvt.ltd";
watch1.productName ="Party analog watch";
watch1.productID =1474;
watch1.productColor ="silver with blue";
watch1.productPrize =3795;
watch1.type ="metallic";


watch.production();

System.out.println("Name of the company: "+watch1.companyName);
System.out.println("Product Name: "+watch1.productName);
System.out.println("Product ID: "+watch1.productID);
System.out.println("Product colour: "+watch1.productColor);
System.out.println("Product prize: "+watch1.productPrize+"Rs");
System.out.println("type of the product: "+watch1.type);
System.out.println("-------------------------------------------");


System.out.println("main ended:");
}


}