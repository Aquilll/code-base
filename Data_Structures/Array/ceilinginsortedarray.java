//Given a sorted array and a value x, the ceiling of x is the smallest element
// in array greater than or equal to x, and the floor is the greatest element
// smaller than or equal to x. Assume than the array is sorted in non-decreasing order.
// Write efficient functions to find floor and ceiling of x.
public class ceilinginsortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int n = arr.length-1;

//        Linear method
        int indexLinear = findIndexLinear(arr,0,n,x);
        if(indexLinear == -1)
            System.out.println("no ceiling");
        else
            System.out.println(arr[indexLinear]);

//        Binary method
        int indexBinary = findIndexBInary(arr,0,n-1,x);
        if(indexBinary == -1)
            System.out.println("no ceiling");
        else
            System.out.println(arr[indexBinary]);
    }

    private static int findIndexBInary(int[] arr, int low, int high, int x) {
        int mid;

        if(x <= arr[low])
            return low;

        if(x > arr[high])
            return -1;


        mid = (low + high)/2;

        if(arr[mid] == x)
            return mid;

        if(x > arr[mid]){
            if(mid+1 <= high && arr[mid+1] >= x)
                return mid+1;
            else
                return findIndexBInary(arr, mid+1, high, x);
        }else{
            if(mid-1 >= low && arr[mid-1] < x)
                return mid;
            else
                return findIndexBInary(arr,low,mid-1,x);
        }
    }

    private static int findIndexLinear(int[] arr, int low, int high, int x) {
        if(arr[0] >= x)
            return 0;
        int i = 0;

        for(i = 0; i < high-1; i++){
            if(arr[i] == x)
                return i;
            if(arr[i] < x && arr[i+1] >=x)
                return i+1;
        }
        return -1;
    }
}
