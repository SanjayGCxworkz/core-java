public class AsteriskPatternProgram1{

    public static void printLeftRightAngleTriangle(){
        int sizeOfPattern=5;
        System.out.println("Left right angle triangle:pattern 1");
        for (int row=1;row<=sizeOfPattern;row++){
            for (int column=1;column<=row;column++){
                System.out.print("*"+" ");
            }
            System.out.println("  ");
        }
    }

    public static void printRightSideRightAngleTriangle(){
        int sizeOfPattern=5;
        System.out.println("Right side right angle triangle:pattern2");
        for (int row=1;row<=sizeOfPattern;row++){
            for (int column=sizeOfPattern;column>=1;column--){
                if (row>=column){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }


    public static void printUltaRightAngleTriangle(){
        int sizeOfPattern=5;
        System.out.println("Ulta right angle triangle: pattern 3");
        for(int row=1;row<=sizeOfPattern+1;row++){
            for (int column=1;column<=sizeOfPattern+1;column++){
                if (column<=row){
                    System.out.print("");

                }
                else {
                    System.out.print("*"+" ");
                }

            }
            System.out.print("\n");
        }
    }

    public static void printHallowRightAngleTriangle(){
        int size=5;
        System.out.println("Print hallow right angle triangle: ");
        for (int row=1;row<=size;row++ ){
            for (int  column=1;column<=size;column++){
                if(column==1|| column==row || row==size){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        printHallowRightAngleTriangle();
        printLeftRightAngleTriangle();
        printRightSideRightAngleTriangle();
        printUltaRightAngleTriangle();
    }
}

//output:
//Print hallow right angle triangle:
//*
//* *
//*   *
//*     *
//* * * * *
//Left right angle triangle:pattern 1
//*
//* *
//* * *
//* * * *
//* * * * *
//Right side right angle triangle:pattern2
//    *
//   **
//  ***
// ****
//*****
//Ulta right angle triangle: pattern 3
//* * * * *
//* * * *
//* * *
//* *
//*