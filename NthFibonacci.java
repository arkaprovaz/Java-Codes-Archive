
class NthFibonacci {

    static void multiply(long F[][], long M[][]) {
        long e00 = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        long e01 = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        long e10 = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        long e11 = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = e00;
        F[0][1] = e01;
        F[1][0] = e10;
        F[1][1] = e11;
    }
    static void power(long F[][], long n) {
        if (n == 0 || n == 1)
            return;
        long M[][] = new long[][]{{1,1},{1,0}};

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0)
            multiply(F, M);
    }

    static long nThfib(long N) {
        long result;
        if (N == 0)
            result = 0;
        else if (N == 1)
            result = 1;
        else {
            long[][] S = new long[][]{{1, 0}, {1, 0}};
            long[][] F = new long[][]{{1, 1}, {1, 0}};
            power(F, N - 1);
            multiply(S, F);
            result = S[0][0];
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(nThfib(100));
    }

}
