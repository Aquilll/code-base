public class swaptwonodeslinkedlist {
    public node head;
    public static void main(String[] args) {
        swaptwonodeslinkedlist llist = new swaptwonodeslinkedlist();
        for(int i = 1; i < 7; i++){
            llist.addList(i);
        }
        llist.printList();
        llist.swap(3,5);
        System.out.println();
        llist.printList();
    }

    public void swap(int x, int y) {
        if(x == y)
            return;

        node prevx = null, currx = head;
        while(currx != null && currx.val != x){
            prevx = currx;
            currx = currx.next;
        }

        node prevy = null, curry = head;
        while(curry != null && curry.val != y){
            prevy = curry;
            curry = curry.next;
        }

        if(prevx != null)
            prevx.next = curry;
        else
            head = curry;

        if(prevy != null)
            prevy.next = currx;
        else
            head = currx;

        node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;
    }

    public void addList(int i) {
        node new_node = new node(i);
        new_node.next = head;
        head = new_node;
    }

    //reverse order
    public void printList(){
        node curr = head;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
}
