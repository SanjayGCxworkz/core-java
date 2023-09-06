class RailwayOffice{


	public static void main(String arg[]){
	
	
		System.out.println("Main Started");
		
		RailwayStation railwayStation=new RailwayStation();
		
		railwayStation.setStationCode(323);
		System.out.println("Junction code: "+ railwayStation.getStationCode());
		
		
		
		railwayStation.setJunctionName("Nelamangla");
		System.out.println("Junction name: "+ railwayStation.getJunctionName());
		
		
		
		railwayStation.setNoOfPlatforms(5);
		System.out.println("Number of platforms  : "+ railwayStation.getNoOfPlatforms());
		
		
		
		railwayStation.setNoOfStaff(12);
		System.out.println("Number of staff working: "+ railwayStation.getNoOfStaff());
		
		
		
		
		railwayStation.setStationMaster("Mr.Ragu");
		System.out.println(" Station master name: "+ railwayStation.getStationMaster());
		
		System.out.println("Main ended");

			
	}




}