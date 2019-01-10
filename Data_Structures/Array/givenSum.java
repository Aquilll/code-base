import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class givenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        Set<Set<Integer>> result = getPairs(arr, sum);

        if(result == null)
            System.out.println(-1);
        else{
            System.out.println(result);
        }
    }

    private static Set<Set<Integer>> getPairs(int[] arr, int sum) {
        Set<Set<Integer>> s = new HashSet<>();
        Set<Integer> checker = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            int temp = sum - arr[i];
            if(temp > 0 && checker.contains(temp)){
                Set<Integer> inner = new HashSet<>();
                inner.add(temp);
                inner.add(arr[i]);
                s.add(inner);
            }
            checker.add(arr[i]);
        }
        if(!s.isEmpty())
            return s;
        else return null;
    }
}
