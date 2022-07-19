import java.util.Scanner;

public class SimpleBankAccount {

    Scanner input = new Scanner(System.in);
    private double balance;

    public SimpleBankAccount() {
        balance = 0;
    }

    public SimpleBankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void checkAvailableBalance(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("You have "+ balance);
        }
        else {
            System.err.println("your balance is low");
        }
    }

    public double getBalance() {
        return balance;
    }
}
