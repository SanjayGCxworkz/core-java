class SpotifyTester{


	public static void main(String soft[]){

		TamilSongs spot = new TamilSongs();
		spot.addMusic("Akilanda koti");
		spot.addMusic("Pyar hoti");
		spot.addMusic("Dil dil galan");
		spot.addMusic("Na na na");
		spot.addMusic("Vikram");
		spot.addMusic("Vikram");
		spot.addMusic("vayu");
		spot.addMusic("chaluvena chitara");
		spot.addMusic("chaitrama");
		spot.addMusic("joker");
		spot.addMusic("Sapna jahan");

		
		spot.getMusic();		
		spot.addMusic("jayamma");
		
		String myGana="Prema chandrama";
		String musicName=spot.searchMusic(myGana);
		if(musicName==null){
			System.out.println(myGana+" Music is not available sorry!");
			
		}
		else{
			
			System.out.println("Here is your music enjoy :"+myGana);
		}
			
		spot.deleteByMusicName("joker");

	
	}

}
