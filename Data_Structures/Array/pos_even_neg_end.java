import java.util.Scanner;

public class pos_even_neg_end {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }

        rearrange(arr, size);

        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void rearrange(int[] arr, int size) {
        int pos = 0, neg = 1, temp;
        while(true){
            while(pos < size && arr[pos] >= 0)
                pos += 2;
            while(neg < size && arr[neg] <= 0)
                neg += 2;
            if (pos < size && neg < size) {
                temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
            else
                break;
        }
    }
}
