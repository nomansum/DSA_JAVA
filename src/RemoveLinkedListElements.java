public class RemoveLinkedListElements {


      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeElements(ListNode head, int val) {

          if(head == null || (head.val==val && head.next == null))  return null;

ListNode dummyNode = new ListNode(-1);
dummyNode.next = head;

          ListNode laggingPointer = dummyNode;
          ListNode curr = head;

          while(curr!=null){

              if(curr.val == val){
                  laggingPointer.next = curr.next;
                  curr.next = null;
                  curr = laggingPointer.next;
              }
              else {
                  laggingPointer = laggingPointer.next;
                  curr = curr.next;
              }




          }

          return dummyNode.next;


    }





}
