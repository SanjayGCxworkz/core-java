class Passport{

String passportOffice;
String dob;
String password;
String confirmPassword;
String email;
String userName;


public Passport(String office,String birth,String code,String confirmCode,String mail,String name){
	 passportOffice=office;
	 dob=birth;
	 password=code;
	 confirmPassword=confirmCode;
	 email=mail;
	 userName=name;
	System.out.println("objected is created:");
}
public void passportCreation(){

System.out.println("Welcome to passport seva website:");



}


public boolean passwordcheck(String word,String confirm){
	System.out.println("Inside verifypassword");
	boolean ispassword=false;
	int number1=word.length();
	int number2=confirm.length();
	boolean isequal=false;
	if(number1>=6 && number2>=6 && number1<=16 && number2<=16 ){
		
		System.out.println("Length comparsion");

         if(number1==number2){
		          isequal=true;
					System.out.println("password length: "+number1+" and confirm password length: "+number2);
						
						
						if (word==confirm){
						 ispassword=true;
						 System.out.println("password authentication is successfull....the given user details are:");

						 displayDetails();
			}


					else{

						System.out.println("Length is same but password missmatch, please give valied password!");
						System.out.println("-----------------------------------------");
						System.out.println("");
					}
			}


else{
	
		System.out.println("Length of Password and confirm password is not same");
		System.out.println("Please give valied password!");

		System.out.println("-------------------------------------------------");
	}

	}
	else{
		System.out.println(" Length should be greater than 6 and less than 16");
		
		
	}

return ispassword;

}



public void displayDetails(){
	
	System.out.println("Person name: "+userName);
	System.out.println("Person date of birth: "+dob);
	System.out.println("Office allocated for verification: "+passportOffice);
	System.out.println("Person email: "+email);
	System.out.println("Person password: "+password);
	System.out.println("------------------------------------");
		System.out.println("");


	
	
	
	
}



}