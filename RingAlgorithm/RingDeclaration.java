import java.util.Comparator;

public class RingDeclaration implements Comparator<RingDeclaration>{
    private int processId;

    private int priority;

    private double status;

    public RingDeclaration(int processId, int priority, double status) {
        this.processId = processId;
        this.priority = priority;
        this.status = status;
    }

    public int getProcessId() {
        return processId;
    }

    public int getPriority() {
        return priority;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setStatus(double status){
        this.status = status;
    }

    public double getStatus(){
        return status;
    }


    @Override
    public String toString() {
        return "processId=" + processId + " "+
                "priority=" + priority +" " +
                "status=" + status +"\n";
    }

    @Override
    public int compare(RingDeclaration o1, RingDeclaration o2) {
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
