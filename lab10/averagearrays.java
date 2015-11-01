////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//CSE 2
//lab 10
//OCtober 29, 2015
//compile the program
//  javac averagearrays.java//
//run the program
//  java averagearrays//
import java.util.Scanner;
public class averagearrays{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");//This prompts the user to enter the number of values to be stored in the array. 
        int num = myScanner.nextInt();
        
        int [] array = new int[num];//This declares the array
        for(int i = 0; i < num; i++){//this loop assigns random numbers to the array
        array[i] = (int)(Math.random()*100);//This is calculates the random number
        }
        for(int i = 0; i < array.length; i++){//This loop prints out the array values
            System.out.println(array[i]);//
        }
        int sum = 0;
        int average = 0;
        for(int i = 0; i < array.length; i++){//this loop calculates the sum of the values
            sum += array[i];//This calulates the sum of the values
            average = sum / array.length;//This calculates the average of values
        }
        System.out.println("The sum is " + sum); //prints the sum of the values
        System.out.println("The average is " + average); //prints the values of the average
        for(int i = 0; i < array.length; i++){//this loop prints the values in the array greater than or equal to the average. 
            if(array[i] >= average){
                System.out.println("This value is greater than or equal to the average: " + array[i]);
                
            }
        }
        
    }
}