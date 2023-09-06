class PatientForm{


	public static void main(String arg[]){
	
		Patient patient=new Patient();
		
		patient.setWardNumber(1);
		System.out.println("Patient ward number: "+ patient.getWardNumber());
		
		
		
		patient.setPatientName("Thomas");
		System.out.println("Patient name : "+ patient.getPatientName());
		
		
		
		patient.setDiseases("Covid");
		System.out.println("Diseases : "+ patient.getDiseases());
		
		
		
		patient.setAge(22);
		System.out.println("Patient age: "+ patient.getAge());
		
		
		
		
		patient.setGender("Male");
		System.out.println("patient gender  : "+ patient.getGender());
		
		
		patient.setContactNumber(9110286610l);
		System.out.println("Patient phone number : "+ patient.getContactNumber());
		
		
		patient.setAddress("Bangalore");
		System.out.println("Hospital location: "+ patient.getAddress());
		
		
		patient.setConsultantDoctor("Dr.Biswas");
		System.out.println("Consult Doctor: "+ patient.getConsultantDoctor());
		
		
		patient.setDate("23 feb");
		System.out.println("Date of addmit: "+ patient.getDate());
			
	}




}