public class OrAnd {
    
    public static void main(String[] args) {
        int age = 16;
        boolean hasParentalConsent= true;

        if (age >= 18 || hasParentalConsent && age==16) {
            System.out.println("Amir is allowed");
        } else {
            System.out.println("Amir is not allowed");
        }
    }
}
