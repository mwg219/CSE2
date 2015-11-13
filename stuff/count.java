//compile the program
//  javac count.java//
//run the program
//  java count//
public class count{

    public boolean isSorted (int[] x) {
    boolean b = true;
for (int i=0; i<x.length-1; i++) {
   if (x[i] > x[i+1])
      b = false;
   else
      b = true;
}
return b;
  }
}