package Day_11;

public class Deposit {
    private String name;
    private double value;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getBalance() {
        return balance
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Deposit() {
        this.name = name;
        this.balance = balance;
        this.value = value;
    }

    public insertAmount(String name, double amount) {
        for (User user : users){
            if (name.isEqual(users)){
                balance = balance + amount;
                return balance;
            } else {
                System.out.println("User not found");
            }
        }        
    }
    
}


