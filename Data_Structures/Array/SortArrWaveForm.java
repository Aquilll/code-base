import java.util.Arrays;

public class SortArrWaveForm {
    public static void main(String[] args) {
        int[] arr = {0,4,6,7,3,2,72,78,-1,2};
//        waveFormBYSorting(arr,arr.length);
//        printArr(arr);
        waveFormByTraversing(arr,arr.length);
        printArr(arr);
    }

    private static void waveFormByTraversing(int[] arr, int n) {
        for(int i=0; i<arr.length-1; i += 2){
            if(i>0 && arr[i-1] > arr[i])
                swap(arr,i-1,i);
            if(i < n-1 && arr[i] < arr[i+1])
                swap(arr,i,i+1);
        }
    }

    private static void printArr(int[] arr) {
        for(int x : arr)
            System.out.print(x+" ");
    }

    private static void waveFormBYSorting(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i += 2)
            swap(arr,i,i+1);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
