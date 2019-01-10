//Also known as tabular technique for Dynamica programming
//the size of the table is always n+1
public class BottomUpFibonacci {
    public static void main(String[] args) {
        BottomUpFibonacci f = new BottomUpFibonacci();
        System.out.println("Fibonacci number is "+ f.fib(40));
    }

    int fib(int n) {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
