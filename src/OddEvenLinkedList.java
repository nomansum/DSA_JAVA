import java.util.Currency;
import java.util.List;

public class OddEvenLinkedList {

    // https://leetcode.com/problems/odd-even-linked-list/description/

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode oddEvenList(ListNode head) {

        if(head==null || head.next == null){
            return head;
        }

        ListNode oddIndexHead = head;
        ListNode evenIndexHead = head.next;
        ListNode odd = head;
        ListNode even = head.next;

        while(odd.next != null && even.next != null){

            if( even.next!=null){
                odd.next = even.next;
                odd = odd.next;
            }

            else{
                odd.next = null;
            }

            if(odd.next!=null){
                even.next = odd.next;
                even = even.next;

            }
            else{
                even.next = null;
            }



        }

        odd.next = evenIndexHead;

        return oddIndexHead;

    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);


        ListNode cur = oddEvenList(head);
        while(cur!=null){
            System.out.print(cur.val + "-->");
        cur = cur.next;
        }
        System.out.println();

    }
}
