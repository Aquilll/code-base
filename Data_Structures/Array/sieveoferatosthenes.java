//finding prime no's.
public class sieveoferatosthenes {
    public static void main(String[] args) {
        sieveOfEratosthenes(10);
    }

    private static void sieveOfEratosthenes(int n) {
        Boolean[] isPrime = new Boolean[n+1];

        for(int i = 0; i < n; i++)
            isPrime[i] = true;

        for(int p = 2; p * p <= n; p++){
            if(isPrime[p] == true){
                for(int i = p*2; i <= n; i += p){
                    isPrime[i] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(isPrime[i] == true)
                System.out.print(i+" ");
        }
    }
}
