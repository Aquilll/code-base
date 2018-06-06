public class ThreeWayPartitionArrayGivenRange {
    public static void main(String[] args) {
        int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
//        int[] result = partitionThreeWay(arr,arr.length,6,14);
//        printArr(result);
//        using dutch Flag Algo
        threeWayPartition(arr, 10, 20);
        printArr(arr);
    }

    private static void threeWayPartition(int[] arr, int lowValue, int highValue) {
        int start = 0;
        int end = arr.length -1;
        int temp = 0;
        for(int i=0; i<end;){
            if(arr[i] < lowValue){
                temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }
            else if(arr[i] > highValue){
                temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }
            else
                i++;
        }
    }

    private static void printArr(int[] result) {
        for(int x: result)
            System.out.print(x+" ");
    }

    private static int[] partitionThreeWay(int[] arr, int n, int v1, int v2) {
        int j = 0;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] <= v1)
                temp[j++] = arr[i];
        }

        for(int i=0; i<n; i++){
            if(arr[i] > v1 && arr[i] <= v2)
                temp[j++] = arr[i];
        }

        for(int i=0; i<n; i++){
            if(arr[i] > v2)
                temp[j++] = arr[i];
        }
        return temp;
    }
}
