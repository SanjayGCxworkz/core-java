class BagShop{

int id;
String location;
int noOfWorkers;
String brands[];
 
 public BagShop(){ //defining default constructor
	
			System.out.println("default constructor invoked");

}
 public BagShop(int id,String location,int noOfWorkers,String[] brands){
	 
		this();
		 this.id=id;
		 this.location=location;
		 this.noOfWorkers=noOfWorkers;
		 this.brands=brands;
 
	 
	 System.out.println("Bag shop objected created");
 }

public void sellingBags(){

		System.out.println("We are having quality bags");
		System.out.println("Shop id: "+this.id+"" +" shop location: "+this.location+""+ "Number of workers: "+this.noOfWorkers);

	}


public void getAllBrands(){
		
		System.out.println("Available brands are:");


		for(int index=0;index<brands.length;index++)
		{
		System.out.println(this.brands[index]);
		}



}



}