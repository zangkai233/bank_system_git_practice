public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Kai", 1000);

        System.out.println("Current balance: $" + account.getBalance());
        System.out.println(account.withdraw(100));
    }
}