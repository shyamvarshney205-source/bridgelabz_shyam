public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "State Bank of India";
    
    // Static variable to keep track of the total number of accounts
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final String accountNumber;  // Final variable – cannot be changed after initialization

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;  // Increment count on creation of a new account
    }

    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Instance method to display account details only if it's an instance of BankAccount
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Optional: Getter methods
    public static String getBankName() {
        return bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
