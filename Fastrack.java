class Fastrack{


	String companyName;
	String productName;
	int productID;
	String productColor;
	int productPrize;
	String type;

	public Fastrack(String name,String itemName,int itemID,String itemColour,int itemPrize,String diff){
		companyName=name;
		productName=itemName;
		productID=itemID;
		productColor=itemColour;
		productPrize=itemPrize;
		type=diff;
		System.out.println("Object is created");
	}

	public void production(){

		System.out.println("Here is your product");
		System.out.println("Name of the company: "+companyName);
		System.out.println("Product Name: "+productName);
		System.out.println("Product ID: "+productID);
		System.out.println("Product colour: "+productColor);
		System.out.println("Product Prize: "+productPrize+"Rs");
		System.out.println("type of the product: "+type);
		System.out.println("-------------------------------------------");

		System.out.println("");
		
	}


}