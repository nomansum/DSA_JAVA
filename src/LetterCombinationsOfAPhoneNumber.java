import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/


    public static List<String> letterCombinations(String digits) {
        HashMap<Character,String> mp = new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");

        List<String> combinations = new ArrayList<>();
       StringBuilder string = new StringBuilder();
        if(digits.length()==0){
            return combinations;
        }
       generateCombinatinos(mp,0,combinations,string,digits);
       return combinations;
    }


    public  static void generateCombinatinos(HashMap<Character,String> mp, int index ,List<String> list, StringBuilder string,String digits){

        if(index==digits.length()){
            list.add(string.toString());
            return;
        }

        for(int i = 0;i<mp.get(digits.charAt(index)).length();++i){
            string.append(mp.get(digits.charAt(index)).charAt(i));
            generateCombinatinos(mp,index+1,list,string,digits);
            string.deleteCharAt(string.length()-1);
        }
    }


    public static void main(String[] args) {
List<String> list = letterCombinations("");
     for(String s:list){
         System.out.println(s);
     }
        System.out.println();


    }


}
