class Chain{


		String companyName;
		String productName;
		int productID;
		String productMaterial;
		int productPrize;
		int size;
		
	


	public Chain(){
		
		System.out.println("Default constructor invoked");
		
		
	}
		public Chain(String companyName,String productName,int productID,String productMaterial,int productPrize,int size ){
			
			this();
			this.companyName=companyName;
			this.productName=productName;
			this.productID=productID;
			this.productMaterial=productMaterial;
			this.productPrize=productPrize;
			this.size=size;
			
			System.out.println("Object is created:");
			
			
		}


		public void Designe(){

				
				
				System.out.println("Happy diwali!:");
				
				System.out.println("Name of the company: "+this.companyName);
				System.out.println("Product Name: "+this.productName);
				System.out.println("Product ID: "+this.productID);
				System.out.println("Product Material: "+this.productMaterial);
				System.out.println("Product Prize: "+this.productPrize+"Rs");
				System.out.println("size of the product: "+this.size+"cm");
				System.out.println("-------------------------------------------");

		}


}