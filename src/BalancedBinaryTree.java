public class BalancedBinaryTree {


    // https://leetcode.com/problems/balanced-binary-tree/description/
    public static boolean isBalanced(TreeNode root) {

        return maxHeight(root) != -1;

    }
    public static int maxHeight(TreeNode root){

        if(root == null )return 0;

        int leftCount = maxHeight(root.left);
        if(leftCount == -1) return -1;
        int rightCount =  maxHeight(root.right);
        if(rightCount == -1)return -1;

        if(Math.abs(leftCount-rightCount)>1) return -1;


return 1+ Math.max(leftCount,rightCount);

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
