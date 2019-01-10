public class RotateMatrixBy180 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate180(mat);
    }

    private static void rotate180(int[][] mat) {
        for(int i=2; i>=0; i--){
            for(int j=2; j>=0; j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
