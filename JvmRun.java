class JvmRun{

	public static void main(String run[]){
		
		JVM jvm=new JVM();  //creating object using new keyword
		jvm.setFullName("Java virtual machine");
		jvm.setWhatDoes("Reads bytecode and execute it");
		jvm.setBits(32);
		
		
		Java javaProgram=new Java();  
		javaProgram.programType="Object oriented";
		javaProgram.interpreter=jvm;   //Has-A relationship
		
		
		System.out.println("Which type of programming language: "+javaProgram.programType);
		System.out.println("Full form of jvm: "+javaProgram.interpreter.getFullName());
		System.out.println("Whats does jvm do: "+javaProgram.interpreter.getWhatDoes());
		System.out.println("Size of jvm: "+javaProgram.interpreter.getBits()+"bits");
		
		
		
		
	}
}