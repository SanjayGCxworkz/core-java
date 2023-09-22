class PatientTest{

	public static void main(String test[]){
		
		Patient patient=new Patient();  //creating object using new keyword
		patient.setPatientName("Reventh gowda");
		patient.setAddress("Hassan");
		patient.setAge(27);
		
		
		Hospital hospital=new Hospital();  
		hospital.hospitalName="Sparsha hospital";
		hospital.person=patient;   //Has-A relationship
		
		
		System.out.println("Hospital name :"+hospital.hospitalName);
		System.out.println("Patient name: "+hospital.person.getPatientName());
		System.out.println("Patient address: "+hospital.person.getAddress());
		System.out.println("Patient age: "+hospital.person.getAge()+"years");
		
		
		
		
	}
}