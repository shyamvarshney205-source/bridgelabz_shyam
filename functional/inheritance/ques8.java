class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account with interest rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account with withdrawal limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int duration;
    FixedDepositAccount(int accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account for duration: " + duration + " years");
    }
}

public class ques8 {
    public static void main(String[] args) {
        new SavingsAccount(101, 5000, 5.0).displayAccountType();
        new CheckingAccount(102, 2000, 1000).displayAccountType();
        new FixedDepositAccount(103, 10000, 3).displayAccountType();
    }
}

