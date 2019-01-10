import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] arr, int target){
        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[0];
        if(arr.length == 2) return arr[0]+arr[1];

        int min = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(arr);

        for(int i=0; i<arr.length-2; i++){
            int start = i+1;
            int end = arr.length - 1;

            while(start < end){
                int sum = arr[i] + arr[start] + arr[end];
                int diff = Math.abs(sum - target);

                if(diff < min){
                    min = diff;
                    result = sum;
                }

                if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
    }
}
