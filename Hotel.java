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
			int result=index+1;
			System.out.println("No."+result+":  "+menus[index]);
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
	
	
	
	public String searchInList(String list){
	
	
		String group=null;
		
		for(int num=0;num<menus.length;num++){
			
			if(menus[num]==list){
				
				group=menus[num];
			}
			
			
			
		}
	
	return group;
	
	}
	
	public boolean deleteByMenuName(String menuName){
		
		boolean isDeleted=false;
		
		int index=0;
		String menusAfterDeleted[]=new String[menus.length-1];
		
		
		System.out.println("----------------------");
		System.out.println("The avaiable menu are:   ");
		
		for(int num=0;num<menus.length;num++){
			//peri-peri!=Burger
			if(menus[num]!=menuName){
				
				menusAfterDeleted[index++]=menus[num];
				isDeleted=true;
			}
			else{
				
				System.out.println(menuName+" is deleted");
			}
			
		}
		for(int num=0;num<menusAfterDeleted.length;num++){
			
			int result=num+1;
			System.out.println("No."+result+":  "+menusAfterDeleted[num]);
			
			
		}
		
		return isDeleted;
		
	}
	
	


}
