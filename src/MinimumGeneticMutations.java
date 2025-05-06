import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumGeneticMutations {



 class Pair{
     String first;
     int second;
     Pair(String first,int second){
         this.first = first;
         this.second = second;
     }
 }


    public int minMutation(String startGene, String endGene, String[] bank) {

        HashSet<String> hashes  = new HashSet<>();
        for(String val:bank) hashes.add(val);

        if(!hashes.contains(endGene)) return -1;

        Queue<Pair> queue = new LinkedList<>();

     queue.add(new Pair(startGene,0));

     while (!queue.isEmpty()){

         String s = queue.peek().first;
         int steps = queue.peek().second;
         queue.poll();
         if(s.equals(endGene)==true)return steps;

         char[] arr = {'A','G','T','C'};
         for(int i=0;i<s.length();++i){
             for(int j=0;j<4;++j){
                 char[] replacedArr = s.toCharArray();
                 replacedArr[i] = arr[j];
                 String replacedString = new String(replacedArr);
                 if(hashes.contains(replacedString)){
                     queue.add(new Pair(replacedString,steps+1));
                     hashes.remove(replacedString);
                 }
             }

         }

     }

     return -1;

    }








}
