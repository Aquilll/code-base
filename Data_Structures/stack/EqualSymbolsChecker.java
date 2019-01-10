import java.util.Stack;

public class EqualSymbolsChecker {
    public static void main(String[] args) {
        System.out.println(isValidPattern("{{()[(({})()[][][][][][][][][][][][])]()}}"));
        String[] tokens = {"1","2","3","*","+","5","-"};
        int answer = expressionEvaluation(tokens);
        System.out.println(answer);
    }

    private static int expressionEvaluation(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op1+op2;
                s.push(res);
            }else if(token.equals("-")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2-op1;
                s.push(res);
            }else if(token.equals("*")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op1*op2;
                s.push(res);
            }else if(token.equals("/")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2/op1;
                s.push(res);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }

    public static boolean isValidPattern(String s) {
        Stack<Character> stk = new Stack<>();
        if (s == null || s.length() == 0) return true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (!stk.isEmpty() && stk.peek() == '(')
                    stk.pop();
                else
                    return false;
            } else if (s.charAt(i) == ']') {
                if (!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            } else if (s.charAt(i) == '}') {
                if (!stk.isEmpty() && stk.peek() == '{')
                    stk.pop();
                else
                    return false;
            } else {
                stk.push(s.charAt(i));
            }
        }
        if (stk.isEmpty())
            return true;
        else
            return false;
    }
}