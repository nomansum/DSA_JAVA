import java.util.Arrays;

public class AssignCookies {


    // https://leetcode.com/problems/assign-cookies/description/


    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i =0;
        int j = 0;
        while(j<s.length && i<g.length){

            if(g[i]<=s[j]){
                i++;
                j++;
                result++;
            }
            else {
                j++;
            }



        }
return result;

    }

    public static void main(String[] args) {
        int[] g= {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }


}
