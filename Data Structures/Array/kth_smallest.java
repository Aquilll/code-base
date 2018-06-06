import java.util.Arrays;

public class kth_smallest {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,6,4,10,5,15};
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
