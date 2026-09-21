public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String withdraw(double amount){
        balance -= amount;
        return "The aoumt has been withdraw with " + amount;

    }
}