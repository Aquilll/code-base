import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInBinaryTree {
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
//        finding maximum using recursion
        System.out.println(maxInBinaryTree(root));
//        finding maximum without recursion
        System.out.println(maxInBinaryTreeNoRecursion(root));
    }

    private static int maxInBinaryTreeNoRecursion(BinaryTreeNode root) {
        if(root == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<>() ;
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getData() > max)
                max = tmp.getData();
            if(tmp != null){
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                if(tmp.getRight() != null)
                    q.offer(tmp.getRight());
            }
        }
        return max;
    }

    private static int maxInBinaryTree(BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        if(root != null){
            int leftMax = maxInBinaryTree(root.left);
            int rightMax = maxInBinaryTree(root.right);
            if(leftMax > rightMax)
                maxValue = leftMax;
            else
                maxValue = rightMax;
            if(root.getData()>maxValue)
                maxValue = root.getData();
        }
        return maxValue;
    }
}
