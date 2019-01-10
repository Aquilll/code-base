import java.util.Vector;

public class Heap {

    public Vector<Integer> array;
    public int count;
    public int capacity;
    public int heap_type;

    public Heap(){
        /*this.heap_type = heap_type;
        this.count = 0;
        this.capacity = capacity;
        this.array = new ArrayList<>(capacity);*/
    }

    public Heap(int capacity, int heap_type,int count){
        this.heap_type = heap_type;
        this.count = count;
        this.capacity = capacity;
        this.array = new Vector<>(capacity);
    }

    public int parent(int i){
        if(i <= 0 || i >= this.count)
            return -1;
        return i-1/2;
    }

    public int leftChild(int i){
        int left = 2*i+1;
        //System.out.println(left);
        if(left >= this.count)
            return -1;
        return left;
    }

    public int rightChild(int i){
        int right = 2*i+2;
        //System.out.println(right);
        if(right >= this.count)
            return -1;
        return right;
    }

    public int getMaximum(){
        if(this.count == 0)
            return -1;
        return this.array.get(0);
    }

    //heapify
    public void percolateDown(int i){
        int l, r, max, temp;
        l = leftChild(i);
        //System.out.println(l);
        r = rightChild(i);
        //System.out.println(r);
        //System.out.println(this.array.get(i));
        if(l != -1 && this.array.get(l) > this.array.get(i)){
            max = l;
            //System.out.println("this is max via left "+max);
        }
        else
            max = i;
        if(r != -1 && this.array.get(r) > this.array.get(max)){
            max = r;
            //System.out.println("this is max via right "+max);
        }
        if(max != i){
            temp = this.array.get(i);
            this.array.setElementAt(this.array.get(max),i);
            this.array.setElementAt(temp,max);
            //System.out.println(this.array);
            //System.out.println();
            percolateDown(max);
        }
    }

    int DeleteMax(){
        if(this.count == 0)
            return -1;
        int data = this.array.get(0);
        this.array.setElementAt( this.array.get(this.count-1),0);
        this.count--;
        percolateDown(0);
        return data;
    }

    public void insert(int data){
        int i;
        this.count++;
        i = this.count-1;
        while(i >= 0 && data > this.array.get(i-1/2)){
            this.array.setElementAt(this.array.get(i-1/2), i);
            i = i-1/2;
        }
        this.array.setElementAt(data,i);
    }
}
