//compile program
//  javac HarmonicSum.java
//run the program
//  java HarmonicSum//

public class HarmonicSum{
    public static void main(String[] args){
        
     int n = 1;
     double x = 1;
     while(n<=50000){
         x += (1/n);
         n++;
     }
      System.out.print(x);  
}
}