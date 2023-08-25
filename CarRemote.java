class CarRemote{

public static void main(String[] car){

System.out.println("Main started");

ToyCar.start();//to turn on car

float speed1=ToyCar.topSpeed();
System.out.println("Speed of car: "+speed1);
speed1=ToyCar.topSpeed();
System.out.println("Speed of car: "+speed1);
 speed1=ToyCar.topSpeed();
System.out.println("Speed of car: "+speed1);
speed1=ToyCar.topSpeed();
System.out.println("Speed of car: "+speed1);
 speed1=ToyCar.topSpeed();
System.out.println("Speed of car: "+speed1);
 speed1=ToyCar.topSpeed();
System.out.println("Speed of car: "+speed1);

float speed2=ToyCar.downSpeed();
System.out.println("Speed of car: "+speed2);
 speed2=ToyCar.downSpeed();
System.out.println("Speed of car: "+speed2);
 speed2=ToyCar.downSpeed();
System.out.println("Speed of car: "+speed2);
 speed2=ToyCar.downSpeed();
System.out.println("Speed of car: "+speed2);
 speed2=ToyCar.downSpeed();
System.out.println("Speed of car: "+speed2);
 speed2=ToyCar.downSpeed();
System.out.println("Speed of car: "+speed2);


ToyCar.start();//to turn off car
 speed1=ToyCar.topSpeed();
 speed2=ToyCar.downSpeed();

System.out.println("Main ended");
}

}