public class MinInRotated {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        System.out.println("Minimum is " +findMinimum(arr,0,arr.length-1));
        int[] arr2 = {1,2,3,4};
        System.out.println("Minimum is " +findMinimum(arr2,0,arr2.length-1));
    }

    private static int findMinimum(int[] arr, int low, int high) {
        if(high < low) return arr[0];
        if(high == low) return arr[low];
        int mid = (low + high)/2;
        if((mid<high) && (arr[mid+1] < arr[mid]))
            return arr[mid+1];
        if((mid>low) && (arr[mid]<arr[mid-1]))
            return arr[mid];
        if(arr[mid]<arr[high])
            return findMinimum(arr,low,mid-1);
        return findMinimum(arr,mid+1,high);
    }
}
