public class BSTOPERATIONS {

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

       int a = maxHeight(root);
        System.out.println(a);

        int max = maxInBinaryTree(root);
        System.out.println(max);

        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
   /*     //        with recursion
        insertRecursion(root, 13);
        System.out.println(root);

        BinaryTreeNode del = delete(root, 13);
        System.out.println(del);
    */
    }

    public static void insertRecursion(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(data);
        } else {
            insertHelper(root, data);
        }
    }

    private static void insertHelper(BinaryTreeNode root, int data) {
        if (root.getData() >= data) {
            if (root.getLeft() == null) {
                root.setLeft(new BinaryTreeNode(data));
            } else {
                insertHelper(root.getRight(), data);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new BinaryTreeNode(data));
            } else {
                insertHelper(root.getRight(), data);
            }
        }
    }

    public static BinaryTreeNode delete(BinaryTreeNode root, int data) {
        if (root == null)
            return root;

        else if (data < root.getData())
            root.setLeft(delete(root.getLeft(), data));

        else if (data > root.getData())
            root.setRight((delete(root.getRight(), data)));

        else {
//            case 1 no child
            if (root.getLeft() == null && root.getRight() == null) {
                root = null;
            }

//            case 2 one child
            else if (root.getLeft() == null) {
                BinaryTreeNode tmp = root;
                root = root.getRight();
            } else if (root.getRight() == null) {
                BinaryTreeNode tmp = root;
                root = root.getLeft();
            }

//            case 3 two children
            else {
                BinaryTreeNode tmp = FindMin(root.getRight());
                root.setData(tmp.getData());
                root.setRight(delete(root.getRight(), tmp.getData()));
            }
        }
        return root;
    }

    public static BinaryTreeNode FindMin(BinaryTreeNode root) {
        BinaryTreeNode minv = root;
        while (root.left != null) {
            minv.data = root.left.getData();
            root = root.left;
        }
        return minv;

    }

    public static int maxHeight(BinaryTreeNode root){
        if(root == null)
            return 0;
        // compute depth of each subtree
        int leftDepth = maxHeight(root.left);
        int rightDepth = maxHeight(root.right);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1 ;
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

    public static void inorder(BinaryTreeNode root){
        if(root == null) return;
        inorder(root.getLeft());
        System.out.print(root.getData()+ " ~>");
        inorder(root.getRight());
    }

    public static void preorder(BinaryTreeNode root){
        if(root == null) return;
        preorder(root.getLeft());
        preorder(root.getRight());
        System.out.print(root.getData()+ " ~>");
    }

    public static void postorder(BinaryTreeNode root){
        if(root == null) return;
        System.out.print(root.getData()+" ~>");
        postorder(root.getLeft());
        postorder(root.getRight());
    }

}
