class Sports
{
	static String topTennisPlayers[]={"1:Alcaraz", "2:Djokovic","3:Medvedev","4:Tsitsipas","5:Ruud","6:Rune","7:Rublev","8:Sinner","9:Fritz","10:Tiafoe"};
	static String topTenCricketPlayers[]={"1:Babar Azam","2:Rassie van der Dussen","3:Fakhar Zaman","4:Imam-ul-Haq","5:Harry Tector","6:David Warner","7:Shubman Gill","8:Quinton de Kock","9:Virat Kholi","10:Steve Smith"};
	static String topTenCricketTeams[]={"1:India","2:Australia","3:England","4:South Africa","5:New Zealand","6:Pakistan","7:Sri Lanka","8:West Indies","9:Bangladesh","10:Zimbabwe"};
	static String top10HockeyTeams[]={"1:Australia","2:Belgium","3:Netherlands","4:Germany","5:India","6:England","7:Argentina","8:Spain","9:New Zealand","10:Malaysia"};
	static String top10CricketBowlers[]={"1:Josh Hazlewood","2:Mitchell Starc","3:Rashid Khan","4:Mohammad siraj","5:Matt Henry","6:Mujeeb Ur Rahman","7:Trent Boult","8:Adam Zampa","9:Shaheen Afridi","10:Shakib Al Hasan"};
	public static void main(String sanjay[])
	{
		System.out.println("Top ten Tennis players:");
		for(int tennis=0;tennis<topTennisPlayers.length;){
		System.out.println(topTennisPlayers[tennis]);
		tennis=tennis+1;
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Top ten ODI cricket Batsmans:");
		for(int odi=0;odi<topTenCricketPlayers.length;){
		System.out.println(topTenCricketPlayers[odi]);
		odi=odi+1;
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Top ten cricket teams in the world:");
		for(int cri=0;cri<topTenCricketTeams.length;){
		System.out.println(topTenCricketTeams[cri]);
		cri=cri+1;
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Top ten cricket Bowlers");
		for(int bow=0;bow<top10CricketBowlers.length;){
		System.out.println(top10CricketBowlers[bow]);
		bow=bow+1;
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Top ten Hockey teams:");
		for(int hoc=0;hoc<top10HockeyTeams.length;){
		System.out.println(top10HockeyTeams[hoc]);
		hoc=hoc+1;
		}
		
	}
}	
