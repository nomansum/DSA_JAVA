public class HowManyNumbersAreSmallerThanTheCurrentNumber {


    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] bucket = new int[150];

        for(int val:nums) bucket[val]++;

        for(int i=0;i<150;++i)bucket[i]+=bucket[i-1];

        for(int i=0;i<nums.length;++i){
            int pos = nums[i];
            nums[i] = pos==0?0:bucket[pos-1];
        }

return nums;
    }



}
