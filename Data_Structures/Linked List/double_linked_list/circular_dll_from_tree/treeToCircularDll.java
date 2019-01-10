public class treeToCircularDll {
    nodeDll root;
    public static void main(String[] args) {
        treeToCircularDll tree = new treeToCircularDll();
        tree.root = new nodeDll(10);
        tree.root.left = new nodeDll(12);
        tree.root.right = new nodeDll(15);
        tree.root.left.left = new nodeDll(25);
        tree.root.left.right = new nodeDll(30);
        tree.root.right.left = new nodeDll(36);

        nodeDll head = tree.convertToCDLL(tree.root);
        tree.display(head);
    }

    private nodeDll convertToCDLL(nodeDll root) {
        if(root == null)
            return null;

        nodeDll left = convertToCDLL(root.left);
        nodeDll right = convertToCDLL(root.right);

        root.left = root.right = root;

        return concatinate(concatinate(left,root), right);
    }

    public nodeDll concatinate(nodeDll leftList, nodeDll rightList){

        if(leftList == null)
            return rightList;
        if(rightList == null)
            return leftList;

        nodeDll leftLast = leftList.left;
        nodeDll rightLast = rightList.right;

        //making dll connection
        leftLast.right = rightList;
        rightList.left = leftLast;

        //making circular connection
        leftList.left = rightLast;
        rightLast.right = leftList;

        return leftList;
    }

    void display(nodeDll head){
        System.out.println("Circular Linked List is :");
        nodeDll itr = head;
        do
        {
            System.out.print(itr.data+ " " );
            itr = itr.right;
        }
        while (itr != head);
        System.out.println();
    }
}
