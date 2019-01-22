//Given a large number as string s and an integer k which denotes
// the number of breakpoints we must put in the number k <= string length.
// The task is to find maximum segment value after putting exactly k breakpoints.
public class MaximumSplitPoint {
    public static void main(String[] args) {
        String n = "8745";
        int k = 2;

        System.out.println(maxValueAfterSplit(n, k));
    }

    private static int maxValueAfterSplit(String n, int k) {
        int seg_length = n.length() - k;
        int res = 0;
        for(int i = 0; i < seg_length ; i++){
            res = res * 10 + (n.charAt(i) - '0');
        }

        int curr_val = res;

        int seg_pow = (int)Math.pow(10, seg_length - 1);

        for(int i = 1; i <= n.length() - seg_length; i++){
            curr_val = curr_val - (n.charAt(i-1) - '0')*seg_pow;
            curr_val = curr_val * 10 + (n.charAt(i + seg_length - 1) - '0');
            res = Math.max(res,curr_val);
        }
        return res;
    }
}
