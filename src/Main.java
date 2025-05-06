




public class Main {


    public static int[] removeEven(int[] arr){
        int oddCount = 0 ;

        for(int i =0 ;i<arr.length;++i){
            if((arr[i]&1) == 1){
                   oddCount++;

            }
        }
        int[] resultArray = new int[oddCount];
       int idx = 0;
        for(int i =0 ;i<arr.length;++i){
            if((arr[i]&1) == 1){
                resultArray[idx]=arr[i];
                idx++;

            }
        }


return resultArray;
    }

public static int[] reverseArray(int[] arr,int start , int end){

    while(start<end){
        int temp =  arr[end];
        arr[end]=arr[start];
        arr[start]= temp;
        start++;
        end--;
    }

return arr;

}

public static  int findMinimumValueInArray(int[] arr){

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        for(int i =1;i<arr.length;++i){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return  min;
    }

public static int findSecondMaximumValueInArray(int[] arr){

        // second maximum value exists....

        int secondMaxValue= Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;++i){
            if(arr[i]>maxValue){
                secondMaxValue = maxValue;
                maxValue = arr[i];

            }
            else if(arr[i]>secondMaxValue && arr[i]!=maxValue){
                secondMaxValue = arr[i];
            }
        }

return secondMaxValue;


}

public static int[] moveAllZeroToEnd(int[] arr){
        // the order should hold....

     int zeroIdx = 0;

     for(int i=0;i<arr.length;++i){

         if(arr[i]!=0 && arr[zeroIdx]==0){
             int temp = arr[i];
             arr[i]=arr[zeroIdx];
             arr[zeroIdx]=temp;
         }
         if(arr[zeroIdx]!=0){
             zeroIdx++;
         }


     }



return  arr;
}
public static void printArray(int[] arr){
    for(int i =0;i<arr.length;++i){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}


public static int[] resizeArray(int[] arr){

        int[] resizedArray = new int[arr.length * 2];
        for(int i =0;i<arr.length;++i){
            resizedArray[i]=arr[i];
        }

        return resizedArray;
}

public static  int findTheMissingNumberInArray(int[] arr){
        //given n-1 distinct number find the missing number
       // in O(n)
    int n = arr.length+1;

    int sum = (n*(n+1))/2;

    for(int num:arr){
        sum -= num;
    }
return sum;

}

public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;


}






    public static void main(String[] args) {

        int[] arr = moveAllZeroToEnd(new int[] {0,0,0,3,2,0,4,7,10,60});

         printArray(arr);

    }
}