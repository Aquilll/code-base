//given a string, either by using + or * in appropriate positions,
// find the maximum value of the string
public class maximumComputation {
    public static void main(String[] args) {

        String str = "01891";
        System.out.println(calcMaxValue(str));
    }

    private static int calcMaxValue(String str) {
        int res = str.charAt(0) - '0';

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == '0' || str.charAt(i) == '1' || res < 2)
                res += str.charAt(i) - '0';
            else
                res *= str.charAt(i) - '0';
        }

        return res;
    }
}
