import java.util.Stack;

public class RemoveKDigits {
    // https://leetcode.com/problems/remove-k-digits/description/
    public static String removeKdigits(String num, int k) {

        StringBuilder str = new StringBuilder(num);
        Stack<Character> stack  = new Stack<>();
        for(int i=0;i<str.length();++i){

            while(!stack.isEmpty() && k>0 && ((stack.peek()-'0')>(str.charAt(i)-'0'))){
                stack.pop();
                k--;
            }

            stack.push(str.charAt(i));
        }
         while (k>0){
             k--;
             stack.pop();
         }
         StringBuilder ans = new StringBuilder();
         if(stack.isEmpty())return "0";
         while(!stack.isEmpty()){
             ans.append(stack.peek());
             stack.pop();
         }
         while(!ans.isEmpty() && ans.charAt(ans.length()-1)=='0'){
             ans.deleteCharAt(ans.length()-1);
         }
         ans.reverse();

         if(ans.isEmpty())return "0";
         return ans.toString();

    }


    public static void main(String[] args) {
        System.out.println(removeKdigits("10",1));
    }
}
