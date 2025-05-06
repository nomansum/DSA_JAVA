public class ValidateBST {




    // https://leetcode.com/problems/validate-binary-search-tree/description/
    public static boolean isValidBST(TreeNode root) {

        return checkBSTOrNot(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    public static boolean checkBSTOrNot(TreeNode root,long minVal,long maxVal){

        if(root==null)return true;
        if(root.val>=maxVal || root.val<=minVal)return false;
        return checkBSTOrNot(root.left,minVal,root.val) && checkBSTOrNot(root.right,root.val,maxVal);


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
