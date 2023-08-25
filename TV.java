class TV{

static boolean power;
static int presentVol;

// Method to turn on and off 
	public static boolean switching(){
	
	if(power==false){
	
	power=true;
	System.out.println("");
	System.out.println("TV is ON");
	System.out.println("-------------------------------------------");
	
	}
	else if(power==true){
	
	power=false;
	
	System.out.println("");
	System.out.println("TV is OFF");
	System.out.println("--------------------------------------------");
	}
	return power;
	
	
	}
	
	// Method to increase the volume
	public static void riseVolume(){
	
	int maxVol=50;
	
		if(power==true){
	
			if(presentVol<maxVol){
	
			presentVol=presentVol+5;
			System.out.println("TV volume >>"+presentVol);

			}
			else{
	
			System.out.println("Tv volume is at max");
	
			}
		}
		else{
	
		System.out.println("Please turn on TV");
	
	}
	
	
	
	}
	
	// Method to reduce the volume
	
	public static void downVolume(){
	int minVol=0;

	if(power==true){
	
		if(presentVol>minVol){
	
		presentVol=presentVol-5;
		System.out.println("TV volume >>"+presentVol);

		}
		else{
	
		System.out.println("TV is at low volume");
	
		}
	}
	
	else{
	
	System.out.println(" Please turn on TV ");
	
	}
	
	
	
	}
	
	
	
}