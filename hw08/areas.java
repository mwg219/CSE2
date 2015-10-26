//compile the program
//  javac areas.java//
//run the program
//  java areas//
import java.util.Scanner;
public class areas {
    public static double areas(double circle){
    double areaC;
    areaC = (3.14)*((circle)*(circle));
    return areaC; 
    }
    public static double areas(double recLen, double recWid){
    double recArea;
    recArea = (recLen)*(recWid);
    return recArea;
    }
    public static double areas(double trapHeight, double trapBaseOne, double trapBaseTwo){
    double trapArea;
    trapArea = (((trapBaseOne + trapBaseTwo)/2)*(trapHeight));
    return trapArea;
    }
    public static void main(String[] args){
       
       double x = 0;
       while (x == 0){
        Scanner myScanner = new Scanner(System.in); 
        System.out.print("Enter 7 for Circle, 77 for Rectangle, or 777 for Trapezoid: ");
        double shape = myScanner.nextDouble();
        
        if(shape == 7){
            System.out.print("Enter radius: ");
            double circle = myScanner.nextDouble();
            double areaC;
            areaC = areas(circle);
            System.out.println("Area of the Circle = " + areaC);
            x++;
        }
        else if(shape == 77){
            System.out.print("Enter length of Rectangle: ");
            double recLen = myScanner.nextDouble();
            System.out.print("Enter width of Rectangle: ");
            double recWid = myScanner.nextDouble();
            double recArea;
            recArea = areas(recLen, recWid);
            System.out.println("Area of Rectangle = " + recArea);
            x++;
        }
        else if(shape == 777){
            System.out.print("Enter height of Trapezoid: ");
            double trapHeight = myScanner.nextDouble();
            System.out.print("Enter base one of Trapezoid: ");
            double trapBaseOne = myScanner.nextDouble();
            System.out.print("Enter base two of Trapezoid: ");
            double trapBaseTwo = myScanner.nextDouble();
            double trapArea;
            trapArea = areas(trapHeight, trapBaseOne, trapBaseTwo);
            System.out.println("Area of Trapezoid = " + trapArea);
            x++;
            
        }
        else if(shape == 999){
            System.exit(-1);
        }
        else{
            System.out.println("Invalid Number!");
            
        }
        }
       }
        
    }

