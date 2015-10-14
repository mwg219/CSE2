//compile the program
//  javac encrypted_y.java//
//run the program
//  java encrypted_y//
import java.util.Scanner;
public class encrypted_y{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an input between 0-100: ");
        int input = myScanner.nextInt();
        if(input > 100 || input < 1){
        
            System.exit(-1);
        }
        for(int i = 0; i < input; i++){ //sets bounds for lines and columns.  
        for(int j = 0; j < input; j++){ //sets bounds for lines and columns. 
            if((input - i) == j + 1 ){ //this prints a space for hidden x.
                System.out.print(" ");
            }
            else if(i == j ){ //this also contributes to printing of a hidden x.
               System.out.print(" "); 
            }
            else{
        System.out.print("*"); //prints the stars. 
        }
      
         System.out.println("");   
        

}
}      
    
}
}