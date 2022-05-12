import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankAccountMain {
    //testing git ssh
    static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public static void main(String[] args) {
////Step one, bank account creation
//        BankAccount bankAccount = new BankAccount(500, "Drew");
//        bankAccount.deposit(100);
//        System.out.println(bankAccount.getBalance());
////Bank transfer
//        BankAccount bankAccount1 = new BankAccount(5000, "Sami");
//        BankAccount bankAccount2 = new BankAccount(300, "Dave");
//        bankAccount1.withdrawal(100);
//        bankAccount2.deposit(100);
//        System.out.println(bankAccount1.getBalance());
//        System.out.println(bankAccount2.getBalance());
        Scanner scanner = new Scanner(System.in);
        String reply;
        do {
            System.out.println("Hello world! Welcome to the Bank of Matt!");
            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            reply = scanner.nextLine();
            if (reply.equalsIgnoreCase("1")) {
                System.out.println("Good for you then");
            } else if (reply.equalsIgnoreCase("2")) {
                System.out.println("Let's make a new account!");
                System.out.println("What is the name for the account");
                String name = scanner.nextLine();
                System.out.println("What is the beginning balance for the account");
                String accountbal = scanner.nextLine();
                double balance = Double.parseDouble(accountbal);
                bankAccounts.add(new BankAccount());
                (bankAccounts.get(bankAccounts.size()-1)).setAccountNumber(bankAccounts.size()-1);
                (bankAccounts.get(bankAccounts.size()-1)).setName(name);
                (bankAccounts.get(bankAccounts.size()-1)).setBalance(balance);
            }else {
            System.out.println("Not a valid response");
        }
    }while(!reply.equals("-1"));

    }



}



