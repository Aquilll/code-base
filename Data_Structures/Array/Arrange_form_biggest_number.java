import java.util.*;

public class Arrange_form_biggest_number {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();//String helps to append
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
            v.add(new Scanner(System.in).next());
        }
//        v.add("54");
//        v.add("546");
//        v.add("548");
//        v.add("60");

        rearranger(v,n);
    }

    private static void rearranger(Vector<String> v, int n) {
        Collections.sort(v, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1o2 = o1 + o2;
                String o2o1 = o2 + o1;
                return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
            }
        });
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
