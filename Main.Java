
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//Program starting, checking if you have already account.

        Scanner sc = new Scanner(System.in);



while(true) {
    System.out.println("Are you existing customer? yes/no");
    String input = sc.nextLine().toLowerCase();


    if (Objects.equals(input, "yes")) {
            System.out.println("Please put your ACCOUNT NUMBER to log in:");

            System.out.println("Please put your PASSWORD to log in:");
            String password = sc.nextLine();
            if (Objects.equals(password, marcinAccount.getPassword())){
        System.out.println(marcinAccount.getPassword());
        System.out.println(password);}
            else {
                System.out.println("WRONG PASSWORD!");
                System.out.println(marcinAccount.getPassword());
                System.out.println(password);
            }

    }

    //here is starting registration
    else {
        System.out.println("Do you want to create account? yes/no");
        String inputCreateAccount = sc.nextLine().toLowerCase();

        if (Objects.equals(inputCreateAccount, "yes")) {
            bankAccount newAccount = new bankAccount(12345, 0.00);
            System.out.println("Please type your name:");
            String newAccountName = sc.nextLine();
            newAccount.setCustomerName(newAccountName);
            System.out.println("Hello " + newAccountName + ", please type your email address:");
            String newEmailAddress = sc.nextLine();
            newAccount.setEmail(newEmailAddress);
            System.out.println("Your email is: " + newEmailAddress + ", now please type your password:");
            String newPassword = sc.nextLine();
            newAccount.setPassword(newPassword);
            System.out.println("Welcome in Marcin Banking!");
            System.out.println("Your name is: " + newAccount.getCustomerName());
            System.out.println("Your account number is: " + newAccount.getAccountNumber());
            System.out.println("Your current balance is: " + newAccount.getBalance());
            System.out.println("Your email address is: " + newAccount.getEmail());
            System.out.println("Your password is: '" + newAccount.getPassword() + "' Don't show it to anyone!");
            continue;
            //here is finishing registration

        }
        if (Objects.equals(inputCreateAccount, "no")) {
            System.out.println("There is no service for you. Have a nice day.");

        }

    }
}}



//        bankAccount marcinAccount = new bankAccount(12345, 0.00, "Marcin", "email@gmail.com", "098272");
//
//        marcinAccount.getBalance();
//        marcinAccount.deposit(55);
//        marcinAccount.getBalance();



}
