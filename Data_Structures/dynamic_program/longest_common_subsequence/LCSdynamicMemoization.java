import java.util.Arrays;

//top down(memoization) dp technique
public class LCSdynamicMemoization {
    static final int maximum = 1000;
    public static void main(String[] args) {
        String s = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] x = s.toCharArray();
        char[] y = s2.toCharArray();

        int m = x.length;
        int n = y.length;

        int dp[][] = new int[m][maximum];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }



        System.out.println("Length of Longets common sequence is "+lcsMemoization(x,y,m,n, dp));
    }

    private static int lcsMemoization(char[] x, char[] y, int m, int n, int[][] dp) {
        if(m == 0 || n == 0)
            return 0;

        if(dp[m-1][n-1] != -1)
            return dp[m-1][n-1];

        if(x[m-1] == y[n-1]){
            dp[m-1][n-1] = 1 + lcsMemoization(x, y, m - 1, n - 1, dp);
            return dp[m-1][n-1];
        }else{
            dp[m - 1][n - 1] = Math.max(lcsMemoization(x, y, m, n - 1, dp),
                    lcsMemoization(x, y, m - 1, n, dp));

            return dp[m - 1][n - 1];
        }

    }
}
