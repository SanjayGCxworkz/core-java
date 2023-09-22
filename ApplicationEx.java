class ApplicationEx{

	public static void main(String appli[]){
		
		Application app=new Application();  //creating object using new keyword
		app.setName("Free fire");
		app.setSizeInMb(238d);
		app.setCompanyName("google");
		app.setVersion("V2.1");
		app.setRating("5 star");
		
		PlayStore store=new PlayStore();  
		store.managedBy="google";
		store.application=app;   //Has-A relationship
		
		
		System.out.println("Details of :"+store.application.getName()+" app");
		
		System.out.println("		"+store.application.getSizeInMb());
		System.out.println("		"+store.application.getCompanyName());
		System.out.println("		"+store.application.getVersion());
		System.out.println("		"+store.application.getRating());
		
		System.out.println("company name:   "+store.managedBy);
		
	}
}