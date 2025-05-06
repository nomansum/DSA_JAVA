import java.util.ArrayList;
import java.util.HashMap;

public class WordPattern {





    // https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
    public boolean wordPattern(String pattern, String s) {


        char[] a  =pattern.toCharArray();
        String[] b = s.split(" ");

        if(a.length != b.length) return false;

        HashMap<Character,String> map = new HashMap<>();

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0;i<a.length;++i){
            if(!map.containsKey(a[i])){
                map.put(a[i],b[i]);
                if(!arr.contains(b[i])){
                    arr.add(b[i]);
                }
                else return false;
            }
            else {
                if(!(b[i].equals(map.get(a[i])))){
                    return false;
                }
            }
        }
        return true;


    }






}
