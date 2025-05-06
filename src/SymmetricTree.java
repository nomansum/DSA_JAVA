public class SymmetricTree {


    // https://leetcode.com/problems/symmetric-tree/description/
    public static boolean isSymmetric(TreeNode root) {
      return isMirror(root.left,root.right);
    }



    public static boolean isMirror(TreeNode a,TreeNode b){

        if(a==null && b==null)return true;
        if(a==null || b== null)return false;

        return a.val == b.val && isMirror(a.left,b.right) && isMirror(a.right,b.left);

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


    public static void main(String[] args) {

    }


}
