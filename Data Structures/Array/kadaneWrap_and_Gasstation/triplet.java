public class triplet {
    private int sum;
    private int start;
    private int end;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "triplet{" +
                "sum=" + sum +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
