class ChainPurchase{

public static void main(String gold[]){

Chain jewellery=new Chain();

jewellery.companyName ="Joyalukkas";
jewellery.productName ="curb chain";
jewellery.productID =1;
jewellery.productMaterial ="22kt gold";
jewellery.productPrize =68354;
jewellery.size =20;


jewellery.Designe();

System.out.println("Name of the company: "+jewellery.companyName);
System.out.println("Product Name: "+jewellery.productName);
System.out.println("Product ID: "+jewellery.productID);
System.out.println("Product Material: "+jewellery.productMaterial);
System.out.println("Product Prize: "+jewellery.productPrize+"Rs");
System.out.println("size of the product: "+jewellery.size+"cm");
System.out.println("-------------------------------------------");




Chain jewellery2=new Chain();

jewellery2.companyName ="Kalyan jewellers";
jewellery2.productName ="Rope chain";
jewellery2.productID =2;
jewellery2.productMaterial ="18kt gold";
jewellery2.productPrize =19817;
jewellery2.size =25;


jewellery.Designe();

System.out.println("Name of the company: "+jewellery2.companyName);
System.out.println("Product Name: "+jewellery2.productName);
System.out.println("Product ID: "+jewellery2.productID);
System.out.println("Product material: "+jewellery2.productMaterial);
System.out.println("Product prize: "+jewellery2.productPrize+"Rs");
System.out.println("size of the product: "+jewellery2.size+"cm");
System.out.println("-------------------------------------------");
}
}