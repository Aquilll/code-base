import java.util.Arrays;

public class FindKeySortRotatedArr {
    public static void main(String[] args) {
        int[] arr = {5,64,67,78,1,2,3,4};
        int index = find(arr,4);
        System.out.println(index);
    }

    private static int find(int[] arr, int key) {
        int mid = arr.length / 2;
        if(arr[mid] == key)
            return mid;
        if(arr[0] < arr[mid]){
            if(key>=arr[0] && key<=arr[mid]){
                return Arrays.binarySearch(arr,0,mid,key);
            }
            return Arrays.binarySearch(arr,mid+1,arr.length,key);
        }
        else{
            if(key>=arr[mid+1] && key<=arr[arr.length-1]){
                return Arrays.binarySearch(arr,mid+1,arr.length,key);
            }
            return Arrays.binarySearch(arr,0,mid,key);
        }

    }
}
