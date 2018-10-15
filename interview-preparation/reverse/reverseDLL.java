public class reverseDLL {
    nodeDll head;
    public static void main(String[] args) {
        reverseDLL list = new reverseDLL();
        list.push(1);
        list.push(2);
        list.push(3);

        list.printList(list.head);
        System.out.println();
        list.reverse();
        list.printList(list.head);
    }

    private void reverse() {

        nodeDll temp = null;
        nodeDll curr = head;
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
    }

    private void printList(nodeDll head) {
        nodeDll curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    private void push(int i) {
        nodeDll new_node = new nodeDll(i);
        new_node.prev = null;
        new_node.next = head;
        if(head != null)
            head.prev = new_node;
        head = new_node;
    }
}
