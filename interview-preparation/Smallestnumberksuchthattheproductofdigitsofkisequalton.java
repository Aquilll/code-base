import java.util.Stack;

public class Smallestnumberksuchthattheproductofdigitsofkisequalton {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(smallestK(n));
    }

    private static int smallestK(int n) {
        if(n >= 0 && n <= 9)
            return n;
        Stack<Integer> s = new Stack<>();

        for (int i=9; i>=2 && n > 1; i--){
            while(n % i == 0){
                s.push(i);
                n /= i;
            }
        }

        if (n != 1)
            return -1;

        int k = 0;
        while(!s.isEmpty()){
            k = k*10 + s.peek();
            s.pop();
        }
        return k;
    }
}
