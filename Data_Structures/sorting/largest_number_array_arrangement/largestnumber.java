import java.util.ArrayList;

//arrange array to form largest number
public class largestnumber {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("56");
        al.add("55");
        al.add("23");
        al.add("9");

        personalcomparator sort = new personalcomparator();

        StringBuilder sb = new StringBuilder();

/*        for(int i = 0; i < al.size(); i++){
            Integer a = sort.compare(al.get(i), al.get(i+1));
//            al.remove(i);
//            al.remove(i+1);
            al.set(i,String.valueOf(a));
            al.remove(i+1);
//            sb.append(sort.compare(al.get(i), al.get(i+1))) ;

        }*/

        while(al.size() > 1){
            Integer a = sort.compare(al.get(0), al.get(1));
            al.set(0,String.valueOf(a));
            al.remove(1);

        }

        System.out.println(al.toString());
    }
}
