class Sensors{
	String companyName;
	String productName;
	int productID;
	String productMaterial;
	int productPrize;
	int weight;
	
	
	public Sensors(String name,String itemName,int itemID,String itemMaterial,int itemPrize,int mass){
		
		
		companyName=name;
		productName=itemName;
		productID=itemID;
		productMaterial=itemMaterial;
		productPrize=itemPrize;
		weight=mass;
		
		System.out.println("Object is created");
	}

	public void electronics(){

		System.out.println("sensor details");
		System.out.println("Name of the company: "+companyName);
		System.out.println("Product Name: "+productName);
		System.out.println("Product ID: "+productID);
		System.out.println("Product material: "+productMaterial);
		System.out.println("Product prize: "+productPrize+"Rs");
		System.out.println("weight of the product: "+weight+"gms");
		System.out.println("-------------------------------------------");

		System.out.println("");
	}

}


