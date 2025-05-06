public class PopuateNextRightPointersInEachNode2 {


    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {

     Node head = root;
     while (head!=null){


         Node temp = new Node(0);
         Node dummy = temp;
         while(head!=null){

             if(head.left!=null){
                 temp.next = head.left;
                 temp = temp.next;
             }

             if(head.right!=null){
                 temp.next = head.right;
                 temp = temp.next;
             }
             head  = head.next;



         }
         head = dummy.next;


     }
     return root;
    }



}
