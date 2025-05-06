import java.util.*;
public class CousinsInBinaryTree {





    class Triplet{
        public TreeNode parent;
        public TreeNode current;
        public int level;
        public Triplet(TreeNode parent, TreeNode current ,int level){
            this.parent = parent;
            this.current = current;
            this.level = level;
        }
    }

    // declaring two private triplet for the given cousin nodes
    private Triplet ForX = null , ForY = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<Triplet> q = new LinkedList<>();
        q.add(new Triplet(null , root , 1));

        while(!q.isEmpty() && (ForX == null || ForY == null)){
            Triplet triplet = q.poll();
            if(triplet.current.val == x){
                ForX = triplet;
            }
            if(triplet.current.val == y){
                ForY = triplet;
            }
            if(triplet.current.left != null){
                q.add(new Triplet(triplet.current,triplet.current.left,triplet.level+1));
            }
            if(triplet.current.right != null){
                q.add(new Triplet(triplet.current,triplet.current.right,triplet.level+1));
            }
        }
        return (ForX.level  == ForY.level && ForX.parent != ForY.parent);
    }








}
