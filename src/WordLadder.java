import java.util.*;

public class WordLadder {






    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


        Map<String,List<String>> adjList = new HashMap<>();

        wordList.add(beginWord);

        for(String word:wordList){
            StringBuilder string = null;
            for(int i=0;i<word.length();++i){
                string = new StringBuilder(word);
                string.setCharAt(i,'*');
                List<String> wordlist = adjList.getOrDefault(string.toString(),new ArrayList<String>());
                 wordlist.add(word);
                 adjList.put(string.toString(),wordlist);
            }
        }

Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;
        StringBuilder string = null;
        while (!queue.isEmpty()){
            step++;
            int size  = queue.size();
            for(int j=0;j<size;++j){
                String str = queue.poll();
                for(int i=0;i<str.length();++i){
                    string = new StringBuilder(str);
                    string.setCharAt(i,'*');
                    for(String pat:adjList.get(string.toString())){
                        if(pat.equals(endWord))return step;
                        if(visited.contains(pat))continue;
                        queue.offer(pat);
                        visited.add(pat);
                    }
                }
            }
        }
return 0;
    }


}
