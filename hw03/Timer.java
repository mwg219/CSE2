////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//hw03
//CSE 02
//Septmeber 15, 2015
//The purpose of this program is to calculate how time there is in hours and minutes until dinner starts. 
//first compile program
//      javac Timer.java
//run the program
//      java Timer//
import java.util.Scanner;
//define a class
public class Timer{
    //add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the current time: ");//enters the current time any time in military time.
        int nowTime = myScanner.nextInt(); //this is the method for the current time.
        System.out.print("Enter the time that you will be eating dinner: ");//enters the time you will be eating dinner in military time. 
        int laterTime = myScanner.nextInt(); //this is the method for the time until dinner
        int totalTime = (laterTime - nowTime); //calculates time in military hours. 
        int hours, //whole time of hours 
                minutes; //plus additional minutes 
                
        
        hours = (totalTime / 100);// this calculates the hours of the time until dinner.
        minutes=(totalTime % 100); //calculates the amount of minutes of the time until dinner.
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner" + '.');
    } // end of main method
} //end of class