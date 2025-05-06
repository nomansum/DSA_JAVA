public class MaximumXOROFTWONUMBERS {
    class Node {
        Node[] freq = new Node[2];
        boolean flag = false;

        public boolean contains(int idx) {
            return freq[idx] != null;
        }

        public void put(int idx, Node newN) {
            freq[idx] = newN;
        }

        public Node get(int idx) {
            return freq[idx];
        }
    }

    class Trie {
        Node head;

        public Trie() {
            head = new Node();
        }

        public void insert(int num) {
            Node cpy = head;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (!cpy.contains(bit)) {
                    cpy.put(bit, new Node());
                }

                cpy = cpy.get(bit);
            }
        }

        public int getMax(int num){
            Node cpy = head;
            int maxNum=0;
            for(int i=31; i>=0; i--){
                int bit = (num>>i)&1;
                if(cpy.contains(1-bit)){ // if conatins opposite bit
                    maxNum |= (1<<i);
                    cpy = cpy.get(1-bit);
                }else{ // don't contains the opposite bit
                    cpy = cpy.get(bit);
                }
            }
            return maxNum;
        }
    }

    class Solution {
        public int findMaximumXOR(int[] nums) {
            Trie head = new Trie();
            for(int i=0; i<nums.length; i++){
                head.insert(nums[i]);
            }

            int xor=0;
            for(int num:nums){
                xor = Math.max(xor, head.getMax(num));
            }
            return xor;
        }
    }
}
