//Given a sorted array and a value x, the floor of x is the largest element
// in array smaller than or equal to x. Write efficient functions to find floor of x.
public class floorinsortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12, 14};
        int n = arr.length;
        int x = 7;

//        binary search method
        int indexBinary = findIndexBinarySearch(arr,0,n-1,x);
        if(indexBinary == -1)
            System.out.println("floor doesn't exist");
        else
            System.out.println(arr[indexBinary]);

//        linear method
        int indexLinear = findIndexLinearSearch(arr,n,x);
        if(indexLinear == -1)
            System.out.println("floor doesn't exist");
        else
            System.out.println(arr[indexLinear]);
    }

    private static int findIndexLinearSearch(int[] arr, int n, int x) {
        if(x >= arr[n-1])
            return n-1;

        if(x < arr[0])
            return -1;

        for(int i = 1; i < n; i++){
            if(arr[i] > x)
                return i-1;
        }
        return -1;
    }

    private static int findIndexBinarySearch(int[] arr, int low, int high, int x) {
        if(low > high)
            return -1;
        if(x >= arr[high])
            return high;
        int mid = ( low + high )/ 2;

        if(x == arr[mid])
            return mid;

        if(mid > 0 && arr[mid-1] <= x && arr[mid] > x)
            return mid-1;
        if(x < arr[mid])
            return findIndexBinarySearch(arr,low,mid-1,x);
        return findIndexBinarySearch(arr,mid+1,high,x);
    }
}
