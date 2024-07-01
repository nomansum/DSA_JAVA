public class MergeTwoSortedSll {

//https://leetcode.com/problems/merge-two-sorted-lists/
ListNode head;
public  MergeTwoSortedSll(){
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
    public ReverseSinglyLinkedList.ListNode reverseList(ReverseSinglyLinkedList.ListNode head) {
        ReverseSinglyLinkedList.ListNode current , previous , next ;
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

    public void printSinglyLinkedList(ListNode sll){

        while(sll!=null){
            System.out.print(sll.val + "-->");
            sll = sll.next;
        }
        System.out.println();
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode node = new ListNode();
       ListNode newHead = node;
       while(list1!=null && list2!=null){
           if(list1.val<list2.val){
               node.next = list1;
               list1 = list1.next;
           }
           else{
               node.next = list2;
               list2 = list2.next;
           }
           node = node.next;
       }
       while (list1!=null){
           node.next = list1;
           list1 = list1.next;

           node = node.next;
       }

        while (list2!=null){
            node.next = list2;
            list2 = list2.next;

            node = node.next;
        }
 return newHead.next;
    }

    public static void main(String[] args) {
              MergeTwoSortedSll list1 = new MergeTwoSortedSll();
              list1.head = new ListNode(1);
              list1.head.next = new ListNode(2);
              list1.head.next.next = new ListNode(4);
              MergeTwoSortedSll list2 = new MergeTwoSortedSll();
        list2.head = new ListNode(1);
        list2.head.next = new ListNode(3);
        list2.head.next.next = new ListNode(4);
        ListNode sll = list1.mergeTwoLists(list1.head,list2.head);
        list1.printSinglyLinkedList(sll);

    }
}
