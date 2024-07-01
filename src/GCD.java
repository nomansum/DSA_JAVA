public class GCD {


    public  static  int euclidAlgo(int a , int b){
       int  r = 1;
       while(r!=0){
           r = (int) (a - (b*(Math.floor(a/b))));
            a = b;
            b  = r;
       }
        return a ;
    }




    public static void main(String[] args) {

        System.out.println(euclidAlgo(15,45));
    }

}
