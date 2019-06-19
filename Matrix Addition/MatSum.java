import java.util.Scanner;

class MatSum {
    public static void main(String args[]) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int sum[][] = new int[2][2];
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("********** Enter the elements of the First Matrix **********");
        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
                a[i][j] = sc.nextInt();
        System.out.println("********** Enter the elements of the Second Matrix **********");
        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
                b[i][j] = sc.nextInt();
        System.out.println("********** Sum of the two matrices **********");
        for(i=0;i<2;i++) {
            for(j=0;j<2;j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}