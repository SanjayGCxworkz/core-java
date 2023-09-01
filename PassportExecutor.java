class PassportExecutor{


	public static void main(String arg[]){
	
	System.out.println("main started");
	
	Passport passcard= new Passport("Bangalore","23/02/2001","Sanjay@23","Sanjay@24","sanjay@gmail.com","Sanjay");
	
	
	passcard.passwordcheck(passcard.password,passcard.confirmPassword);
	
	
	Passport passcard1= new Passport("Hassan","2/02/2004","Sachin@04","Sachin@04","sachingc@gmail.com","Sachin");
	
	
	
	passcard1.passwordcheck(passcard1.password,passcard1.confirmPassword);
	
	
	
	Passport passcard2= new Passport("Mangalore","17/07/2001","vivek#22","vivek#22","vivek@gmail.com","Veivek");
	
	
	passcard2.passwordcheck(passcard2.password,passcard2.confirmPassword);
	
	
	
	Passport passcard3= new Passport("Dharwad","31/01/2002","Yashu$234","Yashu$234","yashu@gmail.com","Yashoda");
	
	
	
	passcard3.passwordcheck(passcard3.password,passcard3.confirmPassword);
	
	
	
	Passport passcard4= new Passport("Shivamogga","4/09/2008","Sindhu#@","Sindhu@","sindhu@gmail.com","Sindhu");
	
	
	
	passcard4.passwordcheck(passcard4.password,passcard4.confirmPassword);
	
	
	
	Passport passcard5= new Passport("Bijapur","17/07/2000","kom","kom","komala@gmail.com","Komala");
	
	
	passcard5.passwordcheck(passcard5.password,passcard5.confirmPassword);
	
	
	
		System.out.println("main ended");

	
	
	}







}