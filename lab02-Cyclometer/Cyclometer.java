////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//Lab 2
//September 6, 2015
//CSE 02
//The purpose of this program is to calculate the times (minutes), rotations (counts), and distances (miles) of two trips.
// first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//
//  define a class
public class Cyclometer{
//  add main method
public static void main(String[] args) {
    int secsTrip1=360; //The amount of time (seconds) trip 1 lasted
    int secsTrip2=250; //The amount of time (seconds) trip 2 lasted
    int countsTrip1=5000; //The amount of rotations that occurred during trip 1
    int countsTrip2=3500; //The amount of rotations that occurred during trip 2
    double wheelDiameter=25.0, //The diameter of the wheel in inches
    PI=3.14159, //The actual number for PI is 3.14159
    feetPerMile=5280, //1 mile is equivalent to 5280 feet
    inchesPerFoot=12, //1 foot is equivalent to 12 inches
    secondsPerMinute=60; //1 minute is equivalent to 60 seconds
    double distanceTrip1, distanceTrip2,totalDistance; //distanceTrip1 = distance of the first trip, distanceTrip2 = distance of the second trip, and totalDistance = total distance of both trips.
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)
    +" minutes and had "+countsTrip1
    +" counts. ");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)
    +" minutes and had "+countsTrip2
    +" counts. ");
    //Above it is printing/calculating the amount of time in minutes and number of counts for Trip 1.
    //Above it is printing/calculating the amount of time in minutes and number of counts for Trip 2.
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
  }
}