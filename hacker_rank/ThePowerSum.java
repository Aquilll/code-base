import java.util.Scanner;

public class ThePowerSum {
    static int powerSum(int X, int N) {
        // Complete this function
        int count = 0;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if(((i*i) + (j*j)) == X)
                    count++;
            }
        }
        System.out.println(count);
        return count/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N);
        System.out.println(result);
        in.close();
    }
}
