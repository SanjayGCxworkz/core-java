class Fastrack{


	String companyName;
	String productName;
	int productID;
	String productColor;
	int productPrize;
	String type;
	
public Fastrack(){ //defining default constructor
	
			System.out.println("default constructor invoked");

}

	public Fastrack(String companyName,String productName,int productID,String productColor,int productPrize,String type){
		
		this();
		this.companyName=companyName;
		this.productName=productName;
		this.productID=productID;
		this.productColor=productColor;
		this.productPrize=productPrize;
		this.type=type;
		System.out.println("Object is created");
	}

	public void production(){

		System.out.println("Here is your product");
		System.out.println("Name of the company: "+ this.companyName);
		System.out.println("Product Name: "+ this.productName);
		System.out.println("Product ID: "+this.productID);
		System.out.println("Product colour: "+this.productColor);
		System.out.println("Product Prize: "+this.productPrize+"Rs");
		System.out.println("type of the product: "+this.type);
		System.out.println("-------------------------------------------");

		System.out.println("");
		
	}


}