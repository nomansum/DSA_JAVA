import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    ListNode head ;

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    // https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {


        if(head==null){
            return null;
        }

        ListNode prevNode = head;
        ListNode  currentNode = head.next;
        ListNode nextNode = null;



        while (currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode  = currentNode;
            currentNode  = nextNode;

        }

       head.next = null;
        head = prevNode;
        return head;

    }



    public static void  main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();

        ListNode head = new ListNode(1,null);

      //  head.next  = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);

      head =   linkedList.reverseList(head);

        ListNode a = head;
        while(a!=null){
            System.out.print(a.val + "-->");
            a = a.next;
        }
        System.out.println();


    }

}
