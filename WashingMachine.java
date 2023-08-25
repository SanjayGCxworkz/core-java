class WashingMachine{

static boolean machineStatus;
static String type[]={"Nylon","cotton","Bedsheet","Normal"};
static int maxNylon=14;
static int maxCotton=10;
static int maxBedsheet=6;
static int maxNormal=20;
static int currentSpeed;
static int minSpeed;

public static boolean button(){

if(machineStatus==false){
machineStatus=true;
System.out.println("Machine is ready to work");
}

else if(machineStatus==true){
machineStatus=false;
System.out.println("Machine is Off");

}
return machineStatus;
}


public static void speedUp(){
if(machineStatus==true){
	
	for(int num=0;num<type.length;num++){
		
		if(type[num]=="Nylon"){
		
			if(currentSpeed<maxNylon){
			
			currentSpeed=currentSpeed+2;
			System.out.println("Running at speed: "+currentSpeed);

			
			}
			else{
			
			System.out.println("It is running at max speed for Nylon cloths");
			
			}
		}
		
		else if(type[num]=="cotton"){
			
			if(currentSpeed<maxCotton){
			
			currentSpeed=currentSpeed+2;
			System.out.println("Running at speed: "+currentSpeed);
			
			}
			else{
			
			System.out.println("It is running at max speed for cotton cloths");
			
			}
		
		}
		else if(type[num]=="Bedsheet"){
			
			if(currentSpeed<maxBedsheet){
			
			currentSpeed=currentSpeed+2;
			System.out.println("Running at speed: "+currentSpeed);
			
			}
			else{
			
			System.out.println("Heavy load cannot speedUp above this ");
			
			}
		}
		else if(type[num]=="Normal"){
			
			if(currentSpeed<maxNormal){
			
			currentSpeed=currentSpeed+2;
			System.out.println("Running at speed: "+currentSpeed);
			
			}
			else{
			
			System.out.println("Top speed reached ");
			
			}
		}
	
	}

}
else{

System.out.println("First turn on Machine please!");

}

}





public static void speedDown(){
if(machineStatus==true){
	
	for(int num=0;num<type.length;num++){
		
		if(type[num]=="Nylon"){
		
			if(currentSpeed>minSpeed){
			
			currentSpeed=currentSpeed-2;
			System.out.println("Running at speed: "+currentSpeed);

			
			}
			else{
			
			System.out.println("low speed ");
			
			}
		}
		
		else if(type[num]=="cotton"){
			
			if(currentSpeed>minSpeed){
			
			currentSpeed=currentSpeed-2;
			System.out.println("Running at speed: "+currentSpeed);
			
			}
			else{
			
			System.out.println("low speed ");
			
			}
		
		}
		else if(type[num]=="Bedsheet"){
			
			if(currentSpeed>minSpeed){
			
			currentSpeed=currentSpeed-2;
			System.out.println("Running at speed: "+currentSpeed);
			
			}
			else{
			
			System.out.println("low speed ");
			
			}
		}
		else if(type[num]=="Normal"){
			
			if(currentSpeed>minSpeed){
			
			currentSpeed=currentSpeed-2;
			System.out.println("Running at speed: "+currentSpeed);
			
			}
			else{
			
			System.out.println("low speed reached");
			
			}
		}
	}

}
else{

System.out.println("First turn on Machine please!");

}

}



}