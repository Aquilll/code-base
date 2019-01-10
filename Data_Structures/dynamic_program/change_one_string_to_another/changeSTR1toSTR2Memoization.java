import java.util.Arrays;

public class changeSTR1toSTR2Memoization {
    static int max = 1000;
    public static void main(String[] args) {
        String x = "Sunday";
        String y = "Saturday";
        int m = x.length();
        int n = y.length();
        int dp[][] = new int[m][max];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(minCostMemoization(x, y, m, n, dp));
    }

    private static int minCostMemoization(String x, String y, int m, int n, int[][] dp) {
        if( m == 0)
            return n;
        if(n == 0)
            return m;

        if(dp[m -1][n - 1] != -1)
            return dp[m -1][n - 1];

        if(x.charAt(m - 1) == y.charAt(n - 1))
            return dp[m -1][n - 1] = minCostMemoization(x, y, m-1, n-1, dp);

        return dp[m - 1][n - 1] = 1 + mini(minCostMemoization(x, y, m, n - 1, dp),
                                            minCostMemoization(x, y, m - 1, n, dp),
                                            minCostMemoization(x, y, m -1, n-1, dp));
    }

    private static int mini(int a, int b, int c) {
        if(a < b && a < c)
            return a;
        if(b < a && b < c)
            return b;
        else
            return c;
    }

}
