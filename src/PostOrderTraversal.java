import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {


    public static List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> traversal = new ArrayList<>();


        traverse(traversal,root);
        return traversal;

    }

    public static void traverse(List<Integer> list , TreeNode root){

        if(root==null) return;

        traverse(list , root.left);


        traverse(list,root.right);
        list.add(root.val);


    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }



}
