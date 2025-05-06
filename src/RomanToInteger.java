import java.util.HashMap;

public class RomanToInteger {
    //
    // https://leetcode.com/problems/roman-to-integer/description/

    public static  int romanToInt(String s) {

        HashMap<Character,Integer> map  = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = s.length();
        int result = 0;
        for(int i = 0;i<n;i++){

            if(s.charAt(i)=='I' && i+1<n && s.charAt(i+1)=='V'){
                i++;
                result += 4;
            }

          else  if(s.charAt(i)=='I' && i+1<n && s.charAt(i+1)=='X'){
                i++;
                result += 9;
            }

            else     if(s.charAt(i)=='X' && i+1<n && s.charAt(i+1)=='L'){
                i++;
                result += 40;
            }


            else   if(s.charAt(i)=='X' && i+1<n && s.charAt(i+1)=='C'){
                i++;
                result += 90;
            }

            else   if(s.charAt(i)=='C' && i+1<n && s.charAt(i+1)=='D'){
                i++;
                result += 400;
            }

            else   if(s.charAt(i)=='C' && i+1<n && s.charAt(i+1)=='M'){
                i++;
                result += 900;
            }
            else {
                result += map.get(s.charAt(i));
            }

        }


return result;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}
