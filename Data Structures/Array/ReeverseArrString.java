public class ReeverseArrString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-5};
        reverseIterative(arr,arr.length);
        printArray(arr);
        reverseRecursive(arr,arr.length,0,arr.length-1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    private static void reverseIterative(int[] arr, int n) {
        int start = 0;
        int end = n-1;
        int temp = 0;
        if(start >= end)
            return;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseRecursive(int[] arr, int length, int start, int end) {
        int temp = 0;
        if(start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursive(arr,length,start+1,end-1);
    }

}
