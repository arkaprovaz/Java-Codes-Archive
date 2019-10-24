import java.util.Scanner;

class ArraySort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[10];
        int i, j, t;
        
        System.out.println("Enter the elements of array: ");
        for(i = 0; i <= 9; i++)
            a[i] = sc.nextInt();
        
        for(i = 0; i<= 9; i++)
            for(j = 0; j <= 9; j++)
                if(a[i] < a[j]) {
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
        System.out.println("\nThe array in ascending order is : ");
        
        for(i = 0; i<= 9; i++)
                System.out.print(" " + a[i]);
        
        System.out.println("\nThe array in descending order is : ");
        
        for(i = 9; i >= 0; i--)
                System.out.print(" " + a[i]);
        
        System.out.println();
    }
}