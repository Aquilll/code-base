public class binarystringniteration {
    public static void main(String[] args) {
        int m = 5;
        int n = 2;
        int i = 8;

        char value = returnIndexAfterIteration(m,n,i);
        System.out.println(value);
    }

    private static char returnIndexAfterIteration(int m, int n, int i) {
        StringBuilder s = new StringBuilder();
        StringBuilder binary = convertBinary(s,m);
        //System.out.println(s);
        StringBuilder s1 = new StringBuilder();
        for(int k = 0; k < n; k++){
            for(int p = 0; p < binary.length(); p++){
                if(binary.charAt(p) == '1'){
                    s1.append("10");
                }else{
                    s1.append("01");
                }
            }
            binary = s1;
            s1 = new StringBuilder();
        }
        return binary.charAt(i);
    }

    private static StringBuilder convertBinary(StringBuilder s, int m) {
        while(m != 0){
            s.append(m%2);
            m = m/2;
        }
        return s.reverse();
    }
}
