class FaceBook{


	public static void main(String args[]){
	
	System.out.println("Main started");
	
	login(9110286610l,"san125");
	login("sanjay@gmail.com","san125");


	System.out.println("Main ended");
}

	public static void login(long phnumber,String passward){
	
	System.out.println("Invoked login");
	System.out.println("Login through phone number and passward");
	System.out.println("login ends");
	
	}


public static void login(String mailid,String passward){
	System.out.println("Invoked login");
	System.out.println("Login through E-mail id and passward");
	System.out.println("login ends");
	
	}
	


}