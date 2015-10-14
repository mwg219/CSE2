//compile program
//  javac ComputePi.java
//run the program
//  java ComputePi//

public class ComputePi{
    public static void main(String[] args){
        double Pi = 0;
        for (int p = 1; p <= 50000; p = p+4){
            Pi = Pi + (1/p) - (1/(p+2));
        }
        System.out.print(4 * Pi);
    }
}