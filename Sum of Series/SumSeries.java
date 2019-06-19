import java.util.Scanner;

// Program to calculate the sum of the square of the first n natural numbers which is given by the formula

class SumSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, s=0;
        System.out.println("Enter the value of n ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            s = s+(i*i);
        System.out.println("The sum of the series is: "+s);
    }
}