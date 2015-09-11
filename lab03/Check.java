////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//lab 03
//September 10, 2015
//CSE 02
//The purpose of this lab is to design a program that uses the Scanner class to obtain from the user the original cost of the check, the percentage tip the friends wish to pay and the number of ways the check will be split. This program will also determine how much each person in the group needs to spend in order to pay the check.
//first compile the program
//      javac Check.java
//run the program
//      java Check//
import java.util.Scanner;

public class Cookies{
        //main method required for every Java program 
        public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100 //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        double totalCost; 
        double costPerPerson;
        int dollars,    //whole dollar amount 
        }   //end of main method
} //end of class