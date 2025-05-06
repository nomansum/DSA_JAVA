public class AdTrie {



    static class Node {

        Node[] links;

        int cntEndWith;

        int cntPrefix;

        Node() {
            links = new Node[26];
            cntEndWith = 0;
            cntPrefix = 0;
        }


        boolean containsKey(char ch) {

            return links[ch - 'a'] != null;
        }


        Node get(char ch) {

            return links[ch - 'a'];
        }

        void put(char ch, Node node) {

            links[ch - 'a'] = node;
        }


        void increaseEnd() {
            cntEndWith++;
        }


        void increasePrefix() {
            cntPrefix++;
        }


        void deleteEnd() {
            // Decrement the counter
            cntEndWith--;
        }


        void reducePrefix() {
            cntPrefix--;
        }
    }

    private Node root;

    AdTrie() {

        root = new Node();
    }

    void insert(String word) {
        Node node = root;

        for (int i = 0; i < word.length(); i++) {

            if (!node.containsKey(word.charAt(i))) {

                node.put(word.charAt(i), new Node());
            }

            node = node.get(word.charAt(i));

            node.increasePrefix();
        }

        node.increaseEnd();
    }

    int countWordsEqualTo(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.containsKey(word.charAt(i))) {

                node = node.get(word.charAt(i));
            } else {

                return 0;
            }
        }

        return node.cntEndWith;
    }

    int countWordsStartingWith(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.containsKey(word.charAt(i))) {

                node = node.get(word.charAt(i));
            } else {

                return 0;
            }
        }

        return node.cntPrefix;
    }


    void erase(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {

            if (node.containsKey(word.charAt(i))) {

                node = node.get(word.charAt(i));

                node.reducePrefix();
            } else {

                return;
            }
        }

        node.deleteEnd();
    }
}

