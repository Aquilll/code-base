//largest prime factor of a number
public class ques3 {
    public static void main(String[] args) {
        long n = 600851475143l;
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;

            // equivalent to n /= 2
            n >>= 1;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }
        if (n > 2)
            maxPrime = n;

        System.out.println(maxPrime);
        /*int max = Integer.MIN_VALUE;
        for(int i = 1; i < n+1; i++){
            if(n%i == 0){
                if(ifPrime(i)){
                    if(i > max){
                        max = i;
                    }
                }
            }
        }
        System.out.println(max);*/
    }

    private static boolean ifPrime(int n) {
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
