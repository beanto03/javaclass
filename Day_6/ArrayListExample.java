import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruit #1: " + fruits.get(0));

        // for (String fruit: fruits){
        //     System.out.println(fruit);
        // }`

        //display Array List in array format
        fruits.remove(1);
        //System.out.println(fruits);
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}