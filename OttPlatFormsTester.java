class OttPlatFormsTester{
    public static void main(String arra[]){
	
		AmazonPrime ott = new AmazonPrime();
		ott.addMovies("Ranavikrama");
		ott.addMovies("Vamshi");
		ott.addMovies("Vamshi");
		ott.addMovies("Mowrya");
		ott.addMovies("Appu");
		ott.addMovies("James");
	
		ott.getMovieNames();
		ott.addMovies("Yare kugadale");
		
		
		String movieName=ott.searchMovie("Appu");
		System.out.println("Here is your film "+movieName);

		ott.deleteByName("Vamshi");
		
	
	}
}
