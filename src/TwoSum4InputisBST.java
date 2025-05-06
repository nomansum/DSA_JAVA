import java.util.HashSet;
import java.util.Set;

public class TwoSum4InputisBST {




    public boolean findTarget(TreeNode root, int k) {

        Set<Integer> set = new HashSet<>();
        return solve(root,k,set);


    }




    public boolean solve(TreeNode root, int val, Set<Integer> set){

        if(root==null) return false;

        int diff = val - root.val;
        if(set.contains(diff)) return true;

        set.add(root.val);

        return solve(root.left,val,set)||solve(root.right,val,set);



    }





}
