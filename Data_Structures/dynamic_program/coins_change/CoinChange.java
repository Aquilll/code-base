//given an array of coins and a value, we need to find the different
// no. combinations of coins which sum up to the given value
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int m = coins.length;
        int value = 4;

        System.out.println("No of possible soltions "+ coinsValue(coins, m, value));
    }

    private static int coinsValue(int[] coins, int m, int value) {
        //if the value is 0 then there is only one solution
        if(value == 0)
            return 1;
//        if there is no coin so there won't be solution
        if(m <= 0 && value >= 1)
            return 0;
//        if there is no value to be combined up to, there won't be any solution
        if(value < 0)
            return 0;
//      if above all fails then we compute the following
        return coinsValue(coins, m - 1, value) + coinsValue(coins,m, value - coins[m - 1]);
    }
}
