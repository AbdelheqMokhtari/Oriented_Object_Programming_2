public class BankTransaction implements Runnable {

    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public BankTransaction(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }

}
