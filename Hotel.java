class Hotel{
String menus[] = new String[10];
int index;

	public boolean addMenu(String menu){
		boolean isAdded = false;
		
		if(index<menus.length){
			if( menu != null){
				boolean exist=checkDuplicateExists(menu);
				if(exist==false){
				menus[index] = menu;
				isAdded = true;
				index++;
				}
				else{
					
					System.out.println(menu+" is already exist you cannot add");
					
				}
			}
			else{
				
				System.out.println("Menu is null ,not added");
			}
   
		}
		else{
			
			System.out.println(" Index is out of range!");
			
		}
		
	   return isAdded;
	}

	
	
	public void getMenu(){

		System.out.println("New menu added are :");
		for(index = 0 ; index<menus.length ; index++){
			System.out.println("                       "+menus[index]);
		}		
	}
	
	
	public boolean checkDuplicateExists(String menu){
		
		boolean exist=false;
		
		for(int num=0;num<menus.length;num++){
			
			if(menus[num]==menu){
				exist=true;
				
			}
			
		}
		return exist;
		
		
	}
	
	
	


}
