public class Main {
    public static void main(String []args){
        BankAccount account = new BankAccount(1000);

        // Creating deposit and withdrawal transactions
        Thread depositThread1 = new Thread(new BankTransaction(account, true, 200), "DepositThread-1");
        Thread withdrawThread1 = new Thread(new BankTransaction(account, false, 150), "WithdrawThread-1");
        Thread depositThread2 = new Thread(new BankTransaction(account, true, 300), "DepositThread-2");
        Thread withdrawThread2 = new Thread(new BankTransaction(account, false, 500), "WithdrawThread-2");

        // Starting threads
        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();
    }
}
