import java.util.LinkedList;
import java.util.Queue;

public class InsertElement {
    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(5);
        BinaryTreeNode node2 = new BinaryTreeNode(6);
        BinaryTreeNode node3 = new BinaryTreeNode(7);
        BinaryTreeNode node4 = new BinaryTreeNode(10);
        BinaryTreeNode node5 = new BinaryTreeNode(8);
        BinaryTreeNode node6 = new BinaryTreeNode(-2);
        BinaryTreeNode root = node1;
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
//        without recursion
//        insertInBTree(root, 13);
        System.out.println(root);
        System.out.println();
//        with recursion
        insertInBTreeRecursion(root, 13);
        System.out.println(root);
    }

    private static void insertInBTreeRecursion(BinaryTreeNode root, int data) {
        if(root == null){
            root = new BinaryTreeNode(data);
        }else{
            insertHelper(root,data);
        }
    }

    private static void insertHelper(BinaryTreeNode root, int data) {
        if(root.getData() >= data){
            if(root.getLeft() == null){
                root.setLeft(new BinaryTreeNode(data));
            }else{
                insertHelper(root.getRight(),data);
            }
        }else {
            if(root.getRight() == null){
                root.setRight(new BinaryTreeNode(data));
            }else{
                insertHelper(root.getRight(),data);
            }
        }
    }

    private static BinaryTreeNode insertInBTree(BinaryTreeNode root, int data) {
        if(root == null)
            return new BinaryTreeNode(data);
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp != null){
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                else{
                    tmp.setLeft(new BinaryTreeNode(data));
                    return root;
                }
                if(tmp.getRight() != null)
                    q.offer(tmp.getRight());
                else{
                    tmp.setRight(new BinaryTreeNode(data));
                    return root;
                }
            }
        }
        return root;
    }
}
