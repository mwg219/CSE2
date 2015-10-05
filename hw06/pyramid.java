////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//CSE 02
//hw 6
//October 6, 2015
//The purpose of this homework is that it will use combination of loops, ask the user what size pyramid they want to display and then print a scalable pyramid.
//  first compile the program
//      javac pyramid.java
//  run the program
//      java pyramid//
import java.util.Scanner;
//define a class
public class pyramid{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("What size pyramid? ");
        int size = myScanner.nextInt();
        for(int i = 1; i <= size; i++) {
            for(int x = size - 1; x >= i; x--) {
                System.out.print(" ");
            }
                for (int y = 1; y<= i; y++) {
               System.out.print("*");
                }

           for (int z = 1; z <= i - 1; z++) {
               System.out.print("*");
           }

           System.out.println(" ");
            }
        }
}
         
         
         
              
 

    