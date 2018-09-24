import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class oddevenmagic {
    public static void main(String[] args)throws Exception {
        /*String s = "574674546476";

        Double num = Double.valueOf(s);
        //System.out.println(num*10);
        int[] arr = new int[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(num%10);
            num = num/10;
        }

        reverseArr(arr);
        *//*for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }*//*
        int[] finalRes = findCount(arr);
        for(int i = 0; i < finalRes.length; i++){
            System.out.print(finalRes[i]+" ");
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
// count the total no of even numbers before hand.
        int even = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) % 2 == 0)
                even++;
        for (int i = 0; i < s.length(); i++) {
            System.out.print(even + " ");
            if (s.charAt(i) % 2 == 0)
                even--;
        }
    }

    private static int[] findCount(int[] arr) {
        int[] count = new int[arr.length];
        Arrays.fill(count,0);

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[j] %2 == 0)
                    count[i]++;
            }
        }
        return count;
    }

    private static void reverseArr(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for(int i = 0; i< n; i++,n--){
            temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }

    }
}
