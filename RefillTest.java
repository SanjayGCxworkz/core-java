class RefillTest{

	public static void main(String test[]){
		
		Refill refill=new Refill();  //creating object using new keyword
		refill.setColor("Blue");
		refill.setType("Gel");
		refill.setLength(7);
		
		
		Pen pen=new Pen();  
		pen.penName="Montex";
		pen.lead=refill;   //Has-A relationship
		
		
		System.out.println("Pen name: "+pen.penName);
		System.out.println("Ink colour: "+pen.lead.getColor());
		System.out.println("Pen type: "+pen.lead.getType());
		System.out.println("Length of refill: "+pen.lead.getLength()+"cm");
		
		
		
		
	}
}