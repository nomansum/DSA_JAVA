import java.util.ArrayList;

public class RootToNodePath {


    public static void main(String[] args) {

    }


public static boolean getPath(TreeNode root , ArrayList<Integer>arr,int x){

        if(root==null )return false;
        arr.add(root.val);
        if(root.val==x)return true;

        if(getPath(root.left,arr,x)||getPath(root.right,arr,x)) return true;

        arr.remove(arr.size()-1);
        return false;


}

public ArrayList<Integer> solve(TreeNode A,int B){
        ArrayList<Integer> arr = new ArrayList<>();
        if(A==null)return arr;
        getPath(A,arr,B);
        return arr;
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
