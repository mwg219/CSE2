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
//      define a class
public class Check{ //would not allow me to have Cookies as public class
        //main method required for every Java program 
        public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100; //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        double totalCost; 
        double costPerPerson;
        int dollars,    //whole dollar amount of cost
                dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        // get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g.,
        //  (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) %10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        }   //end of main method
} //end of class