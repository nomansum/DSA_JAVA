import java.util.Collections;

public class Candy {



    public int candy(int[] ratings) {

    int[] candies = new int[ratings.length];

    for(int i=0;i<candies.length;++i) candies[i]=1;

    for(int i=1;i<candies.length;++i){
        if(ratings[i]>ratings[i-1]) candies[i] = candies[i-1]+1;
    }

int total = 0;

        for(int i=candies.length-2;i>=0;--i){
            if(ratings[i]>ratings[i+1]) candies[i] = Math.max(candies[i+1]+1,candies[i]);

        }
for(int val:candies) total+=val;
  return total;
    }



}
