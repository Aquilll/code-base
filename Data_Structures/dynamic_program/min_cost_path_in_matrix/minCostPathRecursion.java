//given a 2-D mat containing integer as cost in each cell,
//we have to find min cost of reaching a cell from index (0,0)
//to the cell index(note: cost of starting and target scell are inclusive)
public class minCostPathRecursion {
    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };

        System.out.println(minCost(mat, 2 ,2));
    }

    private static int minCost(int[][] mat, int m, int n) {
        if(m < 0 || n < 0)
            return Integer.MAX_VALUE;
        else if(m == 0 && n == 0)
            return mat[m][n];
        else
            return mat[m][n] + Math.min(Math.min(minCost(mat, m -1, n-1),minCost(mat,m,n-1)),
                    minCost(mat,m-1,n));
    }
}
