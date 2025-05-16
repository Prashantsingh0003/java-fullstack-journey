public class BankAccount {
    //this keyword
    String accHolder;
    double balance;

    public BankAccount(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void showDetails() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Prashant Singh", 12000.75);
        acc.showDetails();
    }
}
