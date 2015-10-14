/////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//October 8, 2015
//CSE 002
//Lab 7
//The purpose of this lab is to develop a program that hides a secret message X using while loops and break statements.
//compile the program
//  javac encrypted_x.java//
//run the program
//  java encrypted_x//
import java.util.Scanner;
public class encrypted_x{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an input between 0-100: ");//prompts the user to enter a number between 0-100. 
        int input = myScanner.nextInt();
        if(input > 0 || input < 100){//if the user enters a number that is less than 0 or greater than 100 the program will stop and exit. 
        }
        else {
            System.exit(-1);//exits the program. 
        }
        for(int i = 0; i < input; i++){//these two variables set up the number of rows and columns to form the stars. 
        for(int j = 0; j < input; j++){
            if(input - i == j + 1){//this sets up the spacing of lines in order to form the hidden x.
        System.out.print(" ");//prints the spaces.
        }
        else if(i == j){//this sets up the other spacing to form the hidden x.
            System.out.print(" ");//prints the spaces.
        }
        else{//this just prints out the stars. 
        System.out.print("*");
        }
        }
        System.out.println("");//this prints the number of lines. 
        }
       
    
}
}