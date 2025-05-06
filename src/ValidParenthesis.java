import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses
public class ValidParenthesis {


    public boolean isValid(String s) {
        char[] brackets  = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char ch: brackets){

            if(ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }

           else if(!stack.isEmpty()){
                 char top = stack.peek();
                 if((top=='[' && ch==']') || (top=='{' && ch=='}') || (top=='(' && ch==')')  ){
                     stack.pop();
                 }
                 else {
                     return false;
                 }
            }
           else {
               return false;
            }


        }

return stack.isEmpty();
    }




public static boolean validParenthesis(String str){
    char[] brackerts = str.toCharArray();
    Stack<Character> stack = new Stack<>();

    for(char ch:brackerts){
        if(ch=='(' || ch=='{'||ch=='['){
            stack.push(ch);
        }
        else {
            if(stack.isEmpty()){
                return false;
            }
            else {
                char top = stack.peek();
                if((ch == ')' && top=='(')||(ch == '}' && top=='{')||(ch == ']' && top=='[')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
    }
    return stack.isEmpty();

}




    public  static  void main(String[] args){
        System.out.println(validParenthesis("()(()){[()}]}"));
 System.out.println(new ValidParenthesis().isValid("()(()){[()}]}"));

    }
}
