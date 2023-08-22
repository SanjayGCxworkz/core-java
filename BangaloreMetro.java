class BangaloreMetro
{
 public static void main(String sanjay[])
 {
  String name = "Bangalore-Namma Metro";
  String purpleLaneStart = "Mysore Road";
  String purpleLaneEnd   = "Baiyappanahalli";
  String greenLaneStart = "Nagasandra";
  String greenLaneEnd  = "Puttenahalli";
  int purplePfNo  = 4;
  int greenPfNo = 2 ;
  int noOfCompartments = 8;
  String purpleRoute = " Deependranagar <> Attiguppe <> Vijayanagar <> Hosalli <> MagadiRoad <> City RailwayStation <> Majestic <> Sir.M. Vishveshwaraya <> Vidhana Soudha <> Cubbon park <> Mahatma Ghandi road <> Trinity <> Halasuru <> Indiranagar <> Swami Vivekanada road ";
  String greenRoute = "Dasarahalli <> Jalahalli <> Peenya industry <> Peenya <> Yeshwantahpura industry <> Yeshwantahpura <> Sandal Soap Factory <> Mahalakshmi <> Rajajinagar <> Kuvempu Road <> Srirampura <> Sampige Road <> Chikpete <> Krishna Rajendra Market <> National College <> Lallbagh <> Southern Circle <> Jayanagar <> RV road <> Bansakari <> Jayaprakash nagar ";
  String meetingJunction = "Majestic junction";
  System.out.println(" Name of the Metro City: " + name);
  System.out.println(" ");
  System.out.println(" Number of Boggies in each Metro train: " + noOfCompartments);
  System.out.println(" ");
  System.out.println(" Purple lane Starts from " +purpleLaneStart + " and ends at " + purpleLaneEnd );
  System.out.println(" ");
  System.out.println("Metro Stations under Purple lane are " + purpleRoute);
  System.out.println(" ");
  System.out.println(" Green lane Starts from " +greenLaneStart + " and ends at " + greenLaneEnd );
  System.out.println(" ");
  System.out.println("Metro Stations under Green lane are " + greenRoute);
  System.out.println(" ");
  System.out.println(purplePfNo+" is the Platform number for Purple lane " );
  System.out.println(" ");
  System.out.println(greenPfNo+" is the Platform number for Green lane ");
  System.out.println("");
  System.out.println("Both the lane meets at : " + meetingJunction);
  }
  }
  