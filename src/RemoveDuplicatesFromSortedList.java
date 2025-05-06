public class RemoveDuplicatesFromSortedList {



  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



    public ListNode deleteDuplicates(ListNode head) {


      ListNode res = head;

      while (head!=null && head.next!=null){

          if(head.val == head.next.val){
              head.next = head.next.next;
          }
          else head = head.next;

      }


      return res;

    }

    public ListNode deleteDuplicatess(ListNode head) {

      ListNode dummyNode = new ListNode(-1000);
      ListNode laggingNode = dummyNode;
      dummyNode.next = head;
      ListNode curr = head;

      while(curr!=null){

          if(laggingNode.val != curr.val){
              laggingNode = laggingNode.next;
              curr = curr.next;
              continue;
          }
          ListNode temp = curr;
          while(curr!=null && laggingNode.val == curr.val){
              temp = curr;
              curr = curr.next;
          }

          temp.next = null;
          laggingNode.next = curr;




      }


      return dummyNode.next;

    }





}
