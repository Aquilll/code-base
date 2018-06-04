public class LinkedListAlayAround {
    public LinkedListAlayAround(){
        int length = 0;
    }
    Node head;
    private int length = 0;
    public Node getHead(){
        return head;
    }

    public void insertBeginning(Node node){
        node.setNext(head);
        head = node;
        length++;
    }

    public void insertEnd(Node node){
        if(head == null)
            head = node;
        else{
            Node p,q;
            for(p=head; (q=p.getNext())!=null; p=q);
            p.setNext(node);
        }
        length++;
    }
    public void insertPosition(Node head, int data, int pos){
        if(pos < 0)
            pos = 0;
        if(pos > length)
            pos = length;
        Node temp=head;
        Node prev=null;
        if(head == null)
            head = new Node(data);
        else if(pos == 0){
            Node temp1 = new Node(data);
            insertBeginning(temp1);
//            temp1.setNext(head);
//            head = temp1;
        }else{
            Node newNode = new Node(data);
            int start = 1; //0 is alraedy handled
            while(start<=pos && temp!=null){
                prev = temp;
                temp=temp.getNext();
                start++;
            }
            Node next = prev.getNext();
            prev.setNext(newNode);
            newNode.setNext(next);
        }
        length++;
    }

    public void printList(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.getData()+"->");
            currentNode = currentNode.getNext();
        }
    }

    public static void main(String[] args) {
        //System.out.println("enter the size of linked list");
        //Scanner scan =  new Scanner(System.in);
        //int size = scan.nextInt();
        LinkedListAlayAround x = new LinkedListAlayAround();
//        Node node1 = new Node(5);
        /*Node node2 = new Node(53);
        Node node3 = new Node(54);
        Node node4 = new Node(65);*/
//        x.head = node1;
       /* node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);*/
//        x.printList(node1);
//        System.out.println("");
        Node nodenew = new Node(-1);
        x.insertBeginning(nodenew);
//        x.printList(nodenew);
        System.out.println("");
        Node nodenew1 = new Node(-2);
        x.insertBeginning(nodenew1);
//        x.printList(nodenew1);
        System.out.println("");
        Node nodeend = new Node(99);
        x.insertEnd(nodeend);
        //x.printList(nodenew1);
        System.out.println("");
        x.insertPosition(nodenew1,455,1);
        x.printList(nodenew1);
    }
}
