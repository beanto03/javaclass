
// convert any String into capital/small letter
public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello";
        String newStr = str.concat(" World");
        String lowerStr = str.toLowerCase(); //convert to lower case
        String subStr = newStr.substring(0,5); //print only specified String location
        String replaceString = newStr.replace(" World", " Java");
        System.out.println(newStr);
        System.out.println(lowerStr);
        System.out.println(subStr);
        System.out.println(newStr);
        System.out.println(replaceString);
    }
}
