public class RotateALinkedList {


    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    // https://leetcode.com/problems/rotate-list/description/
    public static ListNode rotateRight(ListNode head, int k) {
        int len = 1;
        if(head == null || head.next==null || k==0)return head;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            len++;
        }
        if(k%len==0)return head;
        tail.next = head;

        k = k % len;

        ListNode prevOfNewHead = getNthNode(head,len-k);

        head = prevOfNewHead.next;
        prevOfNewHead.next = null;

        return head;



    }

    public static ListNode getNthNode(ListNode head,int k){
      ListNode cur = head;
      int temp = 1;
        while(cur!=null){

            if(temp==k)return cur;
            cur = cur.next;
            temp++;
        }

        return cur;


    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = rotateRight(head,2);

        while(head!=null){
            System.out.print(head.val + "-->" );
            head = head.next;
        }
        System.out.println();


    }







}
