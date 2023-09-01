class Chain{


		String companyName;
		String productName;
		int productID;
		String productMaterial;
		int productPrize;
		int size;
		
		
		public Chain(String name,String itemName,int itemID,String itemMaterial,int itemPrize,int dimension ){
			
			
			companyName=name;
			productName=itemName;
			productID=itemID;
			productMaterial=itemMaterial;
			productPrize=itemPrize;
			size=dimension;
			
			System.out.println("Object is created:");
			
			
		}


		public void Designe(){

				
				
				System.out.println("Happy diwali!:");
				
				System.out.println("Name of the company: "+companyName);
				System.out.println("Product Name: "+productName);
				System.out.println("Product ID: "+productID);
				System.out.println("Product Material: "+productMaterial);
				System.out.println("Product Prize: "+productPrize+"Rs");
				System.out.println("size of the product: "+size+"cm");
				System.out.println("-------------------------------------------");

		}


}