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
import java.util.Scanner;
public class move_array{
    
        public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please specify size of array: ");
        int size = myScanner.nextInt();
        int[] array = null;
        
        try{
            array = new int[size];
        }
        catch(Exception e){
            System.out.println("Invalid Size");
        }
        
        for(int i = 0; i < array.length; i++){
                array[i] = (int)(Math.random()*100);
                System.out.print(array[i] + "");
        }
            System.out.print("Enter size of index: ");
            int index = myScanner.nextInt();
            int temp = 0;
            try{
               temp = array[index]; 
            }
        catch(Exception e){
            System.out.println("Invalid Size");
        }
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[size - 1] = temp;
            for(int i =0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
        }
    }
