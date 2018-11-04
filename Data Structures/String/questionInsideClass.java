//print the smallest number whose sum of digits equals to a given number(N) and is divisible by 10^N
public class questionInsideClass {
    public static void main(String[] args) {
        int N = 20;
        System.out.println(printSmallest(5));
    }

    private static StringBuffer printSmallest(int N) {
        StringBuffer sb = new StringBuffer();

        if(N == 0)
            return  sb.append(0);

        if(N % 9 != 0)
            sb.append(N % 9);

        for(int i = 1 ; i <= (N / 9); i++){
            sb.append(9);
        }

        for(int i = 0; i < N; i++){
            sb.append(0);
        }
        return sb;
    }
}
