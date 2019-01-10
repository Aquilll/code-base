public class CyclicallyRotateAnArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int[] res = cyclicRotateTimes(arr,5);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] cyclicRotateTimes(int[] arr,int d) {
        for(int i=0; i<d; i++)
        cyclicRotate(arr);
        return arr;
    }

    private static void cyclicRotate(int[] arr) {
        int x = arr[arr.length - 1];
        int i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
        //return arr;
    }
}

