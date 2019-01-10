public class UseLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        LinkedListAlayAround x = new LinkedListAlayAround();
        x.insertBeginning(node);
        Node node1 = new Node(2);
        x.insertBeginning(node1);
        Node node2 = new Node(3);
        x.printList(node);
    }
}
