package Day_11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckBalance cb = new CheckBalance();
        Withdraw wd = new Withdraw();
        Deposit dp = new Deposit();
        User users = new User();
        Scanner sc = new Scanner(System.in);    
        
        // Create user
        User user1 = new User("Amir", 100);
        User user2 = new User("Aiman", 200);
        User user3 = new User("Ali", 300);

        // Add user 
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);


        System.out.println("Enter name: ");
        String nameInput = sc.nextLine(); 
        int userInput;
        do{
            System.out.println("----Main Manu----");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            userInput = sc.nextInt();

            switch (userInput) {
            case 1: 
                cb.displayBalance();
                cb.withdrawHistory();
                break;
            case 2: 
                System.out.println("Enter amount: ");
                double amountInput = sc.nextDouble();
                wd.withdrawAmount(nameInput, amountInput);
                break;
            case 3:
                dp.insertAmount();
                break;
            }
            default:
                break;
        } while(userInput == 4){
            System.exit(0);
        }
    }
}
