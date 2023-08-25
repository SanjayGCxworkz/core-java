class ToyCar{

static boolean status;
static float maxSpeed=5;
static float minSpeed;
static float presentSpeed;

// Method to turn on and off 
	public static boolean start(){
	
	if(status==false){
	
	status=true;
	
	System.out.println("car is activated");
	
	}
	else if(status==true){
	
	status=false;
	
	System.out.println("car is at off condition");
	
	}
	return status;
	
	
	}
	
	// Method to increase speed
	public static float topSpeed(){

		if(status==true){   //to turn on car
	
			if(presentSpeed<maxSpeed){
	
			presentSpeed++; //increasing car speed
			
			}
			else{
	
			System.out.println("Go slow already at max speed!");
	
			}
		}
		else{
	
		System.out.println("Please start the car first");
	
		}
	
	return presentSpeed;
	
	}
	
	// Method to slow down car
	
	public static float downSpeed(){

	if(status==true){
	
		if(presentSpeed>minSpeed){
	
		presentSpeed--;//to reduce the car speed

		}
		else{
	
		System.out.println("It is already at low speed");
	
		}
	}
	
	else{
	
	System.out.println("speed cannot reduce because car is off ");
	
	}
	return presentSpeed;
	
	}
	
		
}