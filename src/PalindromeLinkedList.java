public class PalindromeLinkedList {
//    https://leetcode.com/problems/palindrome-linked-list/description/
private static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public static boolean isPalindrome(ListNode head) {

    ListNode harePointer = head;
    ListNode tortoisePointer = head;

    while(harePointer.next!=null && harePointer.next.next!=null){
        tortoisePointer = tortoisePointer.next;
         harePointer = harePointer.next.next;
    }

    ListNode reverseHead = reverseLinkedList(tortoisePointer.next);
    ListNode first = head;
    ListNode second = reverseHead;

    while(second!=null){

        if(second.val!=first.val){
            reverseLinkedList(reverseHead);
            return false;
        }


        second = second.next;
        first = first.next;

    }

    reverseLinkedList(reverseHead);

return true;
    }

    public static ListNode reverseLinkedList(ListNode head){

    if(head==null || head.next==null){
        return head;
    }

      ListNode prevPointer=head;
      ListNode currentPointer = head.next;
      ListNode nextPointer = null;

      while(currentPointer!=null){

          nextPointer = currentPointer.next;
          currentPointer.next = prevPointer;
          prevPointer = currentPointer;
          currentPointer = nextPointer;

      }

      head.next = null;

      head = prevPointer;
      return prevPointer;

    }

    public static void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
        System.out.println(isPalindrome(head));
    }

}
