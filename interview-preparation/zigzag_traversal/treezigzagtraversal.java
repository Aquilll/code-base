import java.util.Stack;

public class treezigzagtraversal {
    static treenode root;
    public static void main(String[] args) {
        treezigzagtraversal tree = new treezigzagtraversal();
        tree.root = new treenode(1);
        tree.root.left = new treenode(2);
        tree.root.right = new treenode(3);
        tree.root.left.left = new treenode(7);
        tree.root.left.right = new treenode(6);
        tree.root.right.right = new treenode(4);
        tree.root.right.left = new treenode(5);

        zigzagTravaersal();
    }

     static void zigzagTravaersal() {
        if(root == null){
            return;
        }
        Stack<treenode> currentLevel = new Stack<>();
        Stack<treenode> nextLevel = new Stack<>();

        currentLevel.push(root);
        boolean rightToLeft = true;

        while(!currentLevel.isEmpty()){
            treenode node = currentLevel.pop();
            System.out.print(node.data+" ");

            if(rightToLeft){
                if(node.left != null){
                    nextLevel.push(node.left);
                }
                if(node.right != null){
                    nextLevel.push(node.right);
                }
            }else{
                if(node.right != null){
                    nextLevel.push(node.right);
                }
                if(node.left != null){
                    nextLevel.push(node.left);
                }
            }
            if(currentLevel.isEmpty()){
                rightToLeft = !rightToLeft;
                Stack<treenode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
}
