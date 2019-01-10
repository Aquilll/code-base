import java.util.Stack;

public class SortAscending {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(5);
        stk.push(3);
        stk.push(4);
        stk.push(8);
        stk.push(25);
        stk.push(-3);
        stk.push(42);
        stk.push(-8);
        Stack<Integer> rstk = sort(stk);
        while(!rstk.isEmpty()){
            System.out.println(rstk.pop());
        }
    }
    public static  Stack<Integer> sort(Stack<Integer> stk){
        Stack<Integer> rstk = new Stack<>();
        while(!stk.isEmpty()){
            int temp = stk.pop();
            while(!rstk.isEmpty() && rstk.peek() > temp){
                stk.push(rstk.pop());
            }
            rstk.push(temp);
        }
        return rstk;
    }
}
