////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//CSE 2
//lab 12
//November 12, 2015
//The purpose of this lab is to write a program that moves the value at a specific index to the end of the array.
//compile the program
//  javac move_array.java//
//run the program
//  java move_array//
import.java.util.Scanner;
public class move_array{
    public static void move_array(int [] move){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please specify size of array: ");
        int size = myScanner.nextInt();
        
        try{
            int [] array = new int[size];
            size < 0;
            System.out.println("");
            
        }
        catch{
            System.out.println("");
        }
        for(int i = size; i++){
                array[i] = (int)(Math.random()*100);
            }
            System.out.println("Enter size of index: ");
            int index = myScanner.nextInt();
            try{
                
            }
        catch{
            
        }
            
        }
    }
}