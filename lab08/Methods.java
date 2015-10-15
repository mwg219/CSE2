///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////v
//Will Gilbert 
//CSE 02
//lab 8
//October 15, 2015
//The purpose of this lab is to develop a program that calculates mean and median of a set of ten numbers using methods. 
//compile the program
//  javac Methods.java//
//run the program
//  java Methods//
import java.util.Scanner;
public class Methods{
    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        double M;
        M = ((a + b + c + d + e + f + g + h + i + j) / 10);
        return M;
    }
    public static double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        double MM;
        MM = ((e + f) / 2);
        return MM;
    }
    
    public static void main(String[] args){
         Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double numOne = myScanner.nextDouble();
         System.out.print("Enter your second number: ");
          double numTwo = myScanner.nextDouble();
          System.out.print("Enter your third number: ");
           double numThree = myScanner.nextDouble();
           System.out.print("Enter your fourth number: ");
            double numFour = myScanner.nextDouble();
            System.out.print("Enter your fifth number: ");
             double numFive = myScanner.nextDouble();
             System.out.print("Enter your sixth number: ");
              double numSix = myScanner.nextDouble();
              System.out.print("Enter your seventh number: ");
               double numSeven = myScanner.nextDouble();
               System.out.print("Enter your eighth number: ");
                double numEight = myScanner.nextDouble();
                System.out.print("Enter your ninth number: ");
                 double numNine = myScanner.nextDouble();
                 System.out.print("Enter your tenth number: ");
                  double numTen = myScanner.nextDouble();
        double N;
        N = mean(numOne, numTwo, numThree, numFour, numFive, numSix, numSeven, numEight, numNine, numTen);
        System.out.println("mean = " + N);
        double NN;
        NN = median(numOne, numTwo, numThree, numFour, numFive, numSix, numSeven, numEight, numNine, numTen);
        System.out.println("median = " + NN);
        
    }
}