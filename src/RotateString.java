public class RotateString {

    // https://leetcode.com/problems/rotate-string/description/



    public boolean rotateString(String s, String goal){
        if(s.length()!=goal.length())return false;
        int firstCharIndexInGoal = -1;
        for(int i=0;i<goal.length();++i){
            if(s.charAt(0) == goal.charAt(i)){
                firstCharIndexInGoal = i;
                char[] ch = goal.toCharArray();
                if(isAMatch(ch,s,goal,firstCharIndexInGoal)){
                    return true;
                }
            }
        }

        return false;

    }
    public boolean isAMatch(char[] ch,String s,String goal, int index){
         reverse(ch,0,index-1);
         reverse(ch,index,goal.length()-1);
         reverse(ch,0,goal.length()-1);
         String goalString = new String(ch);
         return s.equals(goalString);
    }


    public void reverse(char[] ch,int i , int j){
        while(i<j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
    }





    public static void main(String[] args) {

    }
}
