public class ReverseSinglyLinkedList {
//https://leetcode.com/problems/reverse-linked-list/
    ListNode head;

public ReverseSinglyLinkedList(){
    this.head = null;
}
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        ListNode(int val , ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head) {
     ListNode current , previous , next ;
        if(head == null){
            return head;
        }
     current = head.next;
     previous = head;
     previous.next = null;
     while(current!=null) {

         next = current.next;
         current.next = previous;
         previous = current;
         current = next;

     }
return previous;
}

public void printSinglyLinkedList(){
        ListNode sll = this.head;
        while(sll!=null){
            System.out.print(sll.val + "-->");
            sll = sll.next;
        }
    System.out.println();
}

    public static void main(String[] args) {
        ReverseSinglyLinkedList solution = new ReverseSinglyLinkedList();
           solution.head = new ListNode(1);
           solution.head.next = new ListNode(2);
           solution.head.next.next = new ListNode(3);
           solution.head.next.next.next  = new ListNode(4);
          solution.head.next.next.next.next = new ListNode(5);
           solution.printSinglyLinkedList();
           solution.reverseList(solution.head);
           solution.printSinglyLinkedList();
    }
}
