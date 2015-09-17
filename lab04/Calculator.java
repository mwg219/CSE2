////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//September 17, 2015
//CSE 02
//The purpose of this program is that it will work like a calculator. This program will prompt the user for two integers a and b and an operator. 
//  first compile the program
//      javac Calculator.java
//  run the program
//      java Calculator//
import java.util.Scanner;
//define a class
public class Calculator{
    // add main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Enter first integer: "); //Enters first integer.
    double numOne = myScanner.nextDouble(); 
    System.out.print("Enter second integer: "); //Enters second integer.
    double numTwo = myScanner.nextDouble();
    System.out.print("Enter operator: "); //Enters operator.
    String numOpe = myScanner.next();//this is the operator class
    double multiInt = (numOne * numTwo); //multiplication operator is multiInt.
    double dividInt = (numOne / numTwo); //division operator is dividInt.
    double addInt = (numOne + numTwo); //addition operator is addInt.
    double subInt = (numOne - numTwo); //subtracting operator is subInt.
    
    switch( numOpe ){ //identifies operator 
        case "*":
            System.out.println( multiInt ); //multiplication operator
            break;
        case "/":
            System.out.println( dividInt );//division operator 
            break;
        case "+":
            System.out.println( addInt );//addition operator
            break;
        case "-":
            System.out.println( subInt  );//subtraction operator
            break;
        default: 
            System.out.println("Illegal Operator");
            break;
    }
    }//end of main method
}//end of class