public class LinkedListCycleII {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/description/

    public static ListNode detectCycle(ListNode head) {
        ListNode collisionPoint = hasCycle(head);
        if(collisionPoint == null) return null;
        ListNode tempPointer = head;

        while(tempPointer!=collisionPoint){
            tempPointer = tempPointer.next;
            collisionPoint = collisionPoint.next;
        }
        
        return collisionPoint;



    }

    public static ListNode hasCycle(ListNode head) {

        if(head == null || head.next==null) return null;

        ListNode harePointer = head;
        ListNode tortoisePointer = head;

        while(harePointer!=null){

            tortoisePointer = tortoisePointer.next;
            harePointer = harePointer.next;
            if(harePointer!=null)harePointer = harePointer.next;

            if( harePointer==tortoisePointer){
                return tortoisePointer;
            }

        }
        return null;
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
