 import java.util.*;
public class CharacterRep {
       public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String str = scan.nextLine();
        char ch =scan.next().charAt(0);
        int i=0,count=0;
        while(i<str.length()){
        if(str.charAt(i)==ch){
        count++;
        }
        i++;
        }
        System.out.printf("character %c is found in the string at %d times. ", ch, count);
            scan.close();
       }
}
