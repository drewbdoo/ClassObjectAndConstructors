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

        String reply;
       welcome();

    }

    private static void welcome() {
        Scanner scanner = new Scanner(System.in);
        String reply;
        do {
            System.out.println("Hello world! Welcome to the Bank of Matt!");
            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            reply = scanner.nextLine();
            if (reply.equalsIgnoreCase("1")) {
                System.out.println("Please select the account number of the account you'd like to access");
                for (BankAccount bankAccount : bankAccounts) {
                    System.out.println(bankAccount.getName() + ": " + bankAccount.getAccountNumber());
                }
                String num = scanner.nextLine();
                int accountnum = Integer.parseInt(num)-1;
                BankAccount current = bankAccounts.get(accountnum);
                mainMenu(current);
            } else if (reply.equalsIgnoreCase("2")) {
                System.out.println("Let's make a new account!");
                System.out.println("What is the name for the account");
                String name = scanner.nextLine();
                System.out.println("What is the beginning balance for the account");
                String accountbal = scanner.nextLine();
                double balance = Double.parseDouble(accountbal);
                bankAccounts.add(new BankAccount());
                (bankAccounts.get(bankAccounts.size()-1)).setAccountNumber(bankAccounts.size());
                (bankAccounts.get(bankAccounts.size()-1)).setName(name);
                (bankAccounts.get(bankAccounts.size()-1)).setBalance(balance);
                BankAccount current = bankAccounts.get(bankAccounts.size() - 1);
                mainMenu(current);
            }else if(reply.equalsIgnoreCase("-1")) {
                System.out.println("Thanks for banking with us");
                System.exit(0);
            }else{
                System.out.println("Not a valid response");
            }
    }while(!reply.equals("-1"));
    }

    private static void mainMenu(BankAccount current) {

        String reply;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello " + current.getName()+ "!");
            System.out.println("Welcome to the Main Menu, what would you like to do today?");
            System.out.println("1. To check account balance");
            System.out.println("2. To make a withdrawal");
            System.out.println("3. To make a deposit");
            System.out.println("4. To make a transfer to another account");
            System.out.println("0. To exit");
            reply = scanner.nextLine();
            if (reply.equals("1")) {
                System.out.println(current.getBalance());
            } else if (reply.equals("2")) {
                System.out.println("How much would you like to withdraw?");
                String withdraw = scanner.nextLine();
                double wDraw = Double.parseDouble(withdraw);
                current.withdrawal(wDraw);
            } else if (reply.equals("3")) {
                System.out.println("How much would you like to deposit?");
                String much = scanner.nextLine();
                double howMuch = Double.parseDouble(much);
                current.deposit(howMuch);
            } else if (reply.equals("4")) {
                System.out.println("Please enter the account number to transfer to");
                String acc = scanner.nextLine();
                int account = Integer.parseInt(acc)-1;
                if(account>bankAccounts.size()){
                    System.out.println("Account doesn't exist");
                }else{
                    System.out.println("Please enter the amount to transfer");
                    String amnt = scanner.nextLine();
                    double ammount = Double.parseDouble(amnt);
                    current.transfer(bankAccounts.get(account), ammount);
                    System.out.println("The name on the account to transfer from is: "+ current.getName() + " and they have a balance of $" + current.getBalance());
                    System.out.println("The name on the account to transfer to is: "+ (bankAccounts.get(account).getName()+ " and they have a balance of $" + (bankAccounts.get(account).getBalance())));

                }


            } else if (reply.equals("0")) {
                System.out.println("Back to account selection");
                welcome();

            }

        } while (!reply.equals(0));
    }



}



