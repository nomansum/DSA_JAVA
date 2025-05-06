import java.util.List;

public class SinglyLinkedList {

    private ListNode head;
    private static  class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static void printSinglyLinkedList(SinglyLinkedList sll){
        ListNode current = sll.head;


        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

        System.out.println();

    }
public static int countLengthOfASinglyLinkedList(SinglyLinkedList sll){
        ListNode currentNode = sll.head;
        int totalLength = 0;
        while(currentNode!=null){
            totalLength++;
            currentNode = currentNode.next;
        }
        System.out.println("total Length "  +totalLength);
        return totalLength;
}

public  static void insertAtBeginningofASinglyLinkedList(SinglyLinkedList sll,int value){

        ListNode newNode = new ListNode(value);
        newNode.next = sll.head;
        sll.head = newNode;
}

public static void insertNodeAtTheEndOfSinglyLinkedList(SinglyLinkedList sll,int value){
        ListNode newNode = new ListNode(value);
        if(sll.head == null){
            sll.head = newNode;
            return;
        }
        ListNode currentNode = sll.head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
}

public static void insertNodeAtASpecificPositionInSinglyLinkedList(SinglyLinkedList sll,int value,int position){

        ListNode newNode  = new ListNode(value);

if(position==1){
    newNode.next = sll.head;
    sll.head  = newNode;
}

else{
    ListNode previous = sll.head;
    int count = 1;
    while(previous.next!=null && count<position-1){
        previous = previous.next;
        count++;
    }
    newNode.next = previous.next;
    previous.next = newNode;

}

}

public  static void deleteFirstNodeOfASinglyLinkedList(SinglyLinkedList sll){
if(sll.head==null || sll.head.next == null ){
    sll.head = null;
}
else {
    ListNode nextToHead = sll.head.next;
    ListNode nodeToBeDeleted = sll.head;
    sll.head = nextToHead;
    nodeToBeDeleted = null;
}
}

public static void deleteLastNodeOfASinglyLinkedList(SinglyLinkedList sll){
        if(sll.head == null || sll.head.next ==null){
            sll.head = null;
        }
else{

    ListNode currentNode = sll.head;
    while(currentNode.next.next!=null){
        currentNode = currentNode.next;

    }

    ListNode nodeToBeDeleted = currentNode.next;
    currentNode.next = null;
    nodeToBeDeleted = null;


        }


}

public static void deleteNodeOfASinglyLinkedListAtSpecificPosition(SinglyLinkedList sll,int position){

        if(position == 1){
            sll.head = sll.head.next;
        }
        else{
            ListNode previousNode = sll.head;
            int count  =1;

            while(previousNode.next!= null && count<position-1){
                count++;
                previousNode = previousNode.next;
            }
            if(previousNode.next != null){
                previousNode.next = previousNode.next.next;
            }

        }



}

public static boolean searchAnElementInASinglyLinkedList(SinglyLinkedList sll,int element){
        ListNode current = sll.head;
        while(current!=null){
            if(current.data == element){
                return true;
            }
            current = current.next;
        }
        return false;
}

public static void reverseSinglyLinkedList(SinglyLinkedList sll){

        ListNode current = sll.head;
        ListNode previous = null;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current  = next;

        }

sll.head = previous;


}

public static ListNode findNthNodeFromTheEndOfTheList(SinglyLinkedList sll,int nthFromTheEnd){


        ListNode mainPointer = sll.head;
        ListNode referencePointer = sll.head;

        if(sll.head == null){
            return null;
        }
        if(nthFromTheEnd<=0){
            throw new IllegalArgumentException("Invalid value : n = " + nthFromTheEnd);
        }

         int count = 0;
         while(count<nthFromTheEnd){
             if(referencePointer == null){
                 return null;
//                 throw new IllegalArgumentException("Out of range: not enough element in your sll");
             }
              count++;

              referencePointer= referencePointer.next;
         }

         while(referencePointer!=null){
             referencePointer = referencePointer.next;
             mainPointer = mainPointer.next;
         }
         return mainPointer;

}

public static void removeDuplicatesFromSortedSinglyLinkedList(SinglyLinkedList sll){

ListNode current = sll.head;

if(sll.head==null){
    return ;
}

while(current!=null && current.next!=null){
    if(current.data == current.next.data){
        current.next = current.next.next;
    }
    else{
        current = current.next;
    }
}
}

public static void insertElementIntoSortedSinglyLinkedList(SinglyLinkedList sll,int element){

        ListNode current = sll.head;
        ListNode previous = null;
    ListNode node = new ListNode(element);

    while(current!=null && current.data < element){
            previous = current;
            current = current.next;
        }

        // need to handle 1st corner case ... while inserting the smallest element
        // into the singly linked list

    if(previous == null){
         node.next = sll.head;
         sll.head = node;
         return;
    }
        node.next = previous.next;
        previous.next = node;


}

