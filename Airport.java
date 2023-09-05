class Airport{


String name;
String owner;
int elevation;
String opened;
String code;


	public Airport(){
	
		this("Shivamogga Airport","Gov of Karnataka",615,"27 feb 2023","RQY");
		System.out.println("Default constructor is invoked");
	
	}


	public Airport(String name,String owner,int elevation,String opened,String code){
		
		
		this.name=name;
		this.owner=owner;
		this.elevation=elevation;
		this.opened=opened;
		this.code=code;
	
		display();
	
	}
	
	public void display(){
	
		System.out.println("Airport Name: "+this.name);
		System.out.println("Airport owner: "+this.owner);
		System.out.println("Airport elevation: "+this.elevation+"m");
		System.out.println("Airport opened: "+this.opened);
		System.out.println("Airport code: "+this.code);

	
	
	
	}

}