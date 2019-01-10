import java.util.Scanner;

/*Given a string of lowercase characters. You need to detect the family of string, where family of string is described as follows :
        Odd Palindrome : String with characters at odd index (1-based indexing) forming Palindrome.
        Even Palindrome : String with characters at even index (1-based indexing) forming Palindrome.
        TWIN Palindrome : String with both of the above properties.
        Parent Palindrome : If the string is itself a Palindrome.
        If string is not in the family, print “ALIEN” (without quotes).

        If the string is not ALIEN then the priority of plaindromes goes like PARENT > TWIN > EVEN/ODD.*/
public class palindromefamily {
    public static void main(String[] args) {
        //code
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            String s = scan.next();
            System.out.println();
            printFamily(s);
            test--;
        }
    }

        static void printFamily (String s){
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < s.length(); i = i + 2) {
                s1 = s1 + s.charAt(i);
            }

            for (int i = 1; i < s.length(); i = i + 2) {
                s2 = s2 + s.charAt(i);
            }

            if (isPalindrome(s)) {
                System.out.println("PARENT");
            } else if (isPalindrome(s1) && isPalindrome(s2)) {
                System.out.println("TWIN");
            } else if (isPalindrome(s1)) {
                System.out.println("ODD");
            } else if (isPalindrome(s2)) {
                System.out.println("EVEN");
            } else {
                System.out.println("ALIEN");
            }
        }

        static boolean isPalindrome (String str){
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }