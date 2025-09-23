import java.util.Scanner;

public class Bank_Account_Management {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account details:");
        System.out.print("Account No: ");
        int accountNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Account Holder: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNo, accountHolder, initialBalance);

        System.out.println("\n--- Account Details ---");
        account.displayDetails();

        System.out.print("\nDeposit Amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("\nAfter depositing " + (int) depositAmount + ":");
        System.out.println("Balance: " + account.getBalance());

        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount1 = scanner.nextDouble();
        account.withdraw(withdrawAmount1);
        System.out.println("\nAfter withdrawing " + (int) withdrawAmount1 + ":");
        System.out.println("Balance: " + account.getBalance());

        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount2 = scanner.nextDouble();
        account.withdraw(withdrawAmount2);

        System.out.println("\nFinal Balance: " + account.getBalance());

        scanner.close();
    }
}

class BankAccount {
    private int accountNo;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNo, String accountHolder, double initialBalance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("\nWithdrawal of " + (int) amount + " failed. Insufficient balance!");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
