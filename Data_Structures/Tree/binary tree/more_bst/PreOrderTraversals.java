import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PreOrderTraversals {
    public static void main(String[] args) {
        BinaryTreeNode node = new BinaryTreeNode(10);
        BinaryTreeNode node1 = new BinaryTreeNode(20);
        BinaryTreeNode node2 = new BinaryTreeNode(30);
        BinaryTreeNode root = node;
        node.setLeft(node1);
        node.setRight(node2);
        //PreOrder(root);
        ArrayList<Integer> result = preorderTraversal(root);
        Iterator itr = result.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    //recursion
    public static void PreOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.getData());
            PreOrder(root.getLeft());
            PreOrder(root.getRight());
        }
    }

    //iterative
    public static ArrayList<Integer> preorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);
            if(tmp.right != null)
                s.push(tmp.right);
            if(tmp.left != null)
                s.push(tmp.left);
        }
        return res;
    }
}
