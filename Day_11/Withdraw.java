package Day_11;

public class Withdraw{
    private String name;
    private double amount;
    private double balance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Withdraw() {
        this.name = name;
        this.amount = amount;
        this.balance = balance;
    }


    //not complete yet
    public double withdrawAmount(String name, double amount) {
        for (User user : users) {
            if (User user.isEqual(name)) {
                if(amount <= 20) {
                    user.balance = balance - amount;
                } else {
                    System.out.println("Balance is not enough");
                }
                
            } else {
                System.out.println("User not found");
            }
        }
    }
}