public class DutchSorting3wayQuickSort {
    public static void main(String[] args) {
        int[] arr = {0,2,2,2,1,1,0,0,0,0,1};
        dutchSort(arr,arr.length);
        for(int x : arr)
            System.out.print(x+" ");
    }

    private static void dutchSort(int[] arr, int n) {
        int mid = 0;
        int low = 0;
        int temp = 0;
        int high = n-1;

        while(mid <= high){
            switch ((arr[mid]))
            {
                case 0:
                {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
