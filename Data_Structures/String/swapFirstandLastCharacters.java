//program to swap first and last letter of each words in a sentence
public class swapFirstandLastCharacters {
    public static void main(String[] args) {
        String s = new String("shit si this");
        System.out.println(letsRotate(s));
    }

    private static String letsRotate(String s) {
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++){
            int k = i;
            while(i < ch.length && ch[i] != ' ')
                i++;
            char temp = ch[k];
            ch[k] = ch[i-1];
            ch[i-1] = temp;
        }
        return new String(ch);
    }
}
