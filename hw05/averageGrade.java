///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//September 24, 2015
//CSE 02
//hw 5
//The purpose of this program is that it will use a while a statement to continuosly request a grade to be entered and When a grade of 999 is entered, the program should exit the repetition loop and compute and display the average of the valid grades entered.
//  first compile the program
//      javac averageGrade.java
//  run the program
//      java averageGrade//
import java.util.Scanner;
//define a class
public class averageGrade{
    // add main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    double avgGrade = 0;//This the variable for the grade average.
     double numGrade = 0;//This the variable for the grade entered.
    
    while(avgGrade < 999){//This the while loop that will run if the grade is less than 999.
    
    System.out.print("Enter Grade: "); //This prompts the user for a grade.
    
    double Grade = myScanner.nextDouble();
    
    if(Grade >= 0 && Grade <= 100){ //This is the if statement. If the grade entered is less than or equal to 0 or greater than or equal to 0 then it will run.
    
    avgGrade += Grade; //This stores the total sum of the grades entered.
    numGrade++; //Amount times this loop runs.
    }
    else{ //If grade entered does not meet the requirements of the if statement then this loop will stop and print out 'invalid grade.'
    System.out.print("Invalid Grade has been Entered! Try again:  ");
    }
    if(avgGrade > 999){ //If the average grade is greater than 999 then the program will exit loop.
        System.out.println("The Average of Valid grades entered is " + (avgGrade / numGrade) ); //Calculates and prints average of grades entered.
        break;
    }
    }
    }
}