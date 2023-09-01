class LensKartOperation{

public static void main(String lens[]){
	
	
	System.out.println("Main started:");

	LensKart glass=new LensKart("LensKart","Sun glass",1,"Black","Wayfarer",1);



	glass.provideProduct();



	LensKart glass2=new LensKart("LensKart","PIRASO",2,"Black with red","Wayfarer",3);



	glass2.provideProduct();



	LensKart glass3=new LensKart("LensKart","Poloport",3,"Gold with Black","Wayfarer",2);



	glass3.provideProduct();



	LensKart glass4=new LensKart("LensKart","John jacobs",4,"Silver","UV protection",3);



	glass4.provideProduct();



	LensKart glass5=new LensKart("LensKart","Silver kartz",5,"Gold with silver","Wayfarer",5);



	glass5.provideProduct();
	System.out.println("Main ended:");



}



}