
import java.util.*;
import java.io.*;


public class AeroplaneBombing {
    public static int cs =1;



    public static int dfs(int i, int j,boolean canBomb, ArrayList<ArrayList<Integer>> adj , int n){

        if(i<0)return 0;
        if(adj.get(i).get(j)==2) return 0;
        int ans = 0;

        if(adj.get(i).get(j)==1) ans++;

        if(canBomb==true){
            ArrayList<ArrayList<Integer>> cpy  = new ArrayList<>();
            for(ArrayList<Integer> arr:adj){
                cpy.add(new ArrayList<>(arr));
            }

            for(int p= Math.max(i-5,0);p<i;++p){
                for(int q = 0;q<5;++q){
                    if(cpy.get(p).get(q)==2){
                        cpy.get(p).set(q,0);
                    }
                }
            }

            int a=0;
            int b = 0;
            int c = 0;
            if((j+1)<5) a = dfs(i-1,j+1,false,cpy,n);
            if((j-1)>=0) b = dfs(i-1,j-1,false,cpy,n);
            c = dfs(i-1,j,false,cpy,n);

            int finalAns1 = Math.max(a,Math.max(b,c)) + ans;
            int aa=0;
            int bb =0;
            int cc = 0;
            if((j+1)<5) aa = dfs(i-1,j+1,true,adj,n);
            if((j-1)>=0) bb = dfs(i-1,j-1,true,adj,n);
            cc = dfs(i-1,j,true,adj,n);
            int finalAns2 = Math.max(aa,Math.max(bb,cc)) + ans;
            return Math.max(finalAns2,finalAns1);



        }
        else {

            int a=0;
            int b = 0;
            int c = 0;
            if((j+1)<5) a = dfs(i-1,j+1,false,adj,n);
            if((j-1)>=0) b = dfs(i-1,j-1,false,adj,n);
            c = dfs(i-1,j,false,adj,n);

            int finalAns1 = Math.max(a,Math.max(b,c)) + ans;

            return finalAns1;


        }





    }









    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while((t--)>0){

            int n;
            // Scanner scanner = new Scanner(System.in);
            n= scanner.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i=0;i<n;++i){
                adj.add(new ArrayList<>());
                for(int j=0;j<5;++j){
                    if(scanner.hasNext())
                        adj.get(i).add(scanner.nextInt());
                }
            }
            adj.add(new ArrayList<>(Collections.nCopies(5,0)));

            System.out.println("#"+ cs +" "+dfs(n,2,true,adj,n));
            cs++;
        }




    }
}


