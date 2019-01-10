public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,2,1,2,2};
        printMajority(arr,arr.length);
    }

    private static void printMajority(int[] arr, int n) {
        int cand = findCAndidate(arr,n);
        if(isMajority(arr,cand,n))
            System.out.println("the majority element is "+cand);
        else
            System.out.println("there is no majority element");
    }

    private static boolean isMajority(int[] arr, int cand, int n) {
        int count = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] == cand)
                count++;
        }
        if(count >= n/2)
            return true;
        else
            return false;
    }

    private static int findCAndidate(int[] arr, int n) {
        int maj_index = 0, count = 1;
        int i;
        for(i = 1; i < n; i++){
            if (arr[maj_index] == arr[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return arr[maj_index];
    }
}
