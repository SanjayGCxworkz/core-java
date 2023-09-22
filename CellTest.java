class CellTest{

	public static void main(String cel[]){
		
		Cell cell=new Cell();  //creating object using new keyword
		cell.setName("Durocell");
		cell.setCapacity("5V");
		cell.setDimension("0.5cm");
		
		
		Watch watch=new Watch();  
		watch.watchName="Fastrack";
		watch.cells=cell;   //Has-A relationship
		
		
		System.out.println("  "+watch.watchName);
		System.out.println("Cell discription: "+watch.cells.getName());
		System.out.println("		 "+watch.cells.getCapacity());
		System.out.println("		 "+watch.cells.getDimension());
		
		
		
		
	}
}