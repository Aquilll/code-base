import java.util.LinkedList;
import java.util.Queue;

public class SumOfNumberInString {
    public static void main(String[] args) {
        String str = "123abc";
        System.out.println(sumOfNumber(str));
    }

    private static int sumOfNumber(String str) {
        int sum = 0;
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
            sum += Integer.parseInt(q.poll().toString());
        return sum;
    }
}
