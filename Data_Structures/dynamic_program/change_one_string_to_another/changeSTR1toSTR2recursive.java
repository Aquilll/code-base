public class changeSTR1toSTR2recursive {
    public static void main(String[] args) {
        String x = "Sunday";
        String y = "Saturday";
        int m = x.length();
        int n = y.length();
        System.out.println(minCost(x, y, m, n));
    }

    private static int minCost(String x, String y, int m, int n) {
        if(n == 0)
            return m;
        if(m == 0)
            return n;

        if(x.charAt(m-1) == y.charAt(n-1))
            return minCost(x, y, m-1, n-1);

        return 1 + mini(minCost(x,y,m,n-1), minCost(x,y,m-1,n), minCost(x,y,m-1,n-1));
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
