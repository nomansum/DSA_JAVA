public class SimplifyPath {




    public String simplifyPath(String path) {

        String[] components = path.split("/");

        Stack<String> st = new Stack<>();

        for(String val:components){

            if(val.equals("")||val.equals("."))continue;

            if(val.equals("..")){
                if(st.isEmpty()==false){
                    st.pop();
                }
            }
            else {
                st.push(Integer.parseInt(val));
            }

        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.insert(0,"/"+st.pop());

        }
        return sb.length()==0?"/":sb.toString();




    }










}
