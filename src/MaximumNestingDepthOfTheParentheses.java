public class MaximumNestingDepthOfTheParentheses {
    // https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
    public static int maxDepth(String s) {

        char openParentheses = '(';
        char closeParentheses = ')';
        int depth = 0;
        int count = 0;
        int n= s.length();
        for(int i =0;i<n;++i){

            if(s.charAt(i)==openParentheses){
                count++;
                depth = Math.max(depth,count);
            }
            else if(s.charAt(i)==closeParentheses){
                count--;
            }

        }

return depth;


    }


    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
