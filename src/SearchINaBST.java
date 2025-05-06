public class SearchINaBST {

    // https://leetcode.com/problems/search-in-a-binary-search-tree/description/
    public static TreeNode searchBST(TreeNode root, int val) {



        if(root == null) return null;

        while(root!=null){

            if(root.val==val) return root;
            if(root.val<val) root = root.right;
            else root = root.left;


        }


return null;



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
