public class DeleteTheMiddleNodeOfALinkedList {
    // https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/


    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode deleteMiddle(ListNode head) {

        ListNode fastPointer = head;
        ListNode slowPointer = head;
        ListNode laggingPointer = head;
        if(head.next == null){
            head = null;
            return head;
        }


        while(fastPointer.next!=null){
            laggingPointer = slowPointer;
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
            if(fastPointer.next!=null) {
                fastPointer = fastPointer.next;
            }
        }

    laggingPointer.next = laggingPointer.next.next;
        slowPointer.next = null;
        return head;


    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

      head = deleteMiddle(head);

      ListNode cur = head;

      while(cur!=null){
          System.out.print(cur.val+ "-->");
          cur  = cur.next;
      }
        System.out.println();



    }
}
