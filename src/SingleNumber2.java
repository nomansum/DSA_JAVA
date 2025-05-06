import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {



    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int bitIndex = 0;bitIndex<32;++bitIndex){

            int cnt = 0;

            for(int val:nums){
                if(( (val>>bitIndex) &1)==1)cnt++;
            }

            if(cnt%3!=0) ans = ans|(1<<bitIndex);

        }


return ans;

    }







}
