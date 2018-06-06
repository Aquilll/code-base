public class PosNegAlternative {
    public static void main(String[] args) {
        int[] arr = {1,53,34-3,5,-43,-34,-64,-444,324,-34,-34,-43,7,8,9,90,90};
        posnegArrangement(arr,arr.length);
        printArr(arr);
    }

    private static void posnegArrangement(int[] arr, int length) {
        int temp = 0;
        int i = -1;
        for(int j=0; j<length; j++){
            if(arr[j] < 0){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("position of i is at "+i);
            }
        }
        int pos = i+1, neg = 0;
        while(neg < pos && pos < length && arr[neg] < 0){
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }

    private static void printArr(int[] arr) {
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
