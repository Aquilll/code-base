//multiple of 3 and 5 and find their sum between 1000
public class ques1 {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        for(int i = 1; i <n ; i++){
            if(i%3 == 0 || i%5 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
