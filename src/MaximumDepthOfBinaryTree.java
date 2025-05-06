public class MaximumDepthOfBinaryTree {



    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    public static  int maxDepth(TreeNode root) {

        if(root==null)return 0;

        int leftCount = maxDepth(root.left);
        int rightCount = maxDepth(root.right);
        return 1+Math.max(leftCount,rightCount);

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



/**
 * Definition for a binary tree node.
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
 */