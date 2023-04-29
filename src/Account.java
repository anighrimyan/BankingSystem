import java.util.Random;

public class Account implements  IAccountNumGenerator {
    private final String accountNumber = generator(this);
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addBalance(double money){
        balance += money;
    }
    public void subBalance(double money){
        balance -= money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
