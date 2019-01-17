public class binomialCoefficientMemoization {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] dp = new int[k+1];

        System.out.println("Binomial coefficient is "+binomialCoeffMemo(n,k,dp));
    }

    private static int binomialCoeffMemo(int n, int k, int[] dp) {
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            for(int j = Math.max(i,k); j > 0; j--){
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[k];
    }
}
