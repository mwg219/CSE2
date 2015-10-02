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
        System.out.print("Enter number of employee timesheets: ");
        double numEmp = myScanner.nextDouble();
        double totalpay = 0;
        for(int i = 0; i < numEmp; i++) {
            double totalhours = 0;
            System.out.print("Enter pay for employees: ");
            double numPay = myScanner.nextDouble();
            for(int j = 0; j < 5; j++) {
            System.out.print("Enter number of hours: ");
            totalhours = (totalhours + numEmp);
            }
            totalpay = totalpay + (numPay * totalhours);
        }
        System.out.println("The total payroll is " + totalpay);
    }
}