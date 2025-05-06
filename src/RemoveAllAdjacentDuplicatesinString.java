public class RemoveAllAdjacentDuplicatesinString {



    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();++i){

            if(st.isEmpty()==false && st.peek()==s.charAt(i)){
                st.pop();

            }

            else st.push(s.charAt(i));

        }

  while (st.isEmpty()==false){
      sb.append(st.pop());
  }

return sb.reverse().toString();


    }







}
