class BankAccount {

    static String bankName = "GLA Bank";
    static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Amit Sharma", 1001);
        BankAccount acc2 = new BankAccount("Pooja Verma", 1002);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
