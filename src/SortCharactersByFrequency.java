import java.util.Arrays;

public class SortCharactersByFrequency {
    // https://leetcode.com/problems/sort-characters-by-frequency/description/
    public static String frequencySort(String s) {

        int[][] characters = new int[80][2];
        StringBuilder result = new StringBuilder();
        for(int i=0;i<80;++i){
            characters[i][0] = i + 48;
        }
        int n = s.length();
        for(int i=0;i<n;++i){
            characters[s.charAt(i)-48][1]++;
        }
        Arrays.sort(characters,(a,b)->Integer.compare(b[1],a[1]));

        for(int i=0,j=0;i<n;++i){
            result.append((char)characters[j][0]);
            characters[j][1]--;
            if(characters[j][1]==0)j++;
        }


        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
