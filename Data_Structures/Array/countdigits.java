import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
        for(int k = 0; k < number.length(); k++){
            if(number.charAt(k) == '0') a++;
            if(number.charAt(k) == '1') b++;
            if(number.charAt(k) == '2') c++;
            if(number.charAt(k) == '3') d++;
            if(number.charAt(k) == '4') e++;
            if(number.charAt(k) == '5') f++;
            if(number.charAt(k) == '6') g++;
            if(number.charAt(k) == '7') h++;
            if(number.charAt(k) == '8') i++;
            if(number.charAt(k) == '9') j++;
        }
        int[] arr = {a,b,c,d,e,f,g,h,i,j};
        for(int p = 0; p < 10; p++ )
            System.out.println(p + " "+arr[p]);
    }
}
