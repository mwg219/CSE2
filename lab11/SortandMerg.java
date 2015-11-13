////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//CSE 2
//lab 11
//November 5, 2015
//compile the program
//  javac SortandMerg.java//
//run the program
//  java SortandMerg//
import java.util.Arrays;
public class SortandMerg{
    public static void main(String[] args){
        
        int [] array = new int[20];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        int [] array2 = new int[10];
        for(int j = 0; j < array2.length; j++){
            array2[j] = (int)(Math.random()*100);
        }
        Arrays.sort(array2);
        for(int j = 0; j < array2.length; j++){
            System.out.println(array2[j]);
        }
        int [] array3 = new int[30];
        
    
}
    