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
        return null;
}
public String remove(Integer key){
        return null;
}

public int getBucketIndex(Integer key){
        return key % this.buckets.length;
}

    public static void main(String[] args) {

    }
}
