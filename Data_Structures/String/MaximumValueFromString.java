import java.util.LinkedList;
import java.util.Queue;

public class MaximumValueFromString {
    public static void main(String[] args) {
        String str = "100klh564abc365bg";
        System.out.println(MaxValue(str));
    }

    private static int MaxValue(String str) {
        int max = Integer.MIN_VALUE;
        Queue<StringBuffer> q = new LinkedList<>();

        StringBuffer sb = new StringBuffer();
        int j = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
                j++;
            }
            else{
                if(j != 0){
                    q.add(sb);
                    j = 0;
                    sb = new StringBuffer();
                }
                continue;
            }
        }

        if(sb.length() > 0)
            q.add(sb);

        System.out.println();
        System.out.println("queue size: " + q.size());
        int n = q.size();
        for(int i = 0 ; i < n; i++)
            max = Math.max(max,Integer.parseInt(q.poll().toString()));
        return max;
    }
}
