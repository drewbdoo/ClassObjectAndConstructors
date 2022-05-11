import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String name;
    private double accountNumber;

    public BankAccount(double balance, String customerName, double accountNumber) {
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
    public String getBalance(){
       return (name +"'s account balance: " + balance);
    };

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

};

