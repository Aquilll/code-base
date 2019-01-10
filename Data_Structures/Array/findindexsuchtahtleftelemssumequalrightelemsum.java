// can be done using prefix sum and suffix sum
// arr = 1 4 2 5
// prefixsum = 1  5 7 12
// suffixsum = 12 11 7   5
// return the index where prefix == suffix

public class findindexsuchtahtleftelemssumequalrightelemsum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5};
        int index = findIndex(arr);
        if(index == 0)
            System.out.println("no such index");
        else
            System.out.println(index);
    }

    private static int findIndex(int[] arr) {
        for(int i = 1; i < arr.length-1; i++){
            int sum1 = findsumleft(0,i,arr);
            int sum2 = findsumright(i+1,arr.length,arr);

            if(sum1 == sum2)
                return i;
        }
        return 0;
    }

    private static int findsumright(int a, int b, int[] arr) {
        int sum = 0;
        if(a == b)
            sum = arr[b-1];
        while(a < b){
            sum += arr[a];
            a++;
        }
        return sum;
    }

    private static int findsumleft(int a, int b, int[] arr) {
        int sum = 0;
        while(a < b){
            sum += arr[a];
            a++;
        }
        return sum;
    }
}
