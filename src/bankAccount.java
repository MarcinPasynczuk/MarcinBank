public class bankAccount{
    private static int accountNumber = 12345;
    private static double balance = 100.00;
    private static String customerName = "Marcin";
    private static String email = "marcin@gmail.com";
    private static String password = "password123";

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        bankAccount.accountNumber = accountNumber;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        bankAccount.balance = balance;
    }

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        bankAccount.customerName = customerName;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        bankAccount.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        bankAccount.password = password;
    }

    public bankAccount(int accountNumber, double balance, String customerName, String email, String password){
        System.out.println("done");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.password = password;

    }

    public bankAccount(int accountNumber, double balance) {

        this.accountNumber = 12345;
        this.balance = 0.00;
    }








    public void deposit(double howMuchDeposit){
        this.balance += howMuchDeposit;
        System.out.println(balance);
    }

    public void withdraw(double howMuchWithdraw){
        if (balance >= howMuchWithdraw){
            this.balance -= howMuchWithdraw;
            System.out.println(balance);}
        else {
            System.out.println("Balance is too low!");
        }

    }
}
