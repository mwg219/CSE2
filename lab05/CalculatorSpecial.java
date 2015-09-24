////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//September 24, 2015
//CSE 02
//lab 5
//The purpose of this program is that it will work like the Calculator in lab 4 but the Calculator in this lab will the user for input.
//  first compile the program
//      javac CalculatorSpecial.java
//  run the program
//      java CalculatorSpecial//
import java.util.Scanner;
//define a class
public class CalculatorSpecial{
    // add main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    String Z = "";//This is the variable for the while statement.
    
    while(!Z.equals("n") && !Z.equals("N")){ //identifies the variable

    
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
    System.out.println("If you would like to stop type n or N");
    Z = myScanner.next();
    }
    }//end of main method
}//end of class