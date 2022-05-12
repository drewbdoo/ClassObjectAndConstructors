import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String name;
    private int accountNumber;

    public BankAccount(double balance, String customerName, int accountNumber) {
        this.balance = balance;
        this.name = customerName;
        this.accountNumber = accountNumber;
    }

    public double deposit(double x){
        return(balance+=x);
    };
    public double withdrawal(double x){
        return (balance-=x);
    };
    public double getBalance(){
       return balance;
    };
    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public BankAccount(){
        this.balance = 0;
        this.name="";

    }
    public void setName(String x){
        name = x;
    }
    public void setBalance(double x){
        balance = x;
    }
    public void setAccountNumber(int x){
        accountNumber=x;
    }
    public void transfer(BankAccount x, double sum){
        balance -= sum;
        x.balance += sum;
    }

};

