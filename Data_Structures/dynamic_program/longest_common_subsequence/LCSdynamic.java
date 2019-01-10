//bottom up technique of DP is used
public class LCSdynamic {
    public static void main(String[] args) {
        String s = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] x = s.toCharArray();
        char[] y = s2.toCharArray();

        int m = x.length;
        int n = y.length;

        System.out.println("Length of Longets common sequence is "+lcsDynamic(x,y,m,n));
    }

    private static int lcsDynamic(char[] x, char[] y, int m, int n) {
        int[][] l = new int[m+1][n+1];

        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0)
                    l[i][j] = 0;
                else if(x[i-1] == y[j-1])
                    l[i][j] = l[i-1][j-1] + 1;
                else
                    l[i][j] = Math.max(l[i-1][j], l[i][j-1]);
            }
        }
        checkArray(l,m+1,n+1);
        return l[m][n];
    }

    private static void checkArray(int[][] l,int r,int c) {
        for(int i = 0; i < r; i++){
            for(int j =0; j < c; j++){
                System.out.print(l[i][j]+" ");
            }
            System.out.println();
        }
    }
}
