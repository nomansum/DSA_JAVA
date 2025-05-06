public class ReverseANumber {


    public static void reverseNumber(int n){

        if(n<10){
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        reverseNumber(n/10);

    }


    public static void main(String[] args) {

          reverseNumber(19238);


    }


}
