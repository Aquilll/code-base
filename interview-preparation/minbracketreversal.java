import java.util.Stack;

public class minbracketreversal {
    public static void main(String[] args) {
        String s = "}{{}}{{{";

        int min_reversal = minReversal(s,s.length());
        System.out.println(min_reversal);
    }

    private static int minReversal(String s, int length) {
        if(length %2 != 0)
            return -1;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < length; i++){
            Character c = s.charAt(i);
            if(c == '}' && !stk.empty()){
                if(stk.peek() == '{')
                    stk.pop();
                else
                    stk.push(c);
            }else{
                stk.push(c);
            }
        }

        int red_len = stk.size();

        int n = 0;
        while (!stk.empty() && stk.peek() == '{')
        {
            stk.pop();
            n++;
        }

        return red_len/2 + n%2;
    }
}
