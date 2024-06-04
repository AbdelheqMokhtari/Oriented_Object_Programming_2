package test.inheritance;

import java.util.Random;

public class BankAccount {

    private String accountNumber;
    private double balance;
   // private int matc [][];

    public BankAccount(double balance) {
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
    }
//void setInt( int [][] m) { matc=m ; }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        int number = random.nextInt(90000000)+ 10000000 ; // Generates a random number between 10000000 and 99999999
        return String.format("%8d", number); // Formats the number as 8 digits with leading zeros if necessary
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);

    }

    @Override
    public void withdraw(double amount) {
     if (getBalance() - amount < 100) {
       System.out.println("Minimum balance of $100 required!");
      }else {
        super.withdraw(amount);
     }
    }
}
