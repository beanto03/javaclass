package Day_11;

public class CheckBalance {
    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CheckBalance() {
        this.name = name;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Balance left: " + balance);
    }
    
}
