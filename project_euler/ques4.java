//find two three digit number such that their product is the largest palindrome;
public class ques4 {
    public static void main(String[] args) {
        int n = 9999;
        int product = 0;
        int max = -1;
        for(int i = 1000; i< n; i++)
            for(int j = 1000; j < n; j++){
                product = i * j;
                if(isPalindrome(product)){
                    if(product > max)
                        max = product;
                }
            }
        System.out.println(max);
        System.out.println();
        int quotient = 0;
        for(int i = 1000; i < 10000; i++){
            if(max % i == 0){
                quotient = max/i;
                System.out.println(i+"*"+quotient+"="+max);
            }
        }
    }

    private static boolean isPalindrome(int num) {
        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        if (originalInteger == reversedInteger)
            return true;
        else
            return false;
    }
}
