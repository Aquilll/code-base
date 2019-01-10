//Also known as Memoization Technique for Dynamic programming
public class TopDownFibonacci {
    int MAX = 100;
    int NIL = -1;
    int lookup[] = new int[MAX];

    public static void main(String[] args) {
        TopDownFibonacci f = new TopDownFibonacci();
        f.initialize();
        System.out.print("Fibonacci number is " + f.fib(40));
    }

    private int fib(int n) {
        if(lookup[n] == NIL){
            if(n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib(n-1) + fib(n-2);
        }
        return lookup[n];
    }

    void initialize() {
        for(int i = 0; i < MAX; i++){
            lookup[i] = NIL;
        }
    }


}
