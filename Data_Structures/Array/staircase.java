//given n stairs and m moves find the total way of reaching the top of stair
public class staircase {
    public static void main(String[] args) {
        int stairs = 3;
        int moves = 3;

        System.out.println("no. of moves = "+findWays(stairs, moves));
    }

    private static int findWays(int stairs, int moves) {
        return findWaysutil(stairs+1, moves);
    }

    private static int findWaysutil(int stairs_plus_1, int moves) {
        int[] res = new int[stairs_plus_1];
        res[0] = res[1] = 1;
        for(int i = 2; i< stairs_plus_1; i++){
            res[i] = 0;
            for(int j = 1; j <= moves && j <= i; j++)
                res[i] += res[i-j];
        }
        return res[stairs_plus_1-1];
    }
}
