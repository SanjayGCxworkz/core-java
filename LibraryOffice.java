class LibraryOffice{

	public static void main(String arg[]){  //main method
	
		String works[]={"Journals","Indian paintings","art","architecture","Research activities"};
		
		System.out.println("Main started");
		
		Library library=new Library();  // creating an object 
		library.other(works); //calling method to print an given array
		
		System.out.println("Main ended");

	
	}


}