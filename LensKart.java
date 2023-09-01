class LensKart{


           String companyName;
           String productName;
           int productID;
           String productColor;
           String productType;
           int warranty;
		
		 public LensKart(String name,String itemName,int itemID,String itemColor,String itemType,int max){
			 
			 companyName=name;
			 productName=itemName;
			 productID=itemID;
			 productColor=itemColor;
			 productType=itemType;
			 warranty=max;
			                  System.out.println("Object is created:");

			 
			
		}
         public void provideProduct(){

                 System.out.println("Enjoy our product!:");
				 
				 System.out.println("Name of the company: "+companyName);
					System.out.println("Product Name: "+productName);
					System.out.println("Product ID: "+productID);
					System.out.println("Product colour: "+productColor);
						System.out.println("Product type: "+productType);
							System.out.println("Warranty for the product: "+warranty+"year");
									System.out.println("-------------------------------------------");


				 
				 
				 
            }


}