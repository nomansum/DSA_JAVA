public class RansomNote {


    // https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] track = new int[26];

        for(int i=0;i<magazine.length();++i){
            track[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<ransomNote.length();++i){
            if(--track[ransomNote.charAt(i)-'a']<0)
                return false;
        }

        return true;

    }




}
