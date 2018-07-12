public class evenatevenoddatoddindex {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 12, 1, 5, 8 };
        arrange(arr, arr.length);

        for(int x : arr)
            System.out.print(x+" ");
    }

    private static void arrange(int[] arr, int length) {
        int even = 0;
        int odd = 1;
        while(true){
            while(even < length && arr[even] % 2 == 0)
                even += 2;
            while(odd < length && arr[odd] % 2 == 1)
                odd += 2;
            if(even < length && odd < length){
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }else
                break;
        }
    }
}
