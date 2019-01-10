import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> sum(int[] arr) {
         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
         if(arr.length < 3) return result;
         Arrays.sort(arr);
         for(int i=0; i<arr.length-2; i++){
             if(i==0 || arr[i]>arr[i-1]){
                 int negate = -arr[i];
                 int start = i+1;
                 int end = arr.length-1;
                 while(start < end){
                     if(arr[start] + arr[end] == negate){
                         ArrayList<Integer> temp = new ArrayList<>();
                         temp.add(arr[i]);
                         temp.add(arr[start]);
                         temp.add(arr[end]);
                         result.add(temp);
                         start++;
                         end--;
                         while(start < end && arr[end] == arr[end+1]){
                             end--;
                         }
                         while(start < end && arr[start] == arr[start-1]){
                             start++;
                         }
                     }else if(arr[start] + arr[end] < negate){
                         start++;
                     }else{
                         end--;
                     }
                 }
             }
         }
         return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> res = sum(arr);
        for(int i = 0; i<res.size(); i++){
            System.out.println(res.get(i));
        }

    }

}
