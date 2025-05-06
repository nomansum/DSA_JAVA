import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {







    public List<String> summaryRanges(int[] nums) {

        Integer possibleStart = -1;

      List<String> result = new ArrayList<>();
       if(nums.length==0) return result;
      possibleStart = nums[0];

      for(int i=1;i<=nums.length;++i){

          if(i==nums.length|| nums[i]-nums[i-1]!=1){

              if(possibleStart==nums[i-1]){
                  result.add(possibleStart.toString());
              }
              else {
                  result.add(possibleStart.toString()+"->"+nums[i-1]);
              }

              if(i<nums.length) possibleStart = nums[i];
          }



      }



return result;

    }










}
