public class mergeTwoSortedLinkedlist {
    node head;

    public static void main(String[] args) {
        mergeTwoSortedLinkedlist list1 = new mergeTwoSortedLinkedlist();
        list1.head = new node(2);
        list1.head.next = new node(3);
        list1.head.next.next = new node(7);
        list1.head.next.next.next = new node(8);

        mergeTwoSortedLinkedlist list2 = new mergeTwoSortedLinkedlist();
        list2.head = new node(1);
        list2.head.next = new node(4);
        list2.head.next.next = new node(6);
        list2.head.next.next.next = new node(12);

        /*list1.printlist();
        System.out.println();
        list2.printlist();*/

        node result = mergeList(list1,list2);
        printlist(result);
    }

    public static node mergeList(mergeTwoSortedLinkedlist list1 ,mergeTwoSortedLinkedlist list2) {
        node new_head;
        node s;
        node p = list1.head;
        node q = list2.head;

        if(p.val < q.val){
            s = p;
            p = s.next;
        }else{
            s = q;
            q = s.next;
        }

        new_head = s;

        while(p != null && q != null){
            if(p.val < q.val){
                s.next = p;
                s = p;
                p = s.next;
            }else{
                s.next = q;
                s = q;
                q = s.next;
            }
        }
        if(p == null)
            s.next = q;
        if(q == null)
            s.next = p;

        return new_head;
    }

    private void printlist() {
        node cur = head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }

    public static void printlist(node res) {
        node cur = res;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
}
