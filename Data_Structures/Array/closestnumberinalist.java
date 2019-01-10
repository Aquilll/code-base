import java.util.Arrays;

public class closestnumberinalist {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        findClosestNumber(arr, arr.length);
    }

    private static void findClosestNumber(int[] arr, int length) {
        if(length == 0)
            return;
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];
        for(int i = 2; i < length; i++){
            /*if(arr[i+1] - arr[i]  < minDiff)
                minDiff = arr[i+1] - arr[i];*/
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == minDiff)
                System.out.print("("+arr[i-1]+", "+arr[i]+")"+" ");
        }
    }
}
