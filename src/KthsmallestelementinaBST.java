public class KthsmallestelementinaBST {






    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
    public static int kthSmallest(TreeNode root, int k) {

        int[] ans = new int[2];
        getKthSmallestElement(root,ans,k);

     return ans[0];
    }

public static void getKthSmallestElement (TreeNode root ,int[] ans, int k){

        if(root==null){
            return ;
        }
       getKthSmallestElement(root.left,ans,k);
        ans[1]++;
        if(k==ans[1]){
            ans[0] = root.val;
            return;
        }

        getKthSmallestElement(root.right,ans,k);


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
