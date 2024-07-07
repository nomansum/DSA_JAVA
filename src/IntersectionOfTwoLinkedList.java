public class IntersectionOfTwoLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    //https://leetcode.com/problems/intersection-of-two-linked-lists/description/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        while(pointer2!=pointer1){

            pointer2 = pointer2.next;
            pointer1=pointer1.next;
            if(pointer2==pointer1)return pointer1;

            if(pointer2==null) pointer2 = headA;
            if(pointer1==null) pointer1 = headB;

        }

return pointer1;

    }


    public static void main(String[] args) {

    }
}
