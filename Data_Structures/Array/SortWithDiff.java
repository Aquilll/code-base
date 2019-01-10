import java.util.Map;
import java.util.TreeMap;

public class SortWithDiff {
    public static void main(String[] args) {
        int[] arr = {10,5,3,9,2};
        int n = arr.length;
        sortDiff(arr,n,7);
    }

    private static void sortDiff(int[] arr, int n, int x) {
        Map<Integer,Integer> mp = new TreeMap<>(new myComparator());
        for(int i=0; i<n; i++){
            mp.put(Math.abs(arr[i]-x),arr[i]);
        }
        System.out.println(mp);
    }
}
