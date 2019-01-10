public class findprimenumberswhosesumisthegivennumber {
    public static void main(String[] args) {
        findPrime(10);
    }

    private static void findPrime(int n) {
        Boolean[] isPrime = new Boolean[n+1];
        SieveOfEratosthenes(n, isPrime);

        for (int i = 0; i < n; i++)
        {
            if (isPrime[i] && isPrime[n - i])
            {
                System.out.print(i + " " + (n - i));
                return;
            }
        }
    }

    private static Boolean SieveOfEratosthenes(int n, Boolean[] isPrime) {
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i < n; i++)
            isPrime[i] = true;

        for(int p = 2; p * p <= n; p++){
            if(isPrime[p] == true){
                for(int i = p*2; i <= n; i += p){
                    isPrime[i] = false;
                }
            }
        }

       /* for(int i = 2; i <= n; i++){
            *//*if(isPrime[i] == true)
                System.out.print(i+" ");*//*
        }*/
        return false;
    }
}
