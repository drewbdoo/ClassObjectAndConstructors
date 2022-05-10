public class BankAccountMain {
    public static void main(String[] args) {
//Step one, bank account creation
        BankAccount bankAccount = new BankAccount(500, "Drew");
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
//Bank transfer
        BankAccount bankAccount1 = new BankAccount(5000, "Sami");
        BankAccount bankAccount2 = new BankAccount(300, "Dave");
        bankAccount1.withdrawal(100);
        bankAccount2.deposit(100);
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
    }
}
