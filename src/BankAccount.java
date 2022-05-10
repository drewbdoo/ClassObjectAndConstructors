public class BankAccount {
    private int balance;
    private String name;

    public BankAccount(int balance, String customerName) {
        this.balance = balance;
        this.name = customerName;
    }
    public int deposit(int x){
        return(balance+=x);
    };
    public int withdrawal(int x){
        return (balance-=x);
    };
    public String getBalance(){
       return (name +"'s account balance: " + balance);
    };

};

