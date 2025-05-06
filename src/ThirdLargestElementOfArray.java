public class ThirdLargestElementOfArray {


    public static int findThirdLargestElementOfAnArrayWithoutExtraMemory(int[] arr){


        for(int i = 0 ; i<arr.length;++i){

            for(int j = i+1;j<arr.length;++j){
                 if(arr[j]<arr[i]){
                     arr[i] = arr[i] ^ arr[j];
                     arr[j] = arr[i] ^ arr[j];
                     arr[i] = arr[i] ^ arr[j];
                 }

            }

        }
        
        return arr[arr.length - 3];
    }



    public static void main(String[] args) {
        int[] arr = {5,59,4,1,2,2,1,43,4,5,6,2};
        System.out.println(findThirdLargestElementOfAnArrayWithoutExtraMemory(arr));
    }
}
