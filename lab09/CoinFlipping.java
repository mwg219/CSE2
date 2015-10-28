//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//October 28, 2015
//CSE 2
//lab 9
//The purpose of this lab is to write a method that uses random numbers to simulate a flip of a coin.
//compile the program
//  javac CoinFlipping.java//
//run the program
//  java CoinFlipping//
import java.util.Scanner;
public class CoinFlipping{
    public static void flip(){//This method determines the coin flipping and whether the output is heads or tails.
        double Coin = 0;
        Coin = Math.round(Math.random());//This determines the random coin flips. 
        if(Coin == 0){
            System.out.println("Tails");//This prints tails.
        }else{
            System.out.println("Heads");//This prints heads. 
        }
        
    }
    public static void main(String[] args){// main method
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 100: ");//This prompts the user to enter an integer between 0 and 100. 
        int number = myScanner.nextInt();
        if(number == 0){
            flip();//If the user enters the number 0 then it flips once. 
        }else{
            if(number < 0 || number > 100){// if the user enters any number that is less than 0 or greater than 100 then the program exits. 
                System.out.println("Invalid Number!");
                System.exit(-1);
            }else{
            flip(number);//flips the number of times the user enters as long as it is between 0 and 100. 
        }
    }
    }
    
    public static void flip(int number){//method that takes the integer as the parameter. 
        
        for(int i = 0; i < number; i++){//This causes the program to loop the number of times the user enters as long as it is between 0 and 100.
            flip();
        }
    }
}

