import java.util.Scanner;

public class decrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //enter string
        String text = scan.nextLine();
        //System.out.println(text);
        for(int i = 1; i < 26; i++){
            StringBuffer sb = Decrypt(text,i);
            System.out.println(sb);
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    private static StringBuffer Decrypt(String text, int s) {
        StringBuffer result= new StringBuffer();
        //traverse text
        for(int i=0;i<text.length();i++)
        {
            //apply transformation to each character
            //Encrypt Uppercase letters
            if(Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            //Encrypt Lowercase letters
	        else{
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        //Return the resulting string
        return result;
    }
}
