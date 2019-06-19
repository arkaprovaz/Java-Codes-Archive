import java.util.Scanner;

class fibo
{
    public static void main(String args[])
    {
        int a=0,b=1,c,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series upto limit "+ n);
        System.out.print(a + " " + b);
        for (i=0;i<n-2;i++) {
            c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
        }

    }
}