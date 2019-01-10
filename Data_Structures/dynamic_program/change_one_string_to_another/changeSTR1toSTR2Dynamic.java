//DP technique used is bottom up
public class changeSTR1toSTR2Dynamic {
    public static void main(String[] args) {
        String x = "Sunday";
        String y = "Saturday";
        int m = x.length();
        int n = y.length();
        System.out.println(minCostDynamic(x, y, m, n));
    }

    private static int minCostDynamic(String x, String y, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0)
                    dp[i][j] = j;
                else if(j == 0)
                    dp[i][j] = i;
                else if(x.charAt(i - 1) == y.charAt(j - 1))
                    dp[i][j] = dp[i -1][j - 1];
                else
                    dp[i][j] = 1 + mini(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
            }
        }
        return dp[m][n];
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
