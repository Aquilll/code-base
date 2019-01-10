import java.util.Stack;

/*Design a stack that supports getMin() in O(1) time and O(1) extra space*/
public class modifiedStackWithGetMinMethod {

    int minEle;
    Stack<Integer> s;

    modifiedStackWithGetMinMethod(){
        s = new Stack<>();
    }

    void getMin()
    {
        if (s.isEmpty())
            System.out.println("Stack is empty");

        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + minEle);
    }

    void peek()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = s.peek();

        System.out.print("Top Most Element is: ");

        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minEle)
        {
            System.out.println(minEle);
            minEle = 2*minEle - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x)
    {
        if (s.isEmpty())
        {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        if (x < minEle)
        {
            s.push(2*x - minEle);
            minEle = x;
        }

        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }

    public static void main(String[] args) {
        modifiedStackWithGetMinMethod stack = new modifiedStackWithGetMinMethod();
        stack.push(3);
        stack.push(5);
        stack.peek();
        stack.getMin();
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.peek();
    }
}
