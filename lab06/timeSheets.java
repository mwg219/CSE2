/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//October 1
//CSE 002
//lab 6
//The purpose if this lab is to prompt the user to enter a non-negative integer specifying the number of employee timesheets to be read in.
//  first compile program
//      javac.timeSheets.java
//  run the program
//      java timeSheets//
import java.util.Scanner;
public class timeSheets{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int totalhours = 0;//initializing variable for hours.
        
        System.out.print("Enter number of employee timesheets: "); //prompts user to enter amount of employee timesheets.
        int numEmp = myScanner.nextInt(); 
        System.out.print("Enter pay for employees: ");//prompts user to enter pay for employees.
        int numPay = myScanner.nextInt();
        
        for(int i = 0; i < numEmp; i++) { //this for loop runs for amount of of employee timesheets entered. 
            
            System.out.print("Enter hours worked on Monday: ");//prompts user for hours worked on Monday.
            int monHours = myScanner.nextInt();
            System.out.print("Enter hours worked on Tuesday: ");//prompts user for hours worked on Tuesday.
            int tuesHours = myScanner.nextInt();
            System.out.print("Enter hours worked on Wednesday: ");//prompts user for hours worked on Wednesday.
            int wednHours = myScanner.nextInt();
            System.out.print("Enter hours worked on Thursday: ");//prompts user for hours worked on Thursday.
            int thursHours = myScanner.nextInt();
            System.out.print("Enter hours worked on Friday: ");///prompts user for hours worked on Friday.
            int fridHours = myScanner.nextInt();
            
         totalhours = (numPay * (monHours + tuesHours + wednHours + thursHours + fridHours));//calculates the total hours worked 
            
        }
           int totalpay = (numEmp * totalhours);//calculates total payroll for employees.
        
        System.out.println("The total payroll is " + totalpay);
    }
}