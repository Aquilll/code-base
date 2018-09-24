import java.util.Scanner;

public class jhoolBrowser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        for(int i = 0 ; i < tc; i++){
            String site = scan.next();
            System.out.println(ratio(site));
        }
    }

    private static String ratio(String site) {
        if(site == null)
            return site.length() + "/" +site.length();
        int v = 0;
//        String m = site;
        String[] arr = site.split("\\.");
        /*List<String> itemList = Arrays.asList(arr);
        System.out.println(itemList);*/
        String main = arr[1];

        for(int i = 0; i < main.length(); i++){
            if(main.charAt(i) == 'a' || main.charAt(i) == 'e' || main.charAt(i) == 'i' ||
            main.charAt(i) == 'o' || main.charAt(i) == 'u'){
                v++;
            }
        }
        int diff = main.length() - v;
        int res = diff + arr[2].length() + 1;

        return res + "/" +site.length();
    }
}
