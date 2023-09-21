class CricketTeam{

	String playersName[] = new String[10];   //creating object to add new values to array
	int index;

	public boolean addPlayerNames(String playerName){
		boolean isAdded = false;
		
		
		if(index<playersName.length){  //to check index is within range
			
			if( playerName != null){   //condition to check given value is null or notnull
				
				boolean exist=checkForDuplicate(playerName);   // calling method to check duplicate
				if(exist==false){   // if false then new value is added
			
					playersName[index] = playerName;
					isAdded = true;
					index++;
				}
				else{
					
					System.out.println(playerName+" is already exist! duplicates cannot added.");
					
				}
   
			}
			else{
			
				System.out.println(" New player name not added");
				
				}
		}
		else{
			
			System.out.println("-----------------------------------");
			System.out.println("Index is out of range!");
			
		}
		return isAdded;
	}

	
	
	
	public void getPlayerName(){    //method to print each values in array

		System.out.println("Players list:");
		
		for(int num = 0 ; num<playersName.length ; num++){
			System.out.println("                     "+playersName[num]);
		}
	}
	
	
	
	public boolean checkForDuplicate(String name){   // method to check given value is already present
		
		boolean isThere=false;
		
		for(int num=0;num<playersName.length;num++){   // for loop to access each values in array
			
			if(playersName[num]==name){   //compare each value in array with new value
				
				isThere=true;
				
			}
			
			
		}
		
		
		return isThere;   //returns true if value present or false if not present
		
		
	}
	
	
	
	public String searchForPlayer(String player){
		
		String nimmaPlayer=null;
		
		for(int num=0;num<playersName.length;num++){
			
			if(playersName[num]==player){
				
				nimmaPlayer=playersName[num];
				
			}
			
			
		}
		
		
		return nimmaPlayer;
		
	}
	
	
	
	public boolean deleteByPlayerName(String plyName){
		
		boolean isDeleted=false;
		
		int index=0;
		String teamAfterDeleted[]=new String[playersName.length-1];
		
		
		
		for(int num=0;num<playersName.length;num++){
			
			if(playersName[num]!=plyName){
				
				teamAfterDeleted[index++]=playersName[num];
				isDeleted=true;
			}
			else{
				
				System.out.println("Eleminated player:"+plyName);
			}
		}
		System.out.println("----------------------");
		System.out.println("The players are:   ");
		for(int num=0;num<teamAfterDeleted.length;num++){
			
			
			System.out.println(teamAfterDeleted[num]);
			
			
		}
		
		return isDeleted;
		
	}
	


}