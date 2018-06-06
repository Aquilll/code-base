import java.util.Queue;

public class Raymond_Tree {
    private int sequence_no;
    private Queue<Integer> queue;
    private Raymond_Tree holder;

    public int getSequence_no() {
        return sequence_no;
    }

    public void setSequence_no(int sequence_no) {
        this.sequence_no = sequence_no;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }


    public Raymond_Tree getHolder() {
        return holder;
    }

    public void setHolder(Raymond_Tree holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "\n"+"{" +
                "sequence_no=" + sequence_no +
                ", queue=" + queue +
                ", holder=" + holder +
                '}';
    }
}
