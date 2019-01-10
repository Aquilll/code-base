import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseIt("reverse this sentence"));
    }

    private static String reverseIt(String s) {
        String[] arr = s.split(" ");
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            String tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }
        return Arrays.toString(arr);
    }
}
