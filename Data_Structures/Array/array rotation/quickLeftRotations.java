public class quickLeftRotations {
    public static void main(String[] args) {
        int[] arr = {4,6,9,12,23,27,34,35,100};
        int n = arr.length;
        int[] temp = new int[2 * n];
        preprocess(arr, n, temp);
        int k = 2;
        leftRotation(arr,n,k,temp);
         k = 34;
        leftRotation(arr,n,k,temp);
         k = 6;
        leftRotation(arr,n,k,temp);
         k = 100;
        leftRotation(arr,n,k,temp);
         k = 164;
        leftRotation(arr,n,k,temp);
    }

    private static void leftRotation(int[] arr, int n, int k, int[] temp) {
        int start = k%n;
        for(int i = start; i<start+n; i++){
            System.out.print(temp[i]+" ");
        }
        System.out.print("\n");
    }

    private static void preprocess(int[] arr, int n, int[] temp) {
        for(int i=0; i<n; i++)
            temp[i]=temp[i+n]=arr[i];
    }
}
