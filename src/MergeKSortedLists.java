import  java.util.*;
public class MergeKSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        // Default constructor
        public ListNode() {}

        // Constructor with a value
        public ListNode(int val) {
            this.val = val;
        }

        // Constructor with a value and a reference to the next node
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }
        else{
            l2.next = merge(l1,l2.next);
            return l2;
        }
}

public ListNode divide(ListNode[] lists,int left , int right){
        if(left==right) return lists[left];
        int mid = (left+right)/2;
        ListNode l1 = divide(lists,left,mid);
        ListNode l2  = divide(lists,mid+1,right);
        return merge(l1,l2);
}

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
return divide(lists,0,lists.length-1);

    }



}
