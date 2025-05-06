import java.util.HashMap;

public class JewelsAndStones {




    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Character,Boolean> map = new HashMap<>();

        for(int i=0;i<jewels.length();++i){
            map.put(jewels.charAt(i),true);
        }
        int result = 0;
        for(int i=0;i<stones.length();++i){
            if(map.get(stones.charAt(i))!=null)result++;
        }
        return result;

    }





}
