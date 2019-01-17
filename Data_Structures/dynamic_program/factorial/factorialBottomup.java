public class factorialBottomup {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n+" factorial is: "+factBottomUp(n));
    }

    private static int factBottomUp(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = i*dp[i-1];
        }
        return dp[n];
    }
}
