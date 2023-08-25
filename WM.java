class WM{

static boolean button;
static float maxSpeed=10;
static float minSpeed;
static float presentSpeed;

// Method to turn on and off 
	public static boolean start(){
	
	if(button==false){
	
	button=true;
	
	System.out.println("");

	System.out.println("washing machine is on");
	System.out.println("--------------------");

	
	}
	else if(button==true){
	
	button=false;
	
	System.out.println("");

	System.out.println("washing machine is off");
	System.out.println("-----------------------");

	}
	return button;
	
	
	}
	
	// Method to increase speed
	public static void speedUp(){

		if(button==true){   //to turn on car
	
			if(presentSpeed<maxSpeed){
	
			presentSpeed++; //increasing car speed
			System.out.println("Machine speed:"+presentSpeed);

			}
			else{
	
			System.out.println("already at max speed");
	
			}
		}
		else{
	
		System.out.println("Please turn on Machine");
	
		}
	
	
	}
	
	// Method to decrease speed
	
	public static void speedDown(){

	if(button==true){
	
		if(presentSpeed>minSpeed){
	
		presentSpeed--;//to reduce the car speed
		System.out.println("Machine speed:"+presentSpeed);

		}
		else{
	
		System.out.println("low speed!");
	
		}
	}
	
	else{
	
		System.out.println("Please turn on Machine");
	
	}
	
	}
	
		
}