public class PathSum {


     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static  boolean hasPathSum(TreeNode root, int targetSum) {
     if(root==null) return false;

         return isThereSum(root,targetSum);

    }

    public static boolean isThereSum(TreeNode root,int targetSum){

       if(root == null) return false;

       if(root.left==null && root.right==null){
           return (targetSum-root.val)==0;
       }

           int val = targetSum-root.val;
         return isThereSum(root.left,val) || isThereSum(root.right,val);


    }








}
