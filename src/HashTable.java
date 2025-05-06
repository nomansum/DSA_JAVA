import java.util.HashSet;
import java.util.Set;

public class HashTable {

    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public  HashTable(int capacity){
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
    }

    private class HashNode{
        private Integer key; // can be generic
        private String value; // can be generic
        private HashNode next;
        public HashNode(Integer key , String value){
            this.key = key;
            this.value = value;
        }
    }
public int size(){
        return size;
}
public boolean isEmpty(){
        return size==0;
}
public void put (Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("Key or value is null!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head  = head.next;
        }
           size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key,value);
        node.next = head;
        buckets[bucketIndex] = node;

}
public String get(Integer key){

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }

        return null;
}
public String remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while(head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){return null;}
         this.size--;
        if(previous!=null){
            previous.next = head.next;
        }
        else {
            buckets[bucketIndex] = head.next;
        }
        return head.value;
}

private int getBucketIndex(Integer key){
        return key % this.buckets.length;
}

public static boolean containesDuplicate(int[] nums){
        Set<Integer> set  = new HashSet<>();
        for(int val:nums){
            if(set.contains(val)){
                return true;
            }
            set.add(val);
        }
        return false;
}


    public static void main(String[] args) {

        HashTable table = new HashTable(10);
        table.put(102,"sun");
        table.put(21,"df");
        table.put(221,"d,kf");

        table.put(1022,"sun");
        table.put(2112,"df");
        table.put(2212,"d,kf");
        table.put(102233,"sun");
        table.put(2112,"df");
        table.put(2219,"d,kf");

        System.out.println(table.size());
        System.out.println(table.remove(2212));
        System.out.println(table.size());
        System.out.println(table.remove(102));
        System.out.println(table.remove(102));
        System.out.println(table.size());
        System.out.println(table.remove(155));

    }
}
