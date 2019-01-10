public class mergeSortLinkedlist {
    node head;
    node grand_head;
    public static void main(String[] args) {
        mergeSortLinkedlist list = new mergeSortLinkedlist();
        list.head = new node(7);
        list.head.next = new node(1);
        list.head.next.next = new node(8);
        list.head.next.next.next = new node(9);
        list.head.next.next.next.next = new node(10);
        list.head.next.next.next.next.next = new node(2);

        System.out.println("List before sorting");
        list.printList();
        System.out.println();

        list.head = list.mergeSortList(list.head);
        System.out.println("List after sorting");
        list.printList();
    }

    public node mergeSortList(node head) {
        if(head == null || head.next == null)
            return head;

        node middle = getMiddle(head);
        node nextofmiddle = middle.next;
        middle.next = null;

        node left = mergeSortList(head);
        node right = mergeSortList(nextofmiddle);

        //node sortedList = sortedMerge(left,right);
        node sortedList = sortedMerge2(left,right);

        return sortedList;
    }

    private node sortedMerge2(node left, node right) {
        node s;
        node p = left;
        node q = right;

        if(p.val < q.val){
            s = p;
            p = s.next;
        }
        else{
            s = q;
            q = s.next;
        }

        node new_node = s;

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

        if(p == null) s.next = q;
        if(q == null) s.next = p;

        return new_node;
    }

    private node sortedMerge(node left, node right) {

        node result = null;
        if(left == null)
            return right;
        if(right == null)
            return left;

        if(left.val < right.val){
            result = left;
            result.next =sortedMerge(left.next, right);
        }else{
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    public  node getMiddle(node head) {

        if(head == null)
            return head;

        node slow = head;
        node fast = head.next;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public void printList() {
        node curr = head;
        while(curr != null){
            System.out.print(curr.val+"~>");
            curr = curr.next;
        }
    }


}
