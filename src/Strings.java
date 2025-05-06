import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {


    public static void main(String[] args) {

        String s = new String("abcdefgh lksjfoi");
        Stream<String> ss = s.lines();


         String favouriteColor  = "red";

         favouriteColor = "green";
         favouriteColor.replace('g','f');

         try{
             throw new StackOverflowError();
         }
         catch (StackOverflowError e){
             System.out.println("Error caught");
         }



        System.out.println(favouriteColor);

    }
}
