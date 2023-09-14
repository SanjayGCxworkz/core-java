class Spotify{
String musics[] = new String[10];
int index;

	public boolean addMusic(String music){
	boolean isAdded = false;
	
	
	if(index<musics.length){
		if( music != null){
			
			boolean exists=checkDuplicateExists(music);
			
			if(exists==false){
				
				musics[index] = music;
				isAdded = true;
				index++;
			}
			else{
				
				System.out.println(music+" Music already exist");

			}
			
		}
		else{
			System.out.println(" New musics not added");
		}
		
	}
	else{
		
		System.out.println("Index is out of range! you cannot add the music further");

	}
	return isAdded;
}

	public void getMusic(){

		System.out.println("New musics added are :");
		for(index = 0 ; index<musics.length ; index++){
			System.out.println("                     "+musics[index]);
		}
	}
	
	
	public boolean checkDuplicateExists(String musicName ){
		
		boolean exists=false;
		for(int num=0;num<musics.length;num++){
			
			if(musics[num]==musicName){
				
				exists=true;
				
				
			}
			
		}
		return exists;
		
		
		
		
	}


}
