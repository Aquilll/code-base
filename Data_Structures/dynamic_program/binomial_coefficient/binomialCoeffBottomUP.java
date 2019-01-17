public class binomialCoeffBottomUP {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;

        System.out.println("Binomial coefficient is "+binomialCoeffBottom(n,k));
    }

    private static int binomialCoeffBottom(int n, int k) {
        int dp[][] = new int[n+1][k+1];
        int i , j;
        for(i = 0; i <= n; i++){
            for(j = 0; j <= Math.min(i,k); j++){
                if(j == 0 || j == i)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
//        trace the table
        /*
        for(int p = 0; p < n+1; p++){
            for(int t = 0; t < k+1; t++)
                System.out.print(dp[p][t]+" ");
            System.out.println();
        }*/

        return dp[n][k];
    }
}
