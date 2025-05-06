public class AddOneToANumberRepresentedByLL {


    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode addOneToTheNumber(ListNode head){

        int carry = helper(head);

        if(carry==1){
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        return head;

    }

    public static int helper(ListNode head){

        if(head == null)return 1;

        head.val = head.val + helper(head.next);

        if(head.val>=10){
            head.val = 0;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(9);

        ListNode cur = addOneToTheNumber(head);

        while(cur!=null){
            System.out.print(cur.val + "---> ");
            cur = cur.next;
        }
        System.out.println();

    }
}
