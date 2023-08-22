class NetflixOtt
{
    static int num=0;
	static String kannadaMovies[]={"1:kabzaa","2:Shivaji surathkal","3:Kranti","4:Vedha,Kantara","5:777 Charlie","6:Sakath","7:Raghavendra stores","8:Gandhadagudi","9:Gurudev Hoysala","10:Garuda Gamana","11:Avane Srimannarayana","12:love Mocktail","13:Head Bush","14:Totapuri","15:Dilpasand","16:Gaalipata2","17:Roberrt","18:Premam poojyam","19:Kannadiga","20:Love you Rachchu","21:Shiva 143","22:Pogaru","23:Lucky Man","24:By two Love","25:Bhajarangi2","26:Salaga","27:Act 1978"};
	static String teluguMovies[]={"1:Dasara","2:Virupaksha","3:Agent","4:Butta Bomma","5:Ramabanam","6:Veera Simha","7:Ravanasura","8:Custody","9: 18 pages","10:Hit","11:Dhamaka","12:Uravukal","13:Vaathi","14:Ugram","15:Pushpa","16:RRR","17:Karthikeya2","18:Acharya","19:The Warriorr","19:Sita Ramam","20:Bimbisara","21:DJ tillu","22:Virata parvam","23:Ori devuda","24:Godfather","25:Varudu kaavalenu","26:Men too","27:Pelli sandad","28:Vimanam","29:Theghost","30:Liger"};
	static String malayalamMovies[]={"1: 2018","2: Charles enterprises","3: sulaikha manzil","4: Ayalvaashi","5: Romancham","6: Pachuvum" ,"7: Iratta","8: Njaan","9: Janaki jaane","10: Kolla","11: Thrishanku","12: Poovan","13: Ayisha","14: Enthada saji","15: Dear vaappi","16: Pookkaalam","17: Christy","18: Aold-case","19: Jai_bheem","20: Kooman","21: Maalik","21: Home","22:Nonsense","23: Gold","24: Driving license","25: Archana"};
	static String hindiMovies[]={"1: Bhediya","2: Vikram Vedha","3: u-turn","4: Bholaa","5: Selfiee","6: Pathaan","7: Kathal","8: Gulmohar","9: Afwaah","10: Bawaal","11: Bloody daddy","12: Tarla","13: Uunchai","14: Drishyam2","15: Cirkus","16: Mumbaikar","17: Darlings","18: Shehzada","19: Sergeant","20: Blind"};
	static String englishMovies[]={"1: Prey","2: The outfit","3: Avatar","4: The whale","5: pearl","6: Black panter","7: Top gun maverick","8: The black phone","9: The menu","10: Aftersun","11: She said","12: Terrifier2","13: True spirit","14: Heart of stone","15: Extraction 2","16: Thirteen lives","17: Love on the rock","18: Wonder women","19: Damsel","20: The monkey King","21: In his shadow","22: Unlock"};
	public static void main(String sanjay[])
	{
		System.out.println("Kannada Movies available in ott platform:");
		System.out.println("Number of kannada movies: "+kannadaMovies.length);
		int kannada=kannadaMovies.length;
		for( int kan=kannada-1;kan>=num;kan=kan-1){
		System.out.println(kannadaMovies[kan]);
		
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Telugu Movies available in ott platform: ");
		System.out.println("Number of Telugu movies: "+teluguMovies.length);
		int telugu=teluguMovies.length;
		for( int tel=telugu-1;tel>=num;tel=tel-1){
		System.out.println(teluguMovies[tel]);
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Malayalam movies available in ott platform:");
		System.out.println("Number of Malayalam movies: "+malayalamMovies.length);
		int malayalam=malayalamMovies.length;
		for( int mal=malayalam-1;mal>=num;mal=mal-1){
		System.out.println(malayalamMovies[mal]);
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Hindi movies available in ott platform:");
		System.out.println("Number of Hindi movies: "+hindiMovies.length);
		int hindi=hindiMovies.length;
		for( int hin=hindi-1;hin>=num;hin=hin-1){
		System.out.println(hindiMovies[hin]);
		}
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("English movies available in ott platform:");
		System.out.println("Number of English movies: "+englishMovies.length);
		int english=englishMovies.length;
		for( int eng=english-1;eng>=num;eng=eng-1){
		System.out.println(englishMovies[eng]);
		}
	}
}	

 