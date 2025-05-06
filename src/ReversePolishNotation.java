public class ReversePolishNotation {



    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for(String val:tokens){


            if(val.equals("+")){

                st.push((st.pop()+st.pop()));

            }
            else if(val.equals("-")){
                int second = st.pop();
                int first = st.pop();
                st.push(first-second);
            }
            else if(val.equals("*")){
                st.push(st.pop()*st.pop());
            }
            else if(val.equals("/")){
                int second = st.pop();
                int first = st.pop();
                st.push(first/second);
            }
            else {
                st.push(Integer.parseInt(val));
            }





        }

        return st.peek();
    }








}
