import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Implementation_Raymond_tree {
    public static void main(String[] args) {
        ArrayList<Raymond_Tree> list = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 7; i++){
            Raymond_Tree t = new Raymond_Tree();
            t.setSequence_no(i);
            t.setQueue(new LinkedList<>());
            t.setHolder(null);
            list.add(t);
        }
//        rand.nextInt(10)+1
        System.out.println(list);
        list.get(0).setHolder(list.get(1));
        list.get(1).setHolder(list.get(2));
        list.get(3).setHolder(list.get(0));
        list.get(4).setHolder(list.get(0));
        list.get(5).setHolder(list.get(4));
        list.get(6).setHolder(list.get(4));
        System.out.println();
//        System.out.println(list);
        System.out.println(list.get(5).getHolder().getSequence_no());
        System.out.println(list.get(6).getHolder().getSequence_no());

    }
}
