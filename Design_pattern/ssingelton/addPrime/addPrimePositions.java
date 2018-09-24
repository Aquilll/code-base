import java.util.ArrayList;
// used singelton design pattern
public class addPrimePositions {
    private  static addPrimePositions initialiser = null;
    private static int[] arr;


    private addPrimePositions(int[] arr) {
        this.arr = arr;
    }

    public static addPrimePositions getInstance(int[] arr){
        if(initialiser == null){
            initialiser = new addPrimePositions(arr);
            return initialiser;
        }
            return null;
    }

    private int addNum(){
        int sum = 0;
        ArrayList<Integer> position = sieveOfEratosthenes(arr.length);
        for(int i = 0; i < position.size(); i++)
            sum = sum + arr[position.get(i)];
        return sum;
    }

    public int getaddNum(){
        return addNum();
    }

    private static ArrayList<Integer> sieveOfEratosthenes(int n) {
        Boolean[] isPrime = new Boolean[n+1];
        ArrayList<Integer> res = new ArrayList<>();

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
                res.add(i);
                //System.out.print(i+" ");
        }
        return res;
    }
}
