import java.util.ArrayList;

public class interviewbit1 {
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static int solve(int A) {

        int mod = 1000000007;
        ArrayList<Integer> ex = new ArrayList<>();
        ex.add(1);
        ex.add(2);
        arr.add(ex);
        ex = new ArrayList<>();
        ex.add(2);
        arr.add(ex);
        ex = new ArrayList<>();
        ex.add(0);
        ex.add(1);
        ex.add(3);
        ex.add(4);
        arr.add(ex);
        ex = new ArrayList<>();
        ex.add(0);
        ex.add(4);
        arr.add(ex);
        ex = new ArrayList<>();
        ex.add(3);
        ex.add(1);
        arr.add(ex);

        int dp[][] = new int[A][5];

        for (int i = 0; i < 5; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < A; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < arr.get(j).size(); k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][arr.get(j).get(k)]) % mod;
                }
            }
        }
        long ans = 0;

        for (int i = 0; i < 5; i++) {
            ans = (ans + dp[A - 1][i]) % mod;
            ans %= mod;
        }

        return (int) ans;
    }
}
