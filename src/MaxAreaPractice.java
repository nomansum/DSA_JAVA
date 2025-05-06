import java.util.*;

public class MaxAreaPractice {



    public int maxArea(int[] height) {

        int maxAreaVal = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){

            maxAreaVal = Math.max(maxAreaVal, (right-left) * Math.min(height[left],height[right]) );

            if(height[left]<height[right]) left++;
            else right--;




        }


        return maxAreaVal;
    }

    public List<List<Integer>> triplet(int[] arr){
 int n = arr.length;
  Set<List<Integer>> st = new HashSet<>();


  for(int i=0;i<n;++i){
      Set<Integer> set = new HashSet<>();
      for(int j=i+1;j<n;++j){
          int third = -(arr[i]+arr[j]);

          if(set.contains(third)){
              List<Integer> temp  = new ArrayList<>(Arrays.asList(arr[i],arr[j],third));
              temp.sort(null);
              st.add(temp);

          }
          set.add(arr[j]);

      }
  }
List<List<Integer>> ans = new ArrayList<>(st);
  return ans;

    }




}
