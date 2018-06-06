public class Rotationmutiplication {
   /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter arr size");
        int n = scan.nextInt();
        int[] arr = getArr(n);
        int[] sum = new int[n];
        for(int i=0; i<arr.length; i++){
            sum[i] = arrayIndexMultiplication(arr);
            arrRotationByone(arr);
        }
        System.out.println("max sum is "+getMax(sum));

    }*/

    /*private static int getMax(int[] arr) {
        int max = arr[0];
        for (int ktr = 0; ktr < arr.length; ktr++) {
            if (arr[ktr] > max) {
                max = arr[ktr];
            }
        }
        return max;
    }*/

    /*private static int arrayIndexMultiplication(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i]*i;
        }
        //arrRotationByone(arr);
        return sum;
    }*/

    /*private static void arrRotationByone(int[] arr) {
        int j, temp;
        temp = arr[0];
        for(j=0; j<arr.length-1; j++){
            arr[j] = arr[j+1];
        }
        arr[j] = temp;
    }*/

    /*private static int[] getArr(int n) {
        System.out.println("Enter the elements");
        Scanner scan = new Scanner(System.in);
        int value[] = new int[n];
        for(int i=0; i<n; i++){
            value[i] = scan.nextInt();
        }
        return value;
    }*/
    static int maxSum(int arr[], int n)
    {
        // Compute sum of all array elements
        int cum_sum = 0;
        for (int i = 0; i < n; i++)
            cum_sum += arr[i];

        // Compute sum of i*arr[i] for
        // initial configuration.3, 2, 1
        int curr_val = 0;
        for (int i = 0; i < n; i++)
            curr_val += i * arr[i];

        // Initialize result
        int res = curr_val;

        // Compute values for other iterations
        for (int i = 1; i < n; i++)
        {
            // Compute next value using previous
            // value in O(1) time
            int next_val = curr_val - (cum_sum -
                    arr[i-1]) + arr[i-1] *
                    (n-1);

            // Update current value
            curr_val = next_val;

            // Update result if required
            res = Math.max(res, next_val);
        }

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {8, 3, 2, 1};
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }
}
