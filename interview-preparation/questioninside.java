/*Given an array arr[], find the maximum j – i such that arr[j] > arr[i]*/
public class questioninside {
    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr,arr.length));
    }

    private static int maxIndexDiff(int[] arr, int n) {
        int maxDiff;
        int i, j;

        int RMax[] = new int[n];
        int LMin[] = new int[n];

        LMin[0] = arr[0];
        for(i = 1; i < n; i++){
            LMin[i] = Math.min(arr[i],LMin[i-1]);
        }

        RMax[n-1] = arr[n-1];
        for(j = n-2; j >= 0 ; j--)
            RMax[j] = Math.max(arr[j],RMax[1+j]);

        i = 0; j = 0; maxDiff = -1;
        while (j < n && i < n)
        {
            if (LMin[i] < RMax[j])
            {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }
        return maxDiff;
    }
}
