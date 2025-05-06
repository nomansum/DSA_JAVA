import java.util.*;
public class BackspaceStringCompare {




    public boolean backspaceCompare(String str1, String str2) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != '#') {
                stack1.push(ch);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch != '#') {
                stack2.push(ch);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        if (stack1.length() != stack2.length()) {
            return false;
        }

        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        return true;
    }




}
