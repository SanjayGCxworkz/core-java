class Speaker{

static boolean isconnected;
static int highVolume=6;
static int lowVolume;
static int presentVolume;

// Method to turn on and off 
	public static boolean switching(){
	
	if(isconnected==false){
	
	isconnected=true;
	
	System.out.println("Speaker is ON");
	
	}
	else if(isconnected==true){
	
	isconnected=false;
	
	System.out.println("Speaker is OFF");
	
	}
	return isconnected;
	
	
	}
	
	// Method to increase the volume
	public static void highVolume(){

		if(isconnected==true){
	
			if(presentVolume<highVolume){
	
			presentVolume++;
			System.out.println("current volume :"+presentVolume);

			}
			else{
	
			System.out.println("Speaker is at Max volume");
	
			}
		}
		else{
	
		System.out.println("Please turn on speaker");
	
	}
	
	
	
	}
	
	// Method to reduce the volume
	
	public static void lowVolume(){

	if(isconnected==true){
	
		if(presentVolume>lowVolume){
	
		presentVolume--;
		System.out.println("current volume :"+presentVolume);

		}
		else{
	
		System.out.println("Speaker is at low volume");
	
		}
	}
	
	else{
	
	System.out.println("Not working");
	
	}
	
	
	
	}
	
	
	
}