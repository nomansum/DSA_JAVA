public class ConstructBSTfromPRE {


    // https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/

    public static TreeNode bstFromPreorder(int[] preorder) {

        int[] idx = {0};

    return bstFromPreOrder(preorder,Integer.MAX_VALUE,idx);

    }

    public  static TreeNode bstFromPreOrder(int[] preorder,int bound,int[] idx){

        if(idx[0]==preorder.length || preorder[idx[0]]>bound)return null;

        TreeNode root = new TreeNode(preorder[idx[0]++]);

        root.left = bstFromPreOrder(preorder,root.val,idx);
        root.right = bstFromPreOrder(preorder,bound,idx);
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
