public class BinarySearchTree {

private TreeNode root;

private class TreeNode{
    private int data;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }


}
public BinarySearchTree(){
    this.root = null;
}

private TreeNode insert(TreeNode root,int value){
    if(root == null){
        root = new TreeNode(value);
        return root;
    }
    if( root.data > value ){
        root.left = insert(root.left,value);
    }
    else{
        root.right = insert(root.right,value);
    }
    return  root;
}
public void insert(int value){
    this.root = this.insert(this.root,value);
}


public void inOrderTraversal(TreeNode root){

    if(root == null){
        return;
    }
    inOrderTraversal(root.left);
    System.out.println(root.data);
    inOrderTraversal(root.right);
}


public TreeNode getRoot(){
    return this.root;
}

public TreeNode search(TreeNode root, int key){
    if(root == null || root.data == key){
        return root;
    }
    if(root.data<key){
        return search(root.right,key);
    }
    else{
        return search(root.left,key);
    }
}

// 1. If you go towards left subtree min remains same & max changes to parent value
// 2. If you go towards the right subtree max remains same & min changes to parent value

public boolean isValidBST(TreeNode root, long min , long max){

    if(root == null){
        return true;
    }

    if(root.data<=min || root.data>=max){
        return false;
    }
    boolean left = isValidBST(root.left,min,root.data);
    if(left){
        boolean right = isValidBST(root.right,root.data,max);
        return right;
    }
    return false;


}

    public static void main(String[] args){
        System.out.println("here");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(4);
        bst.insert(1);
        bst.insert(0);
        bst.insert(6);
        bst.insert(5);



        bst.inOrderTraversal(bst.getRoot());
        TreeNode node = bst.search(bst.getRoot(),4);
        System.out.println(bst.isValidBST(bst.getRoot(), Long.MIN_VALUE,Long.MAX_VALUE));

    }
}
