import java.util.ArrayList;
import java.util.List;
 // https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class InorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> traversal = new ArrayList<>();


        traverse(traversal,root);
        return traversal;

    }

    public static void traverse(List<Integer> list , TreeNode root){

        if(root==null) return;

        traverse(list , root.left);
        list.add(root.val);

        traverse(list,root.right);


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
