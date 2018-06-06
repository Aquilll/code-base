
import java.util.Scanner;

public class CatsMouse {

    public static String solve(int x, int y, int z) {
        String winner = "";
        int a = Math.abs(z - x);
        int b = Math.abs(z - y);

        if (a == b) {
            winner = "Mouse C";
        }
        else if (a < b) {
            winner = "Cat A";
        }
        else {
            winner = "Cat B";
        }

        return winner;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            System.out.println(solve(x, y, z));
        }
        in.close();
    }
}