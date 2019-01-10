import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class POstOrderTraversals {
    public static void main(String[] args) {
        BinaryTreeNode node = new BinaryTreeNode(10);
        BinaryTreeNode node1 = new BinaryTreeNode(20);
        BinaryTreeNode node2 = new BinaryTreeNode(30);
        BinaryTreeNode root = node;
        node.setLeft(node1);
        node.setRight(node2);
        postOrder(root);
        ArrayList<Integer> result = postorderTraversal(root);
        Iterator itr = result.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    //    recursive
    private static void postOrder(BinaryTreeNode root) {
        if(root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }
    }

//    iterative
    private static ArrayList<Integer> postorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        BinaryTreeNode prev = null;
        while(!s.isEmpty()){
            BinaryTreeNode curr = s.peek();
            if(prev == null || prev.left == curr ||  prev.right == curr){
                if(curr.left != null)
                    s.push(curr.left);
                else if(curr.right != null)
                    s.push(curr.right);
            }else if(curr.left == prev){
                if(curr.right != null)
                    s.push(curr.right);
            }else{
                res.add(curr.data);
                s.pop();
            }
            prev = curr;
        }
        return res;
    }
}
