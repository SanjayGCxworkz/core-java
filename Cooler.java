class Cooler{

static boolean status;
static int maxTemprature=31;
static int minTemprature=20;
static int presentTemprature=27;

// Method to turn on and off 
	public static boolean switching(){
	
	if(status==false){
	
	status=true;
	
	System.out.println("cooler is ON");
	System.out.println("-----------------------");

	
	}
	else if(status==true){
	
	status=false;
	
	System.out.println("cooler is OFF");
	System.out.println("-----------------------");

	}
	return status;
	
	
	}
	
	// Method to rise temp
	public static void riseTemp(){

		if(status==true){
	
			if(presentTemprature<maxTemprature){
	
			presentTemprature++;
			System.out.println("current temprature :"+presentTemprature);

			}
			else{
	
			System.out.println("It is already at Max temprature");
	
			}
		}
		else{
	
		System.out.println("Please turn on cooler");
	
	}
	
	
	
	}
	
	// Method to reduce temprature
	
	public static void downTemprature(){

	if(status==true){
	
		if(presentTemprature>minTemprature){
	
		presentTemprature--;
		System.out.println("current temprature :"+presentTemprature);

		}
		else{
	
		System.out.println("It is already below min temprature");
	
		}
	}
	
	else{
	
	System.out.println("Could not reduce the temprature without turning on the cooler");
	
	}
	
	
	
	}
	
	
	
}