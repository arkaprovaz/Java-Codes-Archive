
public class KMP {

    public static void main(String[] args) {
        String s = "ABCMNBCJDMVBC";
        String pat = "BC";

        int n = s.length();
        int m = pat.length();
        int[] lps = getLps(pat, m);
        int i=0; int j=0;
        while(i<n && j<m) {
            if(s.charAt(i)==pat.charAt(j)) {
                i++; j++;
            }
            if(j==m) {
                System.out.println("found pattern at =" + (i-j));
                j = lps[j-1];
            }

            if(i<n && j<m && s.charAt(i) != pat.charAt(j)) {
                if(j != 0)
                    j = lps[j-1];
                else
                    i++;
            }
        }
    }

    public static int[] getLps(String pat, int m) {
        int[] lps = new int[m];
        int i=1, len=0;
        lps[0] = 0;
        while (i<m) {
            if(pat.charAt(i)==pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }else {
                if(len > 0)
                    len = lps[len-1];
                else{
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;

    }
}
