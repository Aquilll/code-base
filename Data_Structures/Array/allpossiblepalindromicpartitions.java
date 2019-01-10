import java.util.Vector;

public class allpossiblepalindromicpartitions {
    public static void main(String[] args) {
        String s = "nitin";
        findString(s);
    }

    private static void findString(String s) {
        int n = s.length();
        Vector<String> currPart = new Vector<>();
        Vector<Vector<String>> allPart = new Vector<>();
        allPalPartUtil(allPart, currPart, 0, n, s);

        for (int i=0; i< allPart.size(); i++ )
        {
            for (int j=0; j<allPart.get(i).size(); j++)
                System.out.print(allPart.get(i).get(j)+" ");
            System.out.println();
        }
    }

    private static void allPalPartUtil(Vector<Vector<String>> allPart, Vector<String> currPart, int start, int n, String s) {
        if(start >= n){
            allPart.add(currPart);
        }
        
        for(int i = start; i < n; i++){
            if(isPalindrome(s, start, i)){
                currPart.add(s.substring(start, i-start+1));
                allPalPartUtil(allPart, currPart, i+1, n, s);
                currPart.remove(i);
            }
        }
    }

    private static boolean isPalindrome(String s, int low, int high) {
        while(low < high){
            if(s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
