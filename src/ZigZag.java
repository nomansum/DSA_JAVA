public class ZigZag {

    // https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150
    public String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();
          if(numRows==1) return s;

        for(int r=0;r<numRows;++r){

            int increment = (numRows-1) * 2;

            for(int i=r;i<s.length();i+=increment){
                sb.append(s.charAt(i));
                if(r>0 && r<(numRows-1) && (i+increment-r-r)<s.length() ){
                    sb.append(s.charAt(i+increment-r-r));
                }
            }


        }

return sb.toString();



    }



}
