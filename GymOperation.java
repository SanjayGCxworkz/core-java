class GymOperation{

	public static void main(String arg[]){  //main method
	
		String types[]={"Rowing machine","Dumbells","Exercicer","Treadmills","Fitness bench","Hand gripper","Strengthner"};
		
		System.out.println("Main started");
		
		Gym gym=new Gym();  // creating an object 
		gym.fit(types); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}