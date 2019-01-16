import java.util.Arrays;

public class CoinChangeDynamic {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int m = coins.length;
        int value = 4;

        System.out.println("No of possible soltions "+ coinsValueDynamic(coins, m, value));
    }

    private static int coinsValueDynamic(int[] coins, int m, int value) {
        int table[] = new int[value + 1];
        Arrays.fill(table, 0);
        table[0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = coins[i]; j <= value; j++){
                table[j] += table[j - coins[i]];
            }
        }
        return table[value];
    }
}
