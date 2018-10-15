public class splitinhalf {
    public static void main(String[] args) {

        node head = new node(5);
        head.next = new node(6);
        head.next.next = new node(7);
        head.next.next.next = new node(8);
        head.next.next.next.next = new node(9);
        head.next.next.next.next.next = new node(10);
        head.next.next.next.next.next.next = head;

        System.out.println("Original List");

        printCircle(head);
        System.out.println();
//        after splitting we will have two heads viz old head and new head from below
        node newHead = splitList(head);
        printCircle(head);
        System.out.println();
        printCircle(newHead);
    }

    private static node splitList(node head) {
        node slow = head;
        node fast = head;

        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next.next == head){
            fast = fast.next;
        }

        node head1 = slow.next;
        fast.next = head1;

        slow.next = head;

        return head1;
    }

    private static void printCircle(node head) {
        node first = head;
        if(head != null){
            do{
                System.out.print(first.val+" ");
                first = first.next;
            }while(first != head);
        }else{
            System.out.println("List is empty");
        }
    }

}
