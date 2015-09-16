/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//hw03
//CSE 02
//September 15, 2015
//The purpose of this program is to calculate the volume and surface area of a block when the user is given the length, width, and height.
//first compile program
//      javac Block.java
//run the program
//      java Block//
import java.util.Scanner;
//define a class
public class Block{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.print("Enter length of block: ");//enters the length of the block. 
        double blockLength = myScanner.nextDouble();
        System.out.print("Enter width of block: ");//enters the width of the block.
        double blockWidth = myScanner.nextDouble();
        System.out.print("Enter height of block: ");//enters the height of the block.
        double blockHeight = myScanner.nextDouble();
        double blockVolume;
        double blockSurfaceArea;
        blockVolume = blockHeight * blockLength * blockWidth; //calculates the volume of the block.
        blockSurfaceArea = (2 * (blockHeight * blockLength)) + (2 * (blockWidth * blockLength)) + (2 * (blockWidth * blockHeight)); //calculates the surface area of the block.
        System.out.println("The volume of the block is "  + blockVolume + '.');
        System.out.println("The surface area of the block is "  + blockSurfaceArea + '.');
    }   //end main method
} //end of class