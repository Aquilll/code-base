import java.util.Vector;

public class Build_Heap extends Heap{
    public static void main(String[] args) {
        Vector<Integer> array = new Vector<>();
        array.add(31);
        array.add(1);
        array.add(21);
        array.add(9);
        array.add(10);
        array.add(12);
        array.add(18);
        array.add(3);
        array.add(2);
        array.add(8);
        array.add(7);
        //array.add(12);

        int n = array.size();

        Heap h = new Heap(11,0,11);
       /* h.array.add(31);
        h.array.add(1);
        h.array.add(21);
        h.array.add(9);
        h.array.add(10);
        h.array.add(12);
        h.array.add(18);
        h.array.add(3);
        h.array.add(2);
        h.array.add(8);
        h.array.add(7);

        h.percolateDown(1);*/

        buildHeap(h,array,n);

        System.out.println(h.array);

    }

    private static void buildHeap(Heap h, Vector<Integer> array, int n) {
        if(h == null) return;
        /*for(int i = 0; i < n; i++){
            h.array.setElementAt(array.get(i),i);
        }*/
        h.array = (Vector<Integer>) array.clone();
        for(int i = (n-1)/2; i >= 0; i--)
            h.percolateDown(i);
    }
}
