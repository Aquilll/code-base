import java.util.Arrays;

public class minimumDifferenceBetweenAnyTwoElements {
    public static void main(String[] args) {
        int[] arr = {1, 19, -4, 31, 38, 25, 100};
        System.out.println(minimumDiff(arr,arr.length));
    }

    private static int minimumDiff(int[] arr, int length) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            if(diff > arr[i+1] - arr[i])
                diff = arr[i+1] - arr[i];
        }
        return diff;
    }
}
