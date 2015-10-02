//////////////////////////////////
//  first compile the program
//      javac Randy.java
//  run the program
//      java Randy//
//define a class

public class Randy{

public static void main(String[] args) {
    int p = 3, q = 1, sum = 0;
while (p <= 10)
{
     sum += p % q;
     p++;
     q++;
     break;
}


}
}