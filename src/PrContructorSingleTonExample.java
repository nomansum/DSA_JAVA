import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

enum Status {
    FAIL, SUCCESS;
}
public class PrContructorSingleTonExample {


    public static void main(String[] args)  {

ArrayList<Integer> arr = new ArrayList<>();
arr.add(2);
arr.add(34);
        Collections.reverse(arr);
        Collections.sort(arr);
        System.out.println(Collections.binarySearch(arr,33));

for(Integer val:arr) System.out.println(val);
    }
}


class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Define a private constructor to prevent instantiation from outside the class
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Step 3: Provide a public static method to access the single instance
    public static Singleton getInstance() {
        if (instance == null) { // Create the instance if it does not exist
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}