class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String holder, int number, double bal) {
        accountHolder = holder;
        accountNumber = number;
        balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount!");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Priya Singh", 123456, 1000.0);

        acc1.displayBalance();
        acc1.deposit(500.0);
        acc1.withdraw(300.0);
        acc1.displayBalance();
    }
}
