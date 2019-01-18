import java.util.Comparator;
import java.util.PriorityQueue;

//Minimum sum of squares of character counts in a given string after removing k characters
public class StringManupulation {
    public static void main(String[] args) {
        String s = "aaabbbbcc";
        int k = 5;
        System.out.println(minStringValue(s,k));
    }

    private static int minStringValue(String s, int k) {
        if(k >= s.length())
            return 0;
        int[] frequency = new int[26];
//        we take 26 because there are 26 alphabhets
        for(int i = 0; i < s.length(); i++)
            frequency[s.charAt(i)-'a']++;

//        below code is to check elements in the array for better understanding
        for(int i = 0; i < 26; i++)
            System.out.print(frequency[i]+" ");
        System.out.println();

//        use of Comparator as anonymous class
        PriorityQueue<Integer> p = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2)
                    return -1;
                if(o1 < o2)
                    return 1;
                else
                    return 0;
            }
        });

        for(int i = 0; i < 26; i++){
            if(frequency[i] != 0)
                p.add(frequency[i]);
        }

        while(k != 0){
            int temp = p.peek();
            p.poll();
            temp -= 1;
            p.add(temp);
            k--;
        }

        int res = 0;
        while (!p.isEmpty()){
            int temp = p.peek();
            res += temp*temp;
            p.poll();
        }

        return res;
    }
}
