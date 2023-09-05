class Sensors{
	String companyName;
	String productName;
	int productID;
	String productMaterial;
	int productPrize;
	int weight;
	


	public Sensors(){
		
		System.out.println("Default constructor invoked");
		
		
	}
	
	
	public Sensors(String companyName,String productName,int productID,String productMaterial,int productPrize,int weight){
		this();
		
		this.companyName=companyName;
		this.productName=productName;
		this.productID=productID;
		this.productMaterial=productMaterial;
		this.productPrize=productPrize;
		this.weight=weight;
		
		System.out.println("Object is created");
	}

	public void electronics(){
		
		
		System.out.println("sensor details");
		System.out.println("Name of the company: "+this.companyName);
		System.out.println("Product Name: "+this.productName);
		System.out.println("Product ID: "+this.productID);
		System.out.println("Product material: "+this.productMaterial);
		System.out.println("Product prize: "+this.productPrize+"Rs");
		System.out.println("weight of the product: "+this.weight+"gms");
		System.out.println("-------------------------------------------");

		System.out.println("");
	}

}


