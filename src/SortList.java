public class SortList {

    // https://leetcode.com/problems/sort-list/description/

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public static ListNode sortList(ListNode head) {
          return sortUsingMergeSortTechnique(head);
    }

    public static ListNode sortUsingMergeSortTechnique(ListNode head){

        if(head==null || head.next == null){
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        left = sortUsingMergeSortTechnique(left);
        right = sortUsingMergeSortTechnique(right);
        return mergeList(left,right);


    }

    public static ListNode findMiddle(ListNode head){

        ListNode harePointer = head.next;

        ListNode tortoisePointer = head;

        while(harePointer!=null && harePointer.next!=null){
            harePointer = harePointer.next.next;
            tortoisePointer = tortoisePointer.next;
        }

        return tortoisePointer;

    }

    public static ListNode mergeList(ListNode left, ListNode right){

        ListNode dummyNode = new ListNode(1);
        ListNode sortedPointer = dummyNode;

        while(left!=null && right!=null){
            if(left.val<right.val){
                sortedPointer.next = left;
                sortedPointer = sortedPointer.next;
                left = left.next;
            }
            else {
                sortedPointer.next = right;
                sortedPointer = sortedPointer.next;
                right = right.next;
            }

        }

        if(left!=null){
            sortedPointer.next = left;
        }
        else {
            sortedPointer.next = right;
        }

    return dummyNode.next;


    }


    public static void main(String[] args) {
        ListNode head = new ListNode(100);
        head.next = new ListNode(27);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(49);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

     ListNode cur = sortList(head);
        while(cur!=null){
            System.out.print(cur.val+ "-->");
            cur  = cur.next;
        }
        System.out.println();



    }



}
