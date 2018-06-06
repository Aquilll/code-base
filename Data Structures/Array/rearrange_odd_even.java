import java.util.Scanner;

public class rearrange_odd_even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        rearrange(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void rearrange(int[] arr, int n) {
        int temp;
        for(int i = 0; i < n-1; i++){
            if(i % 2 == 0 && arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            if(i % 2 != 0 && arr[i] < arr [i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
