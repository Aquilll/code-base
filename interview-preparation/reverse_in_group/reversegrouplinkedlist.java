public class reversegrouplinkedlist {
    node head;

    public static void main(String[] args) {
        reversegrouplinkedlist list = new reversegrouplinkedlist();
        for(int i = 0; i < 6; i++)
            list.pushList(i);
        list.printList();
        list.head = list.reverseGroup(list.head,3);
        System.out.println();
        list.printList();
    }

    private void pushList(int i) {
        node new_node = new node(i);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        node curr = head;
        while(curr != null){
            System.out.print(curr.val+"~>");
            curr = curr.next;
        }
    }

    public node reverseGroup(node Node, int k){
        node prev = null;
        node Next = null;
        node curr = Node;
        int count = 0;
        while(count < k && curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            count++;
        }
        if(Next != null)
            Node.next = reverseGroup(Next,k);
        return prev;
    }
}
