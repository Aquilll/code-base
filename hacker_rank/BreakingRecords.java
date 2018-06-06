import java.util.Scanner;

public class BreakingRecords {

    static int[] breakingRecords(int[] score) {
        int lowScore = lowScore(score);
        int highScore = highScore(score);
        int[] res = {lowScore,highScore};
        return res;
    }

    private static int lowScore(int[] score) {
        int min = score[0];
        int count = 0;
        for(int i = 0; i < score.length; i++){
            if(min < score[i]){
                min = score[i];
                count++;
            }
        }
        return count;
    }

    private static int highScore(int[] score) {
        int max = score[0];
        int count = 0;
        for(int i = 0; i < score.length; i++){
            if(max > score[i]){
                max = score[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
