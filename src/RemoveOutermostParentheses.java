public class RemoveOutermostParentheses {
    // https://leetcode.com/problems/remove-outermost-parentheses/description/
    public String removeOuterParentheses(String s) {

        if(s.length()==0){
            return "";
        }

        int parenthesesCount  = 0;
       StringBuilder ans = new StringBuilder();

       for(int i=0;i<s.length();++i){

           if(s.charAt(i)=='('){
               if(parenthesesCount>0){
                   ans.append(s.charAt(i));
               }
               parenthesesCount++;
           }
           else {
               parenthesesCount--;
               if(parenthesesCount>0){
                   ans.append(s.charAt(i));
               }
           }


       }
return ans.toString();


    }


    public static void main(String[] args) {

    }
}
