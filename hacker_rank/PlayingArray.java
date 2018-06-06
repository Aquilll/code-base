import java.util.Scanner;

public class PlayingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("enter elements");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("printing array with high complexity O(n^2)");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(arr[i][j]+"\t");
                //System.out.println("\n");
                //arr[i][j] = new Scanner(System.in).nextInt();
            }
            System.out.println("");
        }
    }
}
