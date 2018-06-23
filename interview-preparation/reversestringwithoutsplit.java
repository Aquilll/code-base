import java.util.ArrayList;
import java.util.Collections;

public class reversestringwithoutsplit {
    public static void main(String[] args) {
        String s = "today is Saturday";
        ArrayList<StringBuilder> al = new ArrayList<>();
        int i = s.length()-1;
        for(int j = 0; j < s.length(); j++){
            if(i < 0){
                break;
            }
            else{
                StringBuilder temp = new StringBuilder();
                while(s.charAt(i) != ' '){
                    temp.append(s.charAt(i));
                    i--;
                    if(i < 0){
                        break;
                    }
                }
                temp = temp.reverse();
                System.out.println(temp);
                al.add(temp);
                i--;
            }
        }
        Collections.reverse(al);
        System.out.println(al);
    }

}
