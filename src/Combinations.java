import java.util.*;
public class Combinations {




    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();

    backtrack(combinations,new ArrayList<>(),1,n,k);

    return combinations;


    }
    public void backtrack(List<List<Integer>> combinations,List<Integer>list,int start,int n, int k){

        if(list.size()==k){
            combinations.add(new ArrayList<>(list));
          return;
        }

        for(int i=start;i<=n;++i){

            list.add(i);

            backtrack(combinations,list,i+1,n,k);

            list.remove(list.size()-1);

        }


        return;

    }



}
