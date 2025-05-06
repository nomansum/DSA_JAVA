import java.util.*;

public class BottomViewOfBinaryTree {

public static ArrayList<Integer> traverse(TreeNode root){

    HashMap<Integer,Integer> map = new HashMap<>();

    ArrayList<Integer> ans =  new ArrayList<>();

    if(root == null) return ans;

    Queue<TreeNode> queue = new LinkedList<>();

    queue.offer(root);

    while(!queue.isEmpty()){

        TreeNode temp = queue.poll();
        int hd = temp.hd;
        map.put(hd,temp.val);

        if(temp.left!=null){
            temp.left.hd = hd-1;
            queue.offer(temp.left);
        }

        if(temp.right!=null){
            temp.right.hd = hd-1;
            queue.offer(temp.right);
        }


    }

    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        ans.add(entry.getValue());
    }

return ans;
}

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int hd;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }




}
