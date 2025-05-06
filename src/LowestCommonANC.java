public class LowestCommonANC {

    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
    public static  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


   return trackLCA(root,p,q);




    }

    public static TreeNode trackLCA(TreeNode root,TreeNode p,TreeNode q){

        if(root == null) return null;

        if(p.val< root.val && q.val<root.val) {
          return trackLCA(root.left,p,q);
        }

        if(p.val>root.val && q.val>root.val){
            return trackLCA(root.right,p,q);
        }
        return root;

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
