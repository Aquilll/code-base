public class kadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,-5,-7,12,27,-3,-4,2};
        theAlgo(arr);
    }

    private static void theAlgo(int[] arr) {
        int max_so_far = arr[0];
        int current_max = 0;
        int start = 0 , end = 0, s = 0;
        for(int i=0; i<arr.length; i++){
            current_max = max_so_far + arr[i];
            if(max_so_far < current_max){
                max_so_far = current_max;
                start = s;
                end = i;
            }
            if(current_max < 0){
                current_max = 0;
                s = 1 + i;
            }
        }
        System.out.println(start+" "+end);
    }
}
