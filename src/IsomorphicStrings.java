import java.util.HashMap;

public class IsomorphicStrings {

    // https://leetcode.com/problems/isomorphic-strings/description/
    public static boolean isIsomorphicUsingMap(String s, String t) {

        int n = s.length();
        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0;i<n;++i){


            if(map.containsKey(s.charAt(i)) == false){
                if(map.containsValue(t.charAt(i))==false){
                    map.put(s.charAt(i),t.charAt(i));
                }
                else {
                    return false;
                }
            }
            else {
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }



        }


return true;

    }


    public static boolean isIsomorphic(String s, String t) {

        int n = s.length();
int[] sIndex  = new int[300];
int[] tIndex  = new int[300];

        for(int i=0;i<n;++i){

      if(sIndex[s.charAt(i)] != tIndex[t.charAt(i)]){
          return false;
      }
   sIndex[s.charAt(i)] = i+1;
      tIndex[t.charAt(i)] = i+1;

        }


        return true;

    }


    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }

}
