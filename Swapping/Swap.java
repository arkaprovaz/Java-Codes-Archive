import java.util.*;
import java.io.*;

class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first variable ");
        a = sc.nextInt();
        System.out.println("Enter the second variable ");
        b = sc.nextInt();

        System.out.println("Before swapping : -  ");
        System.out.println("a= " + a + " b= " + b);
        
        c=a;
        a=b;
        b=c;

        System.out.println("After swapping : -  ");
        System.out.println("a= " + a + " b= " + b);

    }
}