public class factorial {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(n+" factorial is: "+fact(n));
    }

    private static int fact(int n) {
        if(n == 0 || n ==1)
            return 1;
        else
            return n * fact(n-1);
    }
}
