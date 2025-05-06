public class CopyListWithRandomPointer {


  public static class Node {
        int val;
        Node next;
        Node random;

        public  Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    // https://leetcode.com/problems/copy-list-with-random-pointer/description/
    public static Node copyRandomList(Node head) {

        Node cur = head;
        while(cur!=null){
            Node copyNode = new Node(cur.val);
            copyNode.next = cur.next;
            cur.next = copyNode;
            cur = cur.next.next;
        }

        cur = head;
        while(cur!=null){
            Node copyNode = cur.next;
        if(cur.random!=null)    copyNode.random = cur.random.next;
          else copyNode.random = null;

            cur = cur.next.next;
        }
     Node dummyNode = new Node(-1);
        Node res = dummyNode;
        cur = head;

        while(cur!=null){

        res.next = cur.next;
        cur.next = cur.next.next;
        res =res.next;
        cur = cur.next;

        }
return dummyNode.next;

    }


    public static void main(String[] args) {

    }
}
