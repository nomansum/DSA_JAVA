public class SumRootToLeafNode {

    public class TreeNode {
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

  int ans = 0;
    public int sumNumbers(TreeNode root) {

       solve(root,0);
       return ans;

    }
    public void solve(TreeNode root, int sum){

        if(root==null) return ;
        if(root.left==null && root.right==null){
            ans+=(sum*10)+root.val;
        }
        solve(root.left,sum*10+root.val);
        solve(root.right,sum*10+root.val);


    }






}
