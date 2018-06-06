import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBTree {
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
//        recursive
        System.out.println(sizeTreeRecursive(root));
//        non-recursive
        System.out.println(sizeTree(root));
    }

    private static int sizeTree(BinaryTreeNode root) {
        int count = 0;
        if(root == null)
            return count;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            count++;
            if(tmp.getLeft() != null)
                q.offer(tmp.getLeft());
            if(tmp.getRight() != null)
                q.offer(tmp.getRight());

        }
        return count;
    }

    private static int sizeTreeRecursive(BinaryTreeNode root) {
        int leftCount = root.getLeft() == null ? 0 : sizeTreeRecursive(root.getLeft());
        int rightCount = root.getRight() == null ? 0 : sizeTreeRecursive(root.getRight());
        return 1+leftCount+rightCount;
    }
}
