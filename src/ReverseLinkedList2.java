public class ReverseLinkedList2 {


   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode reverseBetween(ListNode head, int left, int right) {

       if(head==null || left==right) return head;

       ListNode dummy = new ListNode(1,null);
       ListNode leftPointer = dummy;
       dummy.next = head;
       ListNode curr = head;
       for(int i=0;i<left-1;++i){
           leftPointer = curr;
           curr = curr.next;

       }

       ListNode prev = null;

       for(int i=0;i<right-left+1;++i){

           ListNode temp = curr.next;
           curr.next  = prev;

           prev = curr;
           curr = temp;

       }
       leftPointer.next.next = curr;
       leftPointer.next = prev;


return dummy.next;
    }






}
