public class Add2NumbersInLL {

    // https://leetcode.com/problems/add-two-numbers/

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(-1);

        ListNode currentNode  = dummyNode;
          int carry = 0;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            ListNode tempNode = new ListNode(sum%10);
            currentNode.next = tempNode;
            currentNode = currentNode.next;


        }

        if(carry==1){
            currentNode.next = new ListNode(1);
        }

        return dummyNode.next;


    }

    public static void main(String[] args) {

    }


}
