public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Kai", 1000);
        String name = account.getOwner();
        double balance = account.getBalance();

        account.deposit(100000);




        System.out.println("Current balance: $" + account.getBalance());
        System.out.println("Your name is " + name);
        System.out.println("You can make " + balance * 2 + " in the future");
    }
}