import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java123";

        String enteredPassword;

        do{
            System.out.println("Enter the password");
            enteredPassword = scanner.nextLine();
            if (!enteredPassword.equal(correctPassword)) {
                System.out.println("Please try again");
            }
        } while (!enteredPassword.equals(correctPassword)); //meaning while the condition is not satisfied, then repeat the Do block until satisfy

        System.out.println("True password");
    }
}
