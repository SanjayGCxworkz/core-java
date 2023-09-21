class ChatShop{

String chatNames[]=new String[10];  //creating object to add new values to array
int index;

	public boolean addNames(String chatName){
		boolean isAdded=false;
			
		if(index<chatNames.length){	  //to check index is within range
			
			if(chatName!=null){   //condition to check given value is null or notnull
				
				boolean exist=checkDuplicate(chatName);  // calling method to check duplicate
				
				if(exist==false){     // if false then new value is added
					chatNames[index]=chatName;
					isAdded=true;
					index++;
				}
				else{
					
					System.out.println("This item is already present! duplicate cannot added.");
					
				}
		
			}
			else{
				System.out.println("chat names not added");
		
			}
		}
		
		else{
			
			System.out.println("----------------------------");
			System.out.println("Index is out of range! further items cannot added.");
			
		}
		return isAdded;
	}

	
	
	
	public void getNames(){  //method to print each values in array
		
		System.out.println("Available chats are:");

		for(int num=0;num<chatNames.length;num++){
			System.out.println("              "+chatNames[num]);
		
		}
	
	
	}
	
	
	
	public boolean checkDuplicate(String name){  // method to check given value is already present
		
		boolean isPresent=false;
		for(int num=0;num<chatNames.length; num++){   // to access each values in array
			
			if(chatNames[num]==name){   //compare each value in array with new value
				
				isPresent=true;
				
			}
			
		}
		
		return isPresent;  //returns true if value present or false if not present
		
		
	}
	
	
	
	
	public String searchChats(String thindi){
		
		String item=null;
		
		for(int num=0;num<chatNames.length;num++){
			
			if(chatNames[num]==thindi){
				
				item=chatNames[num];
				
			}
			
			
		}
		
		
		return item;
		
	}
	
	
	
	public boolean deleteByChatsName(String chatsName){
		
		boolean isDeleted=false;
		
		int index=0;
		String chatsAfterDeleted[]=new String[chatNames.length-1];
		
		
		System.out.println("----------------------");
		System.out.println("The avaiable chats are:   ");
		
		for(int num=0;num<chatNames.length;num++){
			
			if(chatNames[num]!=chatsName){
				
				chatsAfterDeleted[index++]=chatNames[num];
				isDeleted=true;
			}
			else{
				
				System.out.println(chatsName+" is deleted");
			}
			
		}
		for(int num=0;num<chatsAfterDeleted.length;num++){
			
			int result=num+1;
			System.out.println("No."+result+":  "+chatsAfterDeleted[num]);
			
			
		}
		
		return isDeleted;
		
	}



}