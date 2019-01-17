public class factorialMemoization {
    int dp[] = new int[100];
    public static void main(String[] args) {
        factorialMemoization f = new factorialMemoization();
        int n = 20;
        f.initialize();
        System.out.println(n+" factorial is: "+f.factMemo(n));
    }

    private void initialize() {
        for(int i = 0; i < 100; i++)
            dp[i] = -1;
    }

    private int factMemo(int n) {
        if(dp[n] == -1){
            if(n == 0 || n == 1)
                dp[n] = 1;
            else
                dp[n] = n * factMemo(n-1);
        }
        return dp[n];
    }
}
