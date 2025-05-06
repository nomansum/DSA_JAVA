public class DetectLoopInSinglyLinkedList {
 // https://leetcode.com/problems/linked-list-cycle/description/
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next==null) return false;

        ListNode harePointer = head;
        ListNode tortoisePointer = head;

        while(harePointer!=null){

            tortoisePointer = tortoisePointer.next;
            harePointer = harePointer.next;
            if(harePointer!=null)harePointer = harePointer.next;

            if( harePointer==tortoisePointer){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
          ListNode head = new ListNode(3);
          head.next = new ListNode(2);
//          head.next.next = new ListNode(0);
//          head.next.next.next = new ListNode(4);
//          head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));

    }
}
