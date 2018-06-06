import java.util.Comparator;

public class bully implements Comparator<bully> {
//    public static void main(String[] args) {
//        ArrayList<Integer> priority = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> procId = new ArrayList<>();
//    }
    private int processId;
    private int priority;

    public bully(int processId, int priority) {
        this.processId = processId;
        this.priority = priority;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "\n"+"NODE{" +
                "processId=" + processId +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compare(bully o1, bully o2) {
        int id1 = o1.getProcessId();
        int id2 = o2.getProcessId();
        if(id1 < id2)
            return 1;
        else if(id1 > id2)
            return -1;
        else
            return 0;
    }
}
