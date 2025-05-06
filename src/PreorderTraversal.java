import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {


    // https://leetcode.com/problems/binary-tree-preorder-traversal/description/
    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> traversal = new ArrayList<>();


   traverse(traversal,root);
return traversal;

    }

    public static void traverse(List<Integer> list , TreeNode root){

        if(root==null) return;

        list.add(root.val);
        traverse(list , root.left);
        traverse(list,root.right);


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

/**
 * Definition for a binary tree node.

 */