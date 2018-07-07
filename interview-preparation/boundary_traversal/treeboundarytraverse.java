public class treeboundarytraverse {
    public static void main(String[] args) {
        treenode root = new treenode(20);
        root.left = new treenode(8);
        root.left.left = new treenode(4);
        root.left.right = new treenode(12);
        root.left.right.left = new treenode(10);
        root.left.right.right = new treenode(14);
        root.right = new treenode(22);
        root.right.right = new treenode(25);

        printBoundary(root);
    }

    private static void printBoundary(treenode root) {
        if(root != null){
            System.out.print(root.data+" ");
            printBoundaryLeft(root.left);
            printLeaf(root.left);
            printLeaf(root.right);
            printBoundaryRight(root.right);
        }
    }

    private static void printBoundaryRight(treenode root) {
        if(root != null){
            if(root.right != null){
                printBoundaryRight(root.right);
                System.out.print(root.data+" ");
            }
            else if(root.left != null){
                printBoundaryRight(root.left);
                System.out.print(root.data+" ");
            }
        }
    }

    private static void printLeaf(treenode root) {
        if(root != null){
            printLeaf(root.left);
            if(root.left == null && root.right == null)
                System.out.print(root.data+" ");
            printLeaf(root.right);
        }
    }

    private static void printBoundaryLeft(treenode root) {
        if(root != null){
            if(root.left != null){
                System.out.print(root.data+" ");
                printBoundaryLeft(root.left);
            }
            else if(root.right != null){
                System.out.print(root.data+" ");
                printBoundaryLeft(root.right);
            }
        }
    }
}
