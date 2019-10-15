public class MatixMultiplication
{
    public static void main(String args[])
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimensions of matrices");
        n = input.nextInt();
        int[][] f = new int[n][n];
        int[][] s = new int[n][n];
        int[][] t = new int[n][n];
        System.out.println("Enter the elements of 1st matrix row wise \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                f[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix row wise \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                s[i][j] = input.nextInt();
            }
        }
      
        for (int i = 0; i < n; i++)          //Multiplying the matrices
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    t[i][j] = t[i][j] + f[i][k] * s[k][j];
                }
            }
        }
        System.out.println("Result Of Multiplication is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
      
    }
}