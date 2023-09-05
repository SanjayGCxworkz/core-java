class LensKart{


           String companyName;
           String productName;
           int productID;
           String productColor;
           String productType;
           int warranty;
		   
		   
	public LensKart(){
		
		System.out.println("Default constructor invoked");
		
		
	}
		   
		
		 public LensKart(String companyName,String productName,int productID,String productColor,String productType,int warranty){
			 this();
			 this.companyName=companyName;
			 this.productName=productName;
			 this.productID=productID;
			 this.productColor=productColor;
			 this.productType=productType;
			 this.warranty=warranty;
			                  
			System.out.println("Object is created:");

			 
			
		}
         public void provideProduct(){

                 System.out.println("Enjoy our product!:");
				 
				 System.out.println("Name of the company: "+this.companyName);
					System.out.println("Product Name: "+this.productName);
					System.out.println("Product ID: "+this.productID);
					System.out.println("Product colour: "+this.productColor);
						System.out.println("Product type: "+this.productType);
							System.out.println("Warranty for the product: "+this.warranty+"year");
									System.out.println("-------------------------------------------");


				 
				 
				 
            }


}