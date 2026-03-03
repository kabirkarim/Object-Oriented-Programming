import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        if (initialDeposit > 0) {
            this.balance = initialDeposit;
        } else {
            System.out.println("Initial deposit must be positive. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialDeposit);

        System.out.print("Enter amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();

        account.withdraw(withdrawalAmount);

        System.out.println("Final balance for " + account.getAccountHolder() + ": " + account.getBalance());

        scanner.close();
    }
}


/*
Task: BankAccount Class — Safe Balance Management

Problem Statement:
Create a BankAccount class to manage a user's balance safely through encapsulated methods.

Class Name: BankAccount

Private Fields:
- accountHolder (String)
- balance (double)

Requirements:
- The deposit method should only accept positive amounts.
- The withdraw method must reject negative amounts and amounts greater than the current balance.
- Use Scanner to prompt the user for an initial deposit amount and a withdrawal amount.
- Display the final balance after transactions.
*/