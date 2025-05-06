public class BinaryTreeMaximumPathSum {



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



    public int maxPathSum(TreeNode root) {


   int[] result = new int[1];

result[0] = root.val;
 solve(root,result);

 return result[0];


    }

    public static int solve(TreeNode root,int[] result){

         if(root==null) return 0;

         int leftMax = solve(root.left,result);
         int rightMax = solve(root.right,result);

         int left = Math.max(0,leftMax);
         int right = Math.max(0,rightMax);

         result[0] = Math.max(result[0],root.val+left+right);

        return root.val+Math.max(left,right);


    }




}
