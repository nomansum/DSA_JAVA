import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement2 {


    public static List<Integer> majorityElement(int[] nums) {
              List<Integer> majorityElements = new ArrayList<>();
              int element1 =Integer.MIN_VALUE;
              int element2 = Integer.MIN_VALUE ;
              int requiredMinOccurrence = nums.length/3;
              int count1 = 0;
              int count2 = 0;
              for(int val:nums){
                  if(count1==0 && element2 != val){
                      count1 = 1;
                      element1 = val;
                  }
                  else if(count2==0 && element1 !=val){
                      count2 = 1;
                      element2 = val;
                  }
                  else if(val == element1){
                      count1++;
                  }
                  else if(val == element2 ){
                      count2++;
                  }
                  else {
                      count1--;
                      count2--;
                  }
              }
              count2 = count1 = 0;
              for(int val : nums){
                  if(val == element1) count1++;
                  if(val==element2)count2++;
              }
              if(count1>requiredMinOccurrence)majorityElements.add(element1);
              if(count2>requiredMinOccurrence)majorityElements.add(element2);

        Collections.sort(majorityElements);

              return majorityElements;
    }








    public static void main(String[] args) {
        int[] arr = {-1,-1};

             List<Integer> list =    majorityElement(arr);

             for(Integer val : list){
                 System.out.print(val + " ");
             }
        System.out.println();

    }
}
