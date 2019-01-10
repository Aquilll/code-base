public class MoveAllNegToEnd {
    public static void main(String[] args) {
        int[] arr = {2,5,5,-3,-4,-33,-2,-12,6,4};
        int[] result = negEnd(arr,arr.length);
        printArr(result);
    }

    private static void printArr(int[] result) {
        for(int x: result)
            System.out.print(x+" ");
    }

    private static int[] negEnd(int[] arr, int length) {
        int j=0;
        int temp[] = new int[length];
        for(int i=0; i<length; i++)
            if(arr[i]>=0)
                temp[j++] = arr[i];
            if(j==length || j==0)
                return arr;
            for(int i=0; i<length; i++)
            if(arr[i]<0)
                temp[j++] = arr[i];
        return temp;
    }
}
