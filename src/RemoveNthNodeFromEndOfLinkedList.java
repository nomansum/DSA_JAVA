public class RemoveNthNodeFromEndOfLinkedList {
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }




    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fastPointer = head;
        ListNode slowPointer = head;
        for(int i=0;i<n;++i){
            fastPointer = fastPointer.next;
        }
         if(fastPointer== null){
             ListNode temp = head;
             head = head.next;
             temp.next = null;
             return head;
         }
        while(fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        ListNode  temp = slowPointer.next;
        slowPointer.next = slowPointer.next.next;
        temp.next = null;

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


        ListNode cur =removeNthFromEnd(head,1);
        while(cur!=null){
            System.out.print(cur.val + "-->");
            cur = cur.next;
        }
        System.out.println();

    }
}
