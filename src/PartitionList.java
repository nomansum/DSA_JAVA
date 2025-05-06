public class PartitionList {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode partition(ListNode head, int x) {

        if(head==null || head.next==null) return head;

        ListNode dummyUp = new ListNode(-1);
        ListNode dummyDown = new ListNode(-2);

        ListNode curr  = head;
       // ListNode temp = null;
        ListNode small = dummyDown;
        ListNode big = dummyUp;

        while(curr!=null){

        if(curr.val<x){
            small.next = curr;
            small = small.next;
        }
        else {
            big.next = curr;
            big = big.next;
        }
curr = curr.next;

        }
small.next = dummyUp.next;
big.next=null;

return dummyDown.next;

    }







}
