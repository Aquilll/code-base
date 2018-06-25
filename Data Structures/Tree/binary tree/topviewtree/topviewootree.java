//@author Aquil

import javax.swing.tree.TreeNode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class topviewootree {
    //static treenode root;
    public static void main(String[] args) {

        topviewootree tree = new topviewootree();
/*        tree.root = new treenode(1);
        tree.root.left = new treenode(2);
        tree.root.right = new treenode(3);
        tree.root.left.left = new treenode(4);
        tree.root.left.right= new treenode(5);
        tree.root.right.left = new treenode(6);
        tree.root.right.right = new treenode(7);*/

        treenode root = new treenode(1);
        root.left = new treenode(2);
        root.right = new treenode(3);
        root.left.right = new treenode(4);
        root.left.right.right = new treenode(5);
        root.left.right.right.right = new treenode(6);

        System.out.println("Following are nodes in top view of Binary Tree");
        printTopView(root);



        //level order traversal
//        ArrayList<ArrayList<Integer>> level = levelTraverse();

        //horizontal traversal

/*        int size = 0;

        for(int i = 0; i < level.size(); i++){
            for(int j = 0; j < level.get(i).size(); j++){
                size++;
            }
        }

        int[] arrLevel = new int[size];

        int k = 0;
        for(int i = 0; i < level.size(); i++){
            for(int j = 0; j < level.get(i).size(); j++){
                arrLevel[k] = level.get(i).get(j);
                k++;
            }
        }

        for(int i = 0; i < arrLevel.length; i++){
            System.out.print(arrLevel[i]+ " ");
        }*/
    }

    private static void printTopView(treenode root) {
        if (root == null)
        {
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        Queue<Qitems> Q = new LinkedList<Qitems>();
        Q.add(new Qitems(root, 0));

        while (!Q.isEmpty())
        {
            Qitems qi = Q.remove();
            int hd = qi.hd;
            treenode n = qi.node;

            // If this is the first node at its horizontal distance,
            // then this node is in top view
            if (!set.contains(hd))
            {
                set.add(hd);
                System.out.print(n.data + " ");
            }

            // Enqueue left and right children of current node
            if (n.left != null)
                Q.add(new Qitems(n.left, hd-1));
            if (n.right != null)
                Q.add(new Qitems(n.right, hd+1));
        }
    }

/*    //for level order traversal
    static ArrayList<ArrayList<Integer>> levelTraverse() {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<treenode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> cur = new ArrayList<>();
        while(!q.isEmpty()){
            treenode tmp = q.poll();
            if(tmp != null){
                cur.add(tmp.data);
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }else{
                ArrayList<Integer> cur_s = new ArrayList<>(cur);
                res.add(cur_s);
                cur.clear();
                if(!q.isEmpty())
                    q.offer(null);
            }
        }
        return res;
    }*/
}
