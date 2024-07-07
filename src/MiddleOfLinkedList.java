public class MiddleOfLinkedList {
    //https://leetcode.com/problems/middle-of-the-linked-list/description/

  ListNode head ;

      private static class ListNode {
      int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }





    public  ListNode middleNode(ListNode head) {
        ListNode harePointer =head;
        ListNode tortoisePointer = head;

        while(harePointer.next!=null){
            tortoisePointer  = tortoisePointer.next;
            harePointer = harePointer.next;
            if(harePointer.next!=null)harePointer = harePointer.next;
        }
        return tortoisePointer;

    }

    public static void  main(String[] args) {
      MiddleOfLinkedList linkedList = new MiddleOfLinkedList();

      ListNode head = new ListNode(1,null);

      head.next  = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next = new ListNode(6);
        System.out.println(linkedList.middleNode(head).val);

    }


}
