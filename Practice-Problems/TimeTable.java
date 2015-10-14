//compile program
//  javac TimeTable.java
//run the program
//  java TimeTable//
public class TimeTable{
    public static void main(String[] args){


System.out.print("* | 1 2 3 4 5 6 7 8 9");
for (int i = 1; i < 10; i++){
    System.out.print(i + "|");
    for (int j = 1; j < 10; j++){
        int k = j * i;
        System.out.print(k + "");
    }
System.out.print("");
}
}
}