public static void removeAnElementFromSinglyLinkedList(SinglyLinkedList sll, int element){

    ListNode current = sll.head;

    ListNode previous = null;

    if(sll.head == null){
        return;
    }

    while(current!=null && current.data!=element){
        previous = current;
        current = current.next;
    }

    if(previous == null  && sll.head.data == element){
        sll.head=sll.head.next;
        return;
    }
    previous.next = current.next;

}

public static boolean doesSinglyLinkedListContainLoop(SinglyLinkedList sll){
        ListNode harePointer = sll.head;
        ListNode tortoisePointer = sll.head;

        while (harePointer!=null && harePointer.next!=null){
            harePointer = harePointer.next.next;
            tortoisePointer = tortoisePointer.next;
            if(harePointer == tortoisePointer){
                return true;
            }
        }


        return false;
}

public  static ListNode findStartingPointOfLoopOfSinglyLinkedList(SinglyLinkedList sll){
    ListNode harePointer = sll.head;
    ListNode tortoisePointer = sll.head;

    while (harePointer!=null && harePointer.next!=null){
        harePointer = harePointer.next.next;
        tortoisePointer = tortoisePointer.next;
        if(harePointer == tortoisePointer){
            return getStartingPointOfLoopInASinglyLinkedList(sll,tortoisePointer);
        }
    }


    return null;
}

public static ListNode getStartingPointOfLoopInASinglyLinkedList(SinglyLinkedList sll,ListNode tortoisePointer){
        ListNode assumedStartingNode = sll.head;
        while(assumedStartingNode != tortoisePointer){
            tortoisePointer = tortoisePointer.next;
            assumedStartingNode = assumedStartingNode.next;
        }
        return assumedStartingNode;
}

public  static  boolean removeLoopFromSinglyLinkedList(SinglyLinkedList sll){
    ListNode harePointer = sll.head;
    ListNode tortoisePointer = sll.head;

    while (harePointer!=null && harePointer.next!=null){
        harePointer = harePointer.next.next;
        tortoisePointer = tortoisePointer.next;
        if(harePointer == tortoisePointer){
            return removeLoop(sll,tortoisePointer);
        }
    }


    return false;
}
public  static  boolean removeLoop(SinglyLinkedList sll,ListNode tortoisePointer){
    ListNode assumedStartingNode = sll.head;
    while(assumedStartingNode.next != tortoisePointer.next){
        tortoisePointer = tortoisePointer.next;
        assumedStartingNode = assumedStartingNode.next;
    }
    tortoisePointer.next = null;
    return true;
}

public static SinglyLinkedList mergeTwoSortedSinglyLinkedList(SinglyLinkedList sll1,SinglyLinkedList sll2){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head  = new ListNode(0);
         ListNode current = sll.head;
         ListNode a = sll1.head;
         ListNode b = sll2.head;
         while(a!=null && b!=null){
             if(a.data<=b.data){
                 current.next = a;
                 a= a.next;
             }
             else{
                 current.next = b;
                 b = b.next;
             }
             current = current.next;
         }
         if(a==null){
             current.next = b;
         }
         else{
             current.next = a;
         }
         sll.head = sll.head.next;


        return sll;
}


public static SinglyLinkedList addTwoNumbersEachNodeContainingSingleDigitInSinglyLinkedList(SinglyLinkedList sll1,SinglyLinkedList sll2){
        SinglyLinkedList sll = new SinglyLinkedList();
      ListNode a = sll1.head;
      ListNode b = sll2.head;
      int carry = 0;
      ListNode newSumNode = new ListNode(0);
      sll.head = newSumNode;
      while(a!=null || b!=null){
          int x = (a!=null)?a.data:0;
          int y = (b!=null)?b.data:0;
          int sum = carry + x + y;
          carry = sum/10;
          newSumNode.next = new ListNode(sum%10);
          newSumNode = newSumNode.next;
          if(a!=null){
              a = a.next;
          }
          if(b!=null) {
              b = b.next;
          }
      }
      if(carry>0){
          newSumNode.next = new ListNode(carry);
      }
sll.head = sll.head.next;
        return sll;
}






public  static void main(String[] args) {

    SinglyLinkedList sll = new SinglyLinkedList();

    sll.head = new ListNode(6);

    printSinglyLinkedList(sll);
    SinglyLinkedList sll2 = new SinglyLinkedList();
    sll2.head = new ListNode(5);

    printSinglyLinkedList(sll2);

    sll = addTwoNumbersEachNodeContainingSingleDigitInSinglyLinkedList(sll, sll2);

    printSinglyLinkedList(sll);


}
}
