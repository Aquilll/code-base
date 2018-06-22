import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class alternatediffcharacter {
    public static void main(String[] args) {
        String s = "aaabc";
        int size = s.length();
        HashMap<Character,Integer> hm = mapFrequency(s);
        iterateMap(hm);
        Character[] adjusted = adjustingString(hm, size);
        if(validate(adjusted)){
            for(int j = 0; j < size; j++){
                System.out.print(adjusted[j]+" ");
            }
        }else{
            System.out.println("not possible");
        }
    }

    private static boolean validate(Character[] adjusted) {
        for(int i = 0; i < adjusted.length-1; i++){
            if(adjusted[i] == adjusted[i+1])
                return  false;
        }
        return true;
    }

    private static Character[] adjustingString(HashMap<Character, Integer> hm, int size) {
        Character[] adjust = new Character[size];
        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        int i = 0;
        for (Map.Entry<Character, Integer> entry : entries) {
            while(entry.getValue() != 0){
                adjust[i] = entry.getKey();
                entry.setValue(entry.getValue()-1);
                i += 2;
                if(i >= size){
                    if(size%2 != 0){
                        i = i%size;
                    }else{
                        i = i %(size-1);
                    }
                }
            }
            //System.out.println(letter + " => " + frequency);
        }
        /*for(int j = 0; j < size; j++){
            System.out.print(adjust[j]+" ");
        }*/
        return adjust;
    }

    private static void iterateMap(HashMap<Character, Integer> hm) {
        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character letter = entry.getKey();
            Integer frequency = entry.getValue();

            System.out.println(letter + " => " + frequency);
        }

    }

    private static HashMap<Character,Integer> mapFrequency(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                count++;
                hm.put(s.charAt(i), count);
            }else{
                count = 1;
                hm.put(s.charAt(i), count);
            }
        }
        return hm;
    }
}
