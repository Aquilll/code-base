import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,-3,1,1};
        int[] res = twoSum(arr , 4 );
        for(int x : res)
            System.out.print(x + " ");
    }
    public static int[] twoSum(int[] numbers, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(numbers[i])){
                int index = map.get(numbers[i]);
                result[0] = index;
                result[1] = i;
                break;
            }else{
                map.put(target - numbers[i] , i);
            }
        }
        return result;
    }
}
