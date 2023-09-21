class OttPlatforms{

String movieNames[] = new String[5];
int index;
        
      public boolean addMovies(String movie){
		boolean isAdded = false;
		if(index<movieNames.length){
			if(movie != null){
				
				boolean exist=checkDuplicateExists(movie);
				if(exist==false){
				
					

					movieNames[index]= movie;
					index++;
					isAdded = true;
				}
				else{
					
					 System.out.println(movie+" is already exists you cannot add the duplicates");

					
				}
			}
			else{
		     System.out.println(" Movie Names not added");
			}
		 
		}
		else{
			 
			 System.out.println("Index is out of range!");

			
		}
		 
		 
		 
		 return isAdded;
		}

    
	
	
	public void getMovieNames(){
		System.out.println("Movies available in this OttPlatform are :");
		for(int num = 0 ; num<movieNames.length ; num++){
	    
		  System.out.println("                 "+movieNames[num]);
		}
	 
	}
	
	
	
	
	public boolean checkDuplicateExists(String movie){
		
		boolean exists=false;
		for(int num=0; num<movieNames.length;num++){
			
			if(movieNames[num]==movie){
				
				exists=true;
				
			}
			
		}
		return exists;
		
		
	}
	
	
	public String searchMovie(String cinema){
		
		String picture=null;
		
		for(int num=0; num<movieNames.length;num++){
			
			if(movieNames[num]==cinema){
				
				picture=movieNames[num];
				
				
			}
			
			
		}
		return picture;
		
		
		
		
	}
	
	
	public boolean deleteByName(String cinema){
		
		boolean isDeleted=false;
		String movieNamesAfterDelete[]=new String[movieNames.length-1];
		int ind=0;
		
		
		for(int num=0;num<movieNames.length;num++){
			
			if(movieNames[num]!=cinema){
				
				movieNamesAfterDelete[ind++]=movieNames[num];
				isDeleted=true;
				
				
				
				
			}
			else{
				
				System.out.println("Deleted movie:    "+cinema);
			}
			
			
		}
		
		
		System.out.println("-------------");
		System.out.println("Movies names after deleted");
		for(int num=0;num<movieNamesAfterDelete.length;num++){
			
			System.out.println(movieNamesAfterDelete[num]);
			
		}
		
		
		return isDeleted;
		
		
	}
	
	
	
	
		
		
	
	
	

	
	


}
