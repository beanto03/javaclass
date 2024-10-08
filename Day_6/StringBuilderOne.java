package Day_6;

public class StringBuilderOne {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append("World"); //to concatenate string
        System.out.println(sb.toString());
        sb.insert(5, ",");  // it will replace the 5th character with ","
        System.out.println(sb.toString());
        sb.delete(5, 6);
        System.out.println(sb.toString());
        sb.reverse(); //reverse
        System.out.println(sb.toString());
    }
}
