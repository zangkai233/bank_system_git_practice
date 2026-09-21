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
  
    public void deposit(double amount){
        balance += amount;
    }

    public String getOwner(){
        return owner;

    }

    public void transferTo(BankAccount other, double amount) {
        this.balance -= amount;
        other.balance += amount;
    }
}