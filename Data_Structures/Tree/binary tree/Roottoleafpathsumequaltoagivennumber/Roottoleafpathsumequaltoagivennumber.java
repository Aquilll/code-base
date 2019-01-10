public class Roottoleafpathsumequaltoagivennumber {
    treenode root;
    public static void main(String[] args) {
        int sum = 21;
        Roottoleafpathsumequaltoagivennumber tree = new Roottoleafpathsumequaltoagivennumber();
        tree.root = new treenode(10);
        tree.root.left = new treenode(8);
        tree.root.right = new treenode(2);
        tree.root.left.left = new treenode(3);
        tree.root.left.right = new treenode(5);
        tree.root.right.left = new treenode(2);

        if (tree.haspathSum(tree.root, sum))
            System.out.println("There is a root to leaf path with sum " + sum);
        else
            System.out.println("There is no root to leaf path with sum " + sum);
    }

    private boolean haspathSum(treenode node, int sum) {

        if (node == null)
            return (sum == 0);
        else{
            boolean ans = false;
            int subsum = sum - node.data;
            if(node.left == null && node.right == null && subsum == 0)
                return true;
            if (node.left != null)
                ans = ans || haspathSum(node.left, subsum);
            if (node.right != null)
                ans = ans || haspathSum(node.right, subsum);
            return ans;
        }
    }
}
