public class reverseStringusingXOR {
    public static void main(String[] args) {
        String s = "Hello World";
        reverseString(s);
    }

    private static void reverseString(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] str = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            str[i] = s.charAt(i);
        }

        while (start < end)
        {
            str[start] ^= str[end];
            str[end] ^= str[start];
            str[start] ^= str[end];

            ++start;
            --end;
        }

        for(int i = 0; i < s.length(); i++){
            System.out.print(str[i]);
        }

    }
}
