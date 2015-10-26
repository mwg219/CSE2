//compile the program
//  javac MainMethod.java//
//run the program
//  java MainMethod//
import java.util.Scanner;
public class MainMethod {
    
  public int MultiDigit(int a, int b){

if(int a >= 0 && int b >= 0) {
int M;
M = a*(b*factorial(b-1));
return M;

}

else{

return 0;

}
}
public static void main(String[] args){
    System.out.print("Enter first integer: ");
    int a = myScanner.nextInt();
    System.out.print("Enter second integer: ");
    int b = myScanner.nextInt();
    
    int M;
    M = MultiDigit(a, b);
    System.out.println("The product = " + M);
}
}