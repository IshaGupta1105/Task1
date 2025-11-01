class Bank {
    double amount;

    // Parameterized constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw money
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        // Update balance only if withdrawal is successful
        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    // Method to deposit money
    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    // Method to display total balance
    void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
}

public class BankAccount {
     public static void main(String[] args) {
        // Create Bank object with initial balance of 10000
        Bank myAccount = new Bank(10000);

        // Withdraw some amount
        myAccount.withdraw(3000);

        // Deposit 5000 into account
        myAccount.deposit(5000);

        // Display total balance
        myAccount.displayBalance();
    }
}
