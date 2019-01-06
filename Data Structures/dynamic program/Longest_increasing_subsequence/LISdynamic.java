//using bottom up table technique
public class LISdynamic {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Longest increasing subsequence is of length: "+lis(arr, n));
    }

    private static int lis(int[] arr, int n) {
        int referenceTable[] = new int[n];
        int i, j, max = 0;

        for(i = 0 ; i < n; i++)
            referenceTable[i] = 1;

        for(i = 1; i < n; i++)
            for(j = 0; j < i; j++)
                if(arr[i] > arr[j] && referenceTable[j] + 1 > referenceTable[i])
                    referenceTable[i] = referenceTable[j] + 1;

        for(i = 0; i < referenceTable.length; i++)
            max = Math.max(max, referenceTable[i]);

        return max;
    }
}
