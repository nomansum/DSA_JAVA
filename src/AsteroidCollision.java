import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    // https://leetcode.com/problems/asteroid-collision/description/
    public static int[] asteroidCollision(int[] asteroids) {


        List<Integer> answers = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int val:asteroids){

            if(val>0)answers.add(val);
            else {

                while(!answers.isEmpty() && answers.getLast()>0 && answers.getLast()<Math.abs(val)){
                    answers.removeLast();
                }

                if(!answers.isEmpty() && answers.getLast()==Math.abs(val)){
                    answers.removeLast();
                }
                else if(answers.isEmpty() || answers.getLast()<0){
                    answers.add(val);
                }


            }

        }
int[] result = new int[answers.size()];
int i = 0;
        for(int val:answers){
            result[i++] = val;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr  = {5,10,-5,-19};
        int[] ans = asteroidCollision(arr);
        for(int val:ans){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
