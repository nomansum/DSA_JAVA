public class MedianTwoSortedArray {

    // https://leetcode.com/problems/median-of-two-sorted-arrays/description/



    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int index2 = (nums1.length + nums2.length)/2;
        int index1 = index2 - 1;
        int i = 0;
        int j = 0;
        int count = 0;
        int element1 = -1;
        int element2 = -1;
        while(i<nums1.length && j<nums2.length){

            if(nums1[i]<nums2[j]){
                if(count==index1) element1 = nums1[i];
                if(count==index2) element2 = nums1[i];
                i++;
                count++;
            }
            else {
                if(count==index1) element1 = nums2[j];
                if(count==index2) element2 = nums2[j];
                j++;
                count++;
            }


        }

        while (i<nums1.length){
            if(count==index1) element1 = nums1[i];
            if(count==index2) element2 = nums1[i];
            i++;
            count++;
        }
     while (j< nums2.length){
         if(count==index1) element1 = nums2[j];
         if(count==index2) element2 = nums2[j];
         j++;
         count++;
     }

     if(((nums1.length + nums2.length)&1) == 1){
         return element2;
     }

     return (double)((double)(element2+element1))/2.0;

    }




    public static void main(String[] args) {
    int[] arr = {1,3};
    int[] arr1 = {2};
        System.out.println(findMedianSortedArrays(arr,arr1));
    }
}
