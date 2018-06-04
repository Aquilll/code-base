public class DLLOPERATIONS {

    static DLLNODE head;

    public static void main(String[] args) {

        DLLNODE node1 = new DLLNODE(1);
        DLLNODE node2 = new DLLNODE(2);
        DLLNODE node3 = new DLLNODE(3);
        DLLNODE node4 = new DLLNODE(4);
        DLLNODE node5 = new DLLNODE(5);

        head = node1;

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(null);

        node1.setPrevious(null);
        node2.setPrevious(node1);
        node3.setPrevious(node2);
        node4.setPrevious(node3);
        node5.setPrevious(node4);

        printList(head);

//        insertion
        insertBeginning(10);

        System.out.println();
        printList(head);

       insertEnding(20);

        System.out.println();
        printList(head);

        insetrPosition(30,5);

        System.out.println();
        printList(head);

//        Deletion

        deleteBeginning();

        System.out.println();
        printList(head);

        deleteEnd();

        System.out.println();
        printList(head);

        deletePosition(5);

        System.out.println();
        printList(head);



    }

    private static void deletePosition(int position) {
        int start = 1;
        DLLNODE current = head;
        while(start<=position && current != null){
            if(start == position){
                current.getNext().setPrevious(current.getPrevious());
                current.getPrevious().setNext(current.getNext());
                current.setNext(null);
                current.setPrevious(null);
            }
            start++;
            current = current.getNext();
        }
    }

    private static void deleteEnd() {
        DLLNODE p,q;
        for(p = head; (q = p.getNext()) != null; p=q);
        p.getPrevious().setNext(null);
        p.setPrevious(null);
    }

    private static void deleteBeginning() {
        head = head.getNext();
        head.getPrevious().setNext(null);
        head.setPrevious(null);
    }

//    insertion

    private static void insetrPosition(int data, int position) {
        DLLNODE newNode = new DLLNODE(data);
        DLLNODE current = head;
        if(current == null || position == 0)
            insertBeginning(data);
        if(position > 5)
            insertEnding(data);
        int start = 1;
        while(start<=position && current != null){
            if(start == position){
               newNode.setNext(current);
               newNode.setPrevious(current.getPrevious());
               current.setPrevious(newNode);
               newNode.getPrevious().setNext(newNode);
            }
            start++;
            current = current.getNext();
        }
    }

    private static void insertEnding(int data) {
        DLLNODE newNode = new DLLNODE(data);
        DLLNODE p, q;
        for(p = head; (q = p.getNext()) != null; p = q);
        newNode.setNext(null);
        newNode.setPrevious(p);
        p.setNext(newNode);
    }

    private static void insertBeginning(int data) {
        DLLNODE newNode = new DLLNODE(data);
        newNode.setNext(head);
        head.setPrevious(newNode);
        newNode.setPrevious(null);
        head = newNode;
    }

    private static void printList(DLLNODE head) {

//      traversal
        DLLNODE current = head;
        while(current != null){
            System.out.print(current.getData()+ " ~>");
            current = current.getNext();
        }
        System.out.println();

//      reverse traversal
        DLLNODE p;
        DLLNODE q;
        for(p = head; (q = p.getNext()) != null; p = q);
        while (p != null){
        System.out.print(p.getData()+" ~>");
        p = p.getPrevious();
        }
    }


}
