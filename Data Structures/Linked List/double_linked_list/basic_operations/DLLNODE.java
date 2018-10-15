public class DLLNODE {
    private int data;
    private DLLNODE next;
    private DLLNODE previous;

    public DLLNODE(int data) {
        this.data = data;
    }

    public DLLNODE(int data, DLLNODE previous, DLLNODE next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setNext(DLLNODE next){
        this.next = next;
    }

    public DLLNODE getNext() {
        return next;
    }

    public DLLNODE getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNODE previous) {
        this.previous = previous;
    }

//    @Override
//    public String toString() {
//        return "DLLNODE{" +
//                "data=" + data +
//                ", next=" + next +
//                ", previous=" + previous +
//                '}';
//    }
}