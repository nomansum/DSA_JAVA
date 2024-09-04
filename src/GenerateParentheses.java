import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    // https://leetcode.com/problems/generate-parentheses/description/
    public static List<String> generateParenthesis(int n) {

        List<String> parentheses = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        recurseAndGenerate(parentheses,0,0,"",n);

return parentheses;
    }



    public static void recurseAndGenerate(List<String> list,int openParCount,int closeParCount,String s,int n){

     if(s.length() == (2*n)){
        list.add(s);
        return ;
     }


     if(openParCount<n){
         recurseAndGenerate(list,openParCount+1,closeParCount,s+"(",n);
     }
     if(closeParCount<openParCount){
         recurseAndGenerate(list,openParCount,closeParCount+1,s+")",n);
     }



    }


    public static void main(String[] args) {


        List<String> strings = generateParenthesis(4);

        for(String s:strings){
            System.out.println(s);
        }


    }
}
