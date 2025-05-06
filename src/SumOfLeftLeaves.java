public class SumOfLeftLeaves {




    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null) return 0;
        int val = 0;

        if(root.left!=null && root.left.left==null && root.left.right==null){
            val+=root.left.val;
        }

        return val+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);


    }






}
