import java.lang.reflect.Array;
import java.util.*;
public class GroupAnagrams {





    public List<List<String>> groupAnagrams(String[] strs) {

         HashMap<ArrayList<Integer>,ArrayList<String>> map = new HashMap<>();

         for(String val:strs){

             ArrayList<Integer> mappings= new ArrayList<>();
             for(int i=0;i<26;++i){
                 mappings.add(0);
             }

             for(int i=0;i<val.length();++i){
                 int index = val.charAt(i)-'a';
                 mappings.set(index,mappings.get(index)+1);
             }
             if(map.containsKey(mappings)) map.get(mappings).add(val);
             else {
                 ArrayList<String> tmp = new ArrayList<>();
                 tmp.add(val);
                 map.put(mappings,tmp);
             }

         }

         List<List<String>> result = new ArrayList<>();
        int index = 0;
        for( Map.Entry<ArrayList<Integer>,ArrayList<String>> entry:map.entrySet()){
            result.add(new ArrayList<>());
            for(String val:entry.getValue()){
                result.get(index).add(val);
            }
            ++index;



        }
return result;
    }






}
