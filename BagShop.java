class BagShop{

int id;
String location;
int noOfWorkers;
String brands[];
 
 
 public BagShop(int code,String place,int countWorkers,String[] bnds){
	 
	 
		 id=code;
		 location=place;
		 noOfWorkers=countWorkers;
		brands=bnds;
 
	 
	 System.out.println("Bag shop objected created");
 }

public void sellingBags(){

		System.out.println("We are having quality bags");
		System.out.println("Shop id: "+id+"" +" shop location: "+location+""+ "Number of workers: "+noOfWorkers);

	}


public void getAllBrands(){
		
		System.out.println("Available brands are:");


		for(int index=0;index<brands.length;index++)
		{
		System.out.println(brands[index]);
		}



}



}