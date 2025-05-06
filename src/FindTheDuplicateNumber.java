public class FindTheDuplicateNumber {




    public int findDuplicate(int[] nums) {

       int tortoisePointer = nums[0];
       int harePointer = nums[0];

       while(true){

           tortoisePointer = nums[tortoisePointer];
           harePointer = nums[nums[harePointer]];

           if(tortoisePointer==harePointer)break;


       }

       int begin = nums[0];
       while(begin!=tortoisePointer){
           tortoisePointer=nums[tortoisePointer];
           begin = nums[begin];
       }
return begin;

    }









}
