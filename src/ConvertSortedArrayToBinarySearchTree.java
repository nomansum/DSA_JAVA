public class ConvertSortedArrayToBinarySearchTree {







    public TreeNode sortedArrayToBST(int[] nums) {

        return makeTree(nums,0,nums.length-1);


    }
    public TreeNode makeTree(int[] nums,int left , int right){

        if(left>right) return null;
        int mid = (left+right)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = makeTree(nums,left,mid-1);
        root.right = makeTree(nums,mid+1,right);

        return root;

    }




}
