import java.io.FileWriter;
import java.io.IOException;

public class bankAccount{

    // data reserved for customer who is log in.
    private static int accountNumber;
    private static double balance;
    private static String customerName;
    private static String email;
    private static String password;
    // data reserved for customer who is log in.


    private static int secondCustomerAccountNumber;
    private static double secondCustomerBalance;
    private static String secondCustomerCustomerName;
    private static String secondCustomerEmail;
    private static String secondCustomerPassword;

    public static int getSecondCustomerAccountNumber() {
        return secondCustomerAccountNumber;
    }

    public static void setSecondCustomerAccountNumber(int secondCustomerAccountNumber) {
        bankAccount.secondCustomerAccountNumber = secondCustomerAccountNumber;
    }

    public static String getSecondCustomerCustomerName() {
        return secondCustomerCustomerName;
    }

    public static void setSecondCustomerCustomerName(String secondCustomerCustomerName) {
        bankAccount.secondCustomerCustomerName = secondCustomerCustomerName;
    }

    public static String getSecondCustomerEmail() {
        return secondCustomerEmail;
    }

    public static void setSecondCustomerEmail(String secondCustomerEmail) {
        bankAccount.secondCustomerEmail = secondCustomerEmail;
    }

    public static String getSecondCustomerPassword() {
        return secondCustomerPassword;
    }

    public static void setSecondCustomerPassword(String secondCustomerPassword) {
        bankAccount.secondCustomerPassword = secondCustomerPassword;
    }

    // Getters and setters for log in customer.
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
    // Getters and setters for log in customer.

    // Getters and setters for bank transfer.
    public static double getSecondCustomerBalance() {
        return secondCustomerBalance;
    }

    public static void setSecondCustomerBalance(double secondCustomerBalance) {
        bankAccount.secondCustomerBalance = secondCustomerBalance;
    }
    // Getters and setters for bank transfer.

    // DEPOSIT HERE
    public static void deposit(double howMuchDeposit){
        balance += howMuchDeposit;
        System.out.println("Your balance is now: " +balance);

 //START Writing code to the new file and putting all other data.
        try {
            FileWriter myWriter = new FileWriter("src/" + accountNumber + "Account.txt");
            myWriter.write(
                    accountNumber + "\n" +
                            balance + "\n" +
                            customerName + "\n" +
                            email + "\n" +
                            password + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//START Writing code to the new file and putting all other data.
    }
//DEPOSIT WAS HERE


//WITHDRAW HERE
    public static void withdraw(double howMuchWithdraw){
        if (balance >= howMuchWithdraw) {
            balance -= howMuchWithdraw;
            System.out.println("Your new balance is " + balance);

//START Writing code to the new file and putting all other data.
            try {
                FileWriter myWriter = new FileWriter("src/" + accountNumber + "Account.txt");
                myWriter.write(
                        accountNumber + "\n" +
                                balance + "\n" +
                                customerName + "\n" +
                                email + "\n" +
                                password + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
//START Writing code to the new file and putting all other data.
        }
        else {
            System.out.println("Balance is too low!");
        }
    }
// WITHDRAW WAS THERE

//Transfer here.
public static void transfer(int howMuchTransfer){
    if (balance >= howMuchTransfer) {
        balance -= howMuchTransfer;
        secondCustomerBalance += howMuchTransfer;
        System.out.println("Your new balance is " + balance + ". You sent " + howMuchTransfer + " to " + secondCustomerCustomerName+".");
        System.out.println(secondCustomerAccountNumber);
        System.out.println(secondCustomerBalance);
        System.out.println(secondCustomerEmail);
        System.out.println(secondCustomerCustomerName);
        System.out.println(secondCustomerPassword);






//START Writing code to the new file and putting all other data.
        try {
            FileWriter myWriter1 = new FileWriter("src/" + accountNumber + "Account.txt");
            myWriter1.write(
                    accountNumber + "\n" +
                            balance + "\n" +
                            customerName + "\n" +
                            email + "\n" +
                            password + "\n");
            myWriter1.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//START Writing code to the new file and putting all other data.

//START Writing code to the new file and putting all other data.
        try {
            FileWriter myWriter2 = new FileWriter("src/" + secondCustomerAccountNumber + "Account.txt");
            myWriter2.write(
                    secondCustomerAccountNumber + "\n" +
                            secondCustomerBalance + "\n" +
                            secondCustomerCustomerName + "\n" +
                            secondCustomerEmail + "\n" +
                            secondCustomerPassword + "\n");
            myWriter2.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//START Writing code to the new file and putting all other data.
    }
    else {
        System.out.println("Balance is too low!");
    }
}
//Transfer here.

}
