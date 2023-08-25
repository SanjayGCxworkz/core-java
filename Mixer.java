class Mixer{

static boolean isplug;
static int maxSpeed=7;
static int minSpeed;
static int presentSpeed;

// Method to turn on and off 
	public static boolean plug(){
	
	if(isplug==false){
	
	isplug=true;
		
	System.out.println("");
	System.out.println("Mixer is ON");
	System.out.println("-----------------------------------------");

	}
	else if(isplug==true){
	
	isplug=false;
	
	System.out.println("");
	System.out.println("Mixer is OFF");
	System.out.println("-----------------------------------------");

	}
	return isplug;
	
	
	}
	
	// Method to increase speed
	public static void speedUp(){

		if(isplug==true){
	
			if(presentSpeed<maxSpeed){
	
			presentSpeed++;
			System.out.println("It is runnig at "+presentSpeed+" speed");

			}
			else{
	
			System.out.println("It is already at Max speed");
	
			}
		}
		else{
	
		System.out.println("Switch on the mixer!");
	
	}
	
	
	
	}
	
	// Method to reduce speed
	
	public static void speedDown(){

	if(isplug==true){
	
		if(presentSpeed>minSpeed){
	
		presentSpeed--;
		System.out.println("It is runnig at "+presentSpeed+" speed");

		}
		else{
	
		System.out.println("mixer is at "+minSpeed+" speed");
	
		}
	}
	
	else{
	
	System.out.println("no response");
	
	}
	
	
	
	}
	
	
	
}