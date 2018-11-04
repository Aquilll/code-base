//add even fibonacci terms whose value is less than 4 million
public class ques2 {
    public static void main(String[] args) {
        int n = 4000000;
        int f1 = 1, f2 = 1, i;
        int sum = 0;
        for(i = 1; i <= n; i++){
            if(f2 < n){
                //System.out.print(f2+" ");
                if(f2%2 == 0)
                    sum = sum + f2;
                int next = f1 + f2;
                f1 = f2;
                f2 = next;
            }
        }
        System.out.println(sum);
    }
}
