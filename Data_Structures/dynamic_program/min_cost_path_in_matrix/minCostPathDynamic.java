public class minCostPathDynamic {
    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };

        System.out.println(minCostDynamic(mat, 2 ,2));
    }

    private static int minCostDynamic(int[][] mat, int m, int n) {
        int[][] tc = new int[m+1][n+1];
        tc[0][0] = mat [0][0];
//        filling the row
        for(int i = 1; i <= m; i++){
            tc[i][0] = tc[i - 1][0] + mat[i][0];
        }
//        filling column
        for(int j = 1; j <= n; j++){
            tc[0][j] = tc[0][j - 1] + mat[0][j];
        }

        for(int i = 1; i <= m; i++ ){
            for(int j = 1; j <= n; j++){
                tc[i][j] = Math.min(Math.min(tc[i-1][j-1],tc[i][j-1])
                        ,tc[i-1][j]) + mat[i][j];
            }
        }
        return tc[m][n];
    }
}
