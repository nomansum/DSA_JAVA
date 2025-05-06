import java.util.ArrayList;
import java.util.List;

public class Solve {










    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];

        getHeight(root,diameter);

        return diameter[0];
    }
    public static int getHeight(TreeNode root,int[] diam){

        if(root==null)return 0;

        int left = getHeight(root.left,diam);
        int right  = getHeight(root.right,diam);

        diam[0] = Math.max(diam[0],left+right);

        return 1+Math.max(left,right);


    }









    int count = 0;

    public List<String> generateParenthesis(int n) {


        List<String> result = new ArrayList<>();



count = n;
 solveParentheses(result,0,0, "");
return result;

    }


    public void solveParentheses(List<String> list,int openParCount, int closeParCount,String s){

        if(s.length()==2*count){
            list.add(s);
            return;
        }
        if(openParCount<count)
            solveParentheses(list,openParCount+1,closeParCount,s+'(');
            
        
        if(openParCount>closeParCount)
          solveParentheses(list,openParCount,closeParCount+1,s+')');
        

    }





    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left<=right){

            int mid = (left+right)/2;
            if(nums[mid]==target) {

                return mid;
            }
            else if(nums[mid]>=nums[left]){

                if(nums[mid]>=target && nums[left]<=target){
                    right = mid-1;
                }
                else left = mid+1;

            }
            else {
                if(nums[mid]<=target && nums[right]>=target){
                    left = mid+1;
                }
                else right = mid-1;


            }


        }
return -1;

    }



    public static String getSmallestString(String dataSequence, int maxSwaps) {

        StringBuilder sb = new StringBuilder(dataSequence);

        ArrayList<Integer> zeroIndexes = new ArrayList<>();
        ArrayList<Integer> oneIndexes = new ArrayList<>();

        for(int i=0;i<sb.length();++i){
            if(sb.charAt(i)=='0') zeroIndexes.add(i);
            else oneIndexes.add(i);
        }
        int i =0;
        int j = 0;
        while(maxSwaps>0 && i<zeroIndexes.size() && j<oneIndexes.size()){

            int index = zeroIndexes.get(i) - oneIndexes.get(j);

            if(index>0 ){

                if(index<maxSwaps){
                    sb.setCharAt( zeroIndexes.get(i),'1' );
                    sb.setCharAt(oneIndexes.get(j),'0');
                    ++i;
                    ++j;
                    maxSwaps-=index;
                }
                else {
                    j++;
                }


            }

            else {
                ++i;
            }



        }


        return sb.toString();

    }




}
