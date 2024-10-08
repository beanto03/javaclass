
import java.lang.reflect.Array;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers);
        try {
            int x = (int)Array.get(numbers, 60); 
            System.out.println(x); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }   
    }
}
