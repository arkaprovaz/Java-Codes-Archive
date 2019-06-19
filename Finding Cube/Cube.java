import java.io.*;
import java.util.*;
class Cube
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.println("Enter a number to calculate the Cube ");
        n = sc.nextInt();
        System.out.println(n*n*n);
    } 
}