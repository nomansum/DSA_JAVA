

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private  ListNode previous;
        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public  DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    public void insertLastInDoublyLinkedList(int data){
        ListNode newNode =  new ListNode(data);
        if(this.head == null){
            this.head = this.tail =newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = tail.next;
   this.length++;

    }

    public boolean isEmpty(){
        return this.length == 0;
    }
    public int length(){
        return this.length;
    }


    public void printElementsOfDoublyLinkedListInForwardDirection(){
        ListNode current = this.head;
        while(current !=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printElementsOfDoublyLinkedListInBackwardDirection(){
        ListNode current = this.tail;
        while(current !=null){
            System.out.print(current.data + "->");
            current = current.previous;
        }
        System.out.println("null");
    }

    public void insertElementAtTheBeginningOfADoublyLinkedList(int data){
      ListNode newNode = new ListNode(data);
        if(isEmpty()){
             this.tail = newNode;
             this.head = newNode;

        }
        else {
            head.previous = newNode;
            newNode.next = head;
            head = head.previous;
        }

        this.length++;

    }

    public void deleteFirstNodeInADoublyLinkedList(){
        if(isEmpty()){
            return;
        }
      ListNode current = head;

        if(tail == head){
            tail = null;
        }
        else {
            head.next.previous = null;
        }

        head = head.next;

        this.length--;
    }
public void deleteLastNodeInADoublyLinkedList(){

        if(isEmpty()){
            return;
        }
        ListNode currentTailNode = tail;
        if(tail == head){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        currentTailNode.previous = null;

      this.length--;

}


    public static void main(String[] args){

         DoublyLinkedList dll = new DoublyLinkedList();

         dll.insertElementAtTheBeginningOfADoublyLinkedList(123);
         dll.insertLastInDoublyLinkedList(500);
         dll.insertElementAtTheBeginningOfADoublyLinkedList(1000);
     dll.insertElementAtTheBeginningOfADoublyLinkedList(9999);
     dll.printElementsOfDoublyLinkedListInForwardDirection();
     dll.deleteLastNodeInADoublyLinkedList();
     dll.printElementsOfDoublyLinkedListInForwardDirection();
     dll.deleteLastNodeInADoublyLinkedList();
     dll.printElementsOfDoublyLinkedListInForwardDirection();
     dll.deleteLastNodeInADoublyLinkedList();
     dll.printElementsOfDoublyLinkedListInForwardDirection();

//     dll.printElementsOfDoublyLinkedListInForwardDirection();
//     dll.printElementsOfDoublyLinkedListInBackwardDirection();
dll.deleteLastNodeInADoublyLinkedList();
dll.printElementsOfDoublyLinkedListInBackwardDirection();
dll.insertElementAtTheBeginningOfADoublyLinkedList(1);
dll.printElementsOfDoublyLinkedListInBackwardDirection();
dll.deleteLastNodeInADoublyLinkedList();
dll.printElementsOfDoublyLinkedListInBackwardDirection();

    }


}
