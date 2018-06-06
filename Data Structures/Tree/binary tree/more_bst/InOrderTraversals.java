import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class InOrderTraversals {
    public static void main(String[] args) {
        BinaryTreeNode node = new BinaryTreeNode(10);
        BinaryTreeNode node1 = new BinaryTreeNode(20);
        BinaryTreeNode node2 = new BinaryTreeNode(30);
        BinaryTreeNode root = node;
        node.setLeft(node1);
        node.setRight(node2);
        InOrder(root);
        ArrayList<Integer> result = inorderTraversal(root);
        Iterator itr = result.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

//    recursive
    private static void InOrder(BinaryTreeNode root) {
        if(root != null){
            InOrder(root.getLeft());
            System.out.println(root.getData());
            InOrder(root.getRight());
        }
    }

//    iterative
    public  static ArrayList<Integer> inorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode currentNode = root;
        boolean done = false;
        while(!done){
            if(currentNode != null){
                s.push(currentNode);
                currentNode = currentNode.left;
            }else{
                if(s.isEmpty())
                    done = true;
                else{
                    currentNode = s.pop();
                    res.add(currentNode.data);
                    currentNode = currentNode.right;
                }
            }

        }
        return res;
    }
}
