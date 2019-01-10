public class findinganddeletingloop {
    node head;

    public static void main(String[] args) {
        findinganddeletingloop list = new findinganddeletingloop();
        for(int i = 0; i < 6; i++)
            list.pushList(i);
        list.head.next.next.next.next.next = list.head.next.next;
        //list.printList();
        list.findLoopAndRemove(list.head);
        list.printList();
        System.out.println();
        list.printList();
    }



    private int findLoopAndRemove(node head) {
        node curr = head;
        node slow = head;
        node fast = head;

        while(slow.next != null && fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                //open below comment for another method
                /*deleteLoop2(slow,head);
                //open below comment for another method
                //deleteLoop(slow, head);
                return 1;*/
                //below is another method
                slow = head;
                while(slow.next != fast.next){
                    fast = fast.next;
                    slow = slow.next;
                }
                fast.next = null;
            }
        }
        return 0;
    }

    private void deleteLoop2(node loop, node head) {
        node ptr1 = null;
        node ptr2 = null;

        ptr1 = head;

        ptr2 = loop;
        int k = 1;
        while(ptr2.next != loop){
            ptr2 = ptr2.next;
            k++;
        }
        ptr2 = head;
        while( k > 0){
            ptr2 = ptr2.next;
            k--;
        }

        while(ptr2.next != ptr1.next){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
            ptr2.next = null;
    }

    private void deleteLoop(node loop, node head) {
        node ptr1 = null;
        node ptr2 = null;

        ptr1 = head;

        while(1 == 1){
            ptr2 = loop;
            while(ptr2.next != loop && ptr2.next != ptr1){
                ptr2 = ptr2.next;
            }
            if(ptr2.next == ptr1)
                break;

            ptr1 = ptr1.next;
        }
        ptr2.next = null;
    }

    private void printList() {
        node curr = head;
        while(curr != null){
            System.out.print(curr.val+"~>");
            curr = curr.next;
        }
    }

    private void pushList(int i) {
        node new_node = new node(i);
        new_node.next = head;
        head = new_node;
    }
}
