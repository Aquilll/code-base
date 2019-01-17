public class binomialCoefficient {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;

        System.out.println("Binomial coefficient is "+binomialCoeff(n,k));
    }

    private static int binomialCoeff(int n, int k) {
        if(k == 0 || k == n)
            return 1;
        return binomialCoeff(n-1,k-1) + binomialCoeff(n - 1, k);
    }
}
