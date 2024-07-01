import java.util.Stack;

public class ReverseWordsInAString {
    // https://leetcode.com/problems/reverse-words-in-a-string/
    public String reverseWordsMostEfficient(String s) {

      //  if(s == null) return null;
      char[] words = s.toCharArray();
      int n = words.length;

      reverse(words,0,n-1);
      reverseWords(words,n);
      return cleanSpaces(words,n);

    }


    public void reverseWords(char[] s,int n){
        int i=0,j=0;
        while(i<n){
            while(i<j || i<n && s[i]==' ')i++;
            while(j<i || j<n && s[j]!=' ')j++;
            reverse(s,i,j-1);
        }
    }
    String cleanSpaces(char[] a,int n){
        int i =0;
        int j = 0;
        while(j<n){
            while(j<n && a[j]==' ')j++;
            while(j<n && a[j]!=' ')a[i++] = a[j++];
            while(j<n && a[j]==' ')j++;
            if(j<n)a[i++] = ' ';
        }
        return new String(a).substring(0,i);
    }

    public void reverse(char[] s,int i,int j){
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = s[i];
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {

     String[] words = s.trim().split("\\s+");
     Stack<String> stack = new Stack();

     for(String word:words){
         stack.push(word);
     }
     StringBuilder result = new StringBuilder();
     while(!stack.empty()){
         result.append(stack.peek());
         stack.pop();
         if(stack.empty())break;
         else {
             result.append(" ");
         }

     }
return  result.toString();
    }



    public static void main(String[] args) {
        
    }
}
