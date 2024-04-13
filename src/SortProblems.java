public class SortProblems {


//    PROBLEM 1 :
//    Given sorted array of integers , rearrange array in such a way
//    that the first position will have the largest number, the second
//    will have the smallest , the third will have the second-largest
//    and so on , Using O(1) extra space.
//    example: arr = {1,2,3,4,5,6,7}
//    ans: arr={7,1,6,2,5,3,4}
// not solved
public static void solutionToProblem1(int[]arr){

    int maxIdx = arr.length - 1 ;
    int minIdx = 0 ;

    int max = arr[minIdx] + 1;
    for(int i = 0;i<arr.length;++i){
        if(i%2==0){
             arr[i] = arr[i] + ( arr[maxIdx] % max  ) * max;
             maxIdx--;
        }
        else {
            arr[i] = arr[i] + ( arr[minIdx] % max  ) * max;
        minIdx++;
        }
    }
    for(int i = 0; i< arr.length; ++i){
        arr[i] = arr[i]/max;
    }
}



    public static void main(String[] args) {

       int[] arr = {1,2,3,4,5,6,7};
       solutionToProblem1(arr);
       MergeSort.printArray(arr);

    }



}
