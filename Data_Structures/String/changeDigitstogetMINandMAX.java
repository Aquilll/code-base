//replace 5 with 6 and vice versa
public class changeDigitstogetMINandMAX {
    public static void main(String[] args) {
        int num1 = 5466, num2 = 4555;
        calculateMinMax(num1,num2);
    }

    private static void calculateMinMax(int num1, int num2) {
        int minsum = getResultMin(num1)+getResultMin(num2);
        int maxsum = getResultMax(num1)+getResultMax(num2);
        System.out.println(minsum+ " <~minimum " + "\t" + maxsum+" <~maximum");
    }

    private static int getResultMax(int n) {
        StringBuffer sb = new StringBuffer();
        int temp;
        while(n != 0){
            temp = n%10;
            if(temp == 5)
                temp = 6;
            n = n/10;
            sb.append(temp);
        }
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    private static int getResultMin(int n) {
        StringBuffer sb = new StringBuffer();
        int temp;
        while(n != 0){
            temp = n%10;
            if(temp == 6)
                temp = 5;
            n = n/10;
            sb.append(temp);
        }
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
