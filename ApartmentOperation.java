class ApartmentOperation{

//className referanceVariableName= new className();

                 public static void main(String arg[]){
					 
					 System.out.println("main started:");


                    Apartment building=new Apartment("Jindal",1,"Madhavara",25,75,45);
                      building.provideAcomadation();

                    Apartment building2=new Apartment("Jindal",2,"Penya",30,90,60);
                    building2.provideAcomadation();


					Apartment building3=new Apartment("Jindal",3,"Nelamangla",40,160,80);
					building3.provideAcomadation();


					Apartment building4=new Apartment("Jindal",4,"Dasarahalli",15,75,25);
					building4.provideAcomadation();


					Apartment building5=new Apartment("Jindal",5,"Hassan",30,80,55);
					building5.provideAcomadation();
					
					 System.out.println("main ended:");



                 }



}