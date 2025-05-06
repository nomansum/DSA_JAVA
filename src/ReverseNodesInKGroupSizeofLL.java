import java.util.List;

public class ReverseNodesInKGroupSizeofLL {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //https://leetcode.com/problems/reverse-nodes-in-k-group/
    public static ListNode reverseKGroup(ListNode head, int k) {

         ListNode currentNode = head;
         ListNode prevNode = null;
         ListNode nextNode = null;

         while(currentNode!=null){

             ListNode kthNode = getKthNode(currentNode,k);

             if(kthNode==null){
                 if(prevNode!=null) prevNode.next = currentNode;
                 break;
             }
            nextNode = kthNode.next;
             kthNode.next = null;
           reverseList(currentNode);

             if(currentNode==head){
                 head = kthNode;
               //  System.out.println(kthNode.val);
             }
             else {
              //   System.out.println(currentNode.val);
               //  System.out.println(head.val);
               //  System.out.println("here");
                 prevNode.next = kthNode;
             }
             prevNode = currentNode;
             currentNode = nextNode;



         }
  return head;
    }

    public static ListNode getKthNode(ListNode head,int k){
        k-=1;
        while(head!=null && k>0){
            head = head.next;
            --k;
        }
        return head;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode current , previous , next ;
        if(head == null ){
            return head;
        }
        current = head.next;
        previous = head;
        previous.next = null;
        while(current!=null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseKGroup(head,2);

        while(head!=null){
            System.out.print(head.val + "-->" );
            head = head.next;
        }
        System.out.println();

    }

}
