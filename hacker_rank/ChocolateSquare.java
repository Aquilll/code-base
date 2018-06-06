import java.util.Scanner;

public class ChocolateSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        // your code goes here
        int count = 0;
        for(int i=0; i<n-m+1; i++) {
            int sum=0;
            for(int j=i; j<i+m; j++) {
                sum+=squares[j];
            }
            if(sum==d) {
                count++;
            }
        }
        System.out.println(count);
    }
}