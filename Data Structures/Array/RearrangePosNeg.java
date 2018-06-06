public class RearrangePosNeg {
    public static void main(String[] args) {
        int[] arr = {2,-5,6,-3,6};
        rearrangeInsertion(arr,arr.length);
        rearrangeMerge(arr,0,arr.length-1);
        printArr(arr);
    }

    private static void rearrangeMerge(int[] arr, int l, int r) {
        if(l<r){
            int mid = l + (r - l) / 2;
            rearrangeMerge(arr,l,mid);
            rearrangeMerge(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int i, j, k;
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[mid +1 + j];
        i=0;
        j=0;
        k=l;

        while (i < n1 && L[i] < 0)
            arr[k++] = L[i++];
        while (j < n2 && R[j] < 0)
            arr[k++] = R[j++];
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    private static void printArr(int[] arr) {
        for(int x: arr){
            System.out.print(x+" ");
        }
    }

    private static void rearrangeInsertion(int[] arr, int n) {
        int key,j;
        for(int i=1 ; i<n; i++) {
            key = arr[i];
            if(key>0)
                continue;
            j = i - 1;
                while (j >= 0 && arr[j] > 0) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
        }
    }
}
