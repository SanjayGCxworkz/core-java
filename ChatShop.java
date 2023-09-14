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



}