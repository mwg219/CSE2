//compile the program
//  javac ARRAY.java//
//run the program
//  java ARRAY//
import java.util.Arrays;
public class ARRAY{
    public static void main(String[] args){
        int[] array = new int[-5];
        for(int i = 0; i < array.length; i++){
            array[i] =  array[i] = (int)(Math.random()*100);
        } 
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}