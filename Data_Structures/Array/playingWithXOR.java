import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class playingWithXOR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int querries = scan.nextInt();
        for(int i = 0; i < querries; i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            int x = scan.nextInt();
            findElem(l,r,x,arr);
        }
    }

    private static void findElem(int l, int r, int x, int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 1;
        for(int i = l-1; i < r; i++){
            if(myXOR(arr[i],x) < x){
                if(mp.containsKey(arr[i])){
                    mp.put(arr[i], mp.get(l)+1);
                }else{
                    mp.put(arr[i],count);
                }
            }

        }
        int min = Integer.MIN_VALUE;
        int val = 0;
        for(Integer key : mp.keySet()){
            if(key > val && mp.get(key) > min);
            min = mp.get(key);
            val = key;
        }
        System.out.println(val+" "+min);
    }
    static int myXOR(int x, int y)
    {
        return (x | y) &
                (~x | ~y);
    }

}
