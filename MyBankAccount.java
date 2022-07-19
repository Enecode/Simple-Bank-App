public class MyBankAccount {
    public static void main(String[] args) {
        SimpleBankAccount johnAccount = new SimpleBankAccount();
        SimpleBankAccount maryAccount = new SimpleBankAccount(2000);

        johnAccount.deposit(10000);
        johnAccount.withdraw(2000);

        johnAccount.checkAvailableBalance(6000);

        maryAccount.deposit(4000);
        maryAccount.withdraw(3000);


        System.out.println("Mary's balance = $" + maryAccount.getBalance());

    }



}
