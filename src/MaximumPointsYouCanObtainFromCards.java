public class MaximumPointsYouCanObtainFromCards {
    // https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
    public static int maxScore(int[] cardPoints, int k) {

        int total = 0;
        int sum = 0;
        for(int i =0;i<k;++i)
        {
            sum += cardPoints[i];

        }
        total = Math.max(total,sum);

        for(int i=k-1;i>=0;--i){

            sum -= cardPoints[i];
            sum+= cardPoints[cardPoints.length -k +i ];

            total = Math.max(total,sum);

        }
        return total;

    }


    public static void main(String[] args) {
           int[] arr = {1,2,3,4,5,6,1};
        System.out.println(maxScore(arr,3));
    }
}
