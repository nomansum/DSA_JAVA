public class InsertIntoBST {








    // https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
    public static TreeNode insertIntoBST(TreeNode root, int val) {

        TreeNode prev = root;
        TreeNode curr = root;
        TreeNode newNode = new TreeNode(val);
       if(root==null) {
           root = newNode;
           return root;
       }
        while(curr!=null){
            prev = curr;
            if(curr.val>val) curr = curr.left;
            else curr = curr.right;

        }

        if(val< prev.val)
            prev.left = newNode;

        else prev.right = newNode;


        return root;
    }




public static class TreeNode {
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
