import java.util.ArrayList;
import java.util.Scanner;

public class primesetbits {

    public static void main(String[] args) {
        //ArrayList<Integer> binary =
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int space = r-l;
        int[] arr = new int[space+1];
        for(int size = 0 ; size <= space; size++){
            arr[size] = returnBinary(l);
            l++;
        }
        int count = 0;
        for(int size = 0 ; size <= space; size++){
            //System.out.print(arr[size] + " ");
            if(isPrime(arr[size]))
                count++;
        }
        System.out.println(count);

        /*Collections.reverse(binary);
        System.out.println(binary);*/
    }

    private static int returnBinary(int n) {
        ArrayList<Integer> binary = new ArrayList<>();
        int count = 0;
        while(n > 0){
            binary.add(n % 2);
            if(n % 2 == 1)
                count++;
            n /= 2;
            //i++;
        }
        //System.out.println(i);
        //isPrime(count);
        return count;
    }

    private static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
