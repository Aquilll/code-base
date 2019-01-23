public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int w = 50;
        int n = val.length;

        System.out.println("maximum value "+ knapSack(w, wt, val, n));
    }

    private static int knapSack(int w, int[] wt, int[] val, int n) {
        if(w == 0 || n == 0)
            return 0;

        if(w < wt[n-1])
            return knapSack(w, wt,val, n -1 );
        else
            return Math.max(val[n-1] + knapSack(w-wt[n-1], wt, val, n - 1), knapSack(w,wt,val,n - 1));
    }
}
