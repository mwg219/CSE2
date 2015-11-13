//compile the program
//  javac MainMethod.java//
//run the program
//  java MainMethod//

public class MainMethod {
    
  public static void main(String[] args){
    int[] list1 = {1, 2, 3};
   int[] list2 = list1;
   list2[0] = 5;
   for (int i = 0; i < 3; i++)
   {
       System.out.print(list1[i] + " ");
   }
  }
}
