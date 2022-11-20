import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//Program starting, checking if you have already account.

        Scanner sc = new Scanner(System.in);



        while(true) {
            System.out.println("Are you existing customer? yes/no");
            String input = sc.nextLine().toLowerCase();


            if (Objects.equals(input, "yes")) {
                System.out.println("Please put your personal ACCOUNT NAME: ");
                String accountNumber = sc.nextLine();
                if (Objects.equals(accountNumber, marcinAccount.getAccountNumber())){
                    System.out.println("Please put your PASSWORD to log in:");
                    String password = sc.nextLine();
                    if (Objects.equals(password, marcinAccount.getPassword())){




                        // When acc number and password from xAccount is correct then:
                        System.out.println("Hello, " + marcinAccount.getCustomerName()+ " what would like to do? deposit/withdraw");
                        System.out.println("no working from now, it is in progress to my future -> do next comand while to back there imho");





                        // When acc number and password from xAccount is correct then do code up
                    }
// When password is wrong.
                    else {
                        System.out.println("WRONG PASSWORD!");
                    }
// When password is wrong.
                }

// When account number is wrong.
                else {
                    System.out.println("WRONG ACCOUNT NUMBER");
                }
// When account number is wrong.
            }


//Start of registration
            else {
                System.out.println("Do you want to create account? yes/no");
                String inputCreateAccount = sc.nextLine().toLowerCase();
                if (Objects.equals(inputCreateAccount, "yes")) {
                    System.out.println("Please your your personal ACCOUNT NAME: ");
                    String newAccountName = sc.nextLine();
//Start of registration

//Creating new file to store all data of new account
        try {
            File myObj = new File("src/" + newAccountName +"Account.java");
            if (myObj.createNewFile()) {
                System.out.println("Account created!");
            } else {
                System.out.println("This account name is already exists.");
                continue;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//Creating new file to store all data of new account

// START Here is asking for all other data and creating randomly account number, balance at the beginning is 0.00.
                    System.out.println("Please type your name:");
                    String newName = sc.nextLine();
                    System.out.println("Hello " + newName + ", please type your email address:");
                    String newEmailAddress = sc.nextLine();
                    System.out.println("Your email is: " + newEmailAddress + ", now please type your password:");
                    String newPassword = sc.nextLine();

//Getting account number randomly from 1 to 1mln.
                    int accountNumber = new Random().nextInt(1000000) + 1;
//Getting account number randomly from 1 to 1mln.

//START Writing code to the new file and putting all the data from scanners.
                    try {
                        FileWriter myWriter = new FileWriter("src/" + newAccountName +"Account.java");
                        myWriter.write(

                        "public class " +
                        newAccountName +
                        "Account { " +
                            "private static int accountNumber = " +
                                accountNumber  +
                                ";" +
                        "private static double balance = 0.00;" +
                        "private static String customerName = \"" +
                                newName +
                                "\";" +
                        "private static String email = \"" +
                                        newEmailAddress +
                                        "\";" +
                        "private static String password = \"" +
                                newPassword +
                                "\";" +
                        "public static int getAccountNumber() {\n" +
                                "        return accountNumber;\n" +
                                "    }\n" +
                                "\n" +
                                "    public static double getBalance() {\n" +
                                "        return balance;\n" +
                                "    }\n" +
                                "\n" +
                                "    public static String getCustomerName() {\n" +
                                "        return customerName;\n" +
                                "    }\n" +
                                "\n" +
                                "    public static String getEmail() {\n" +
                                "        return email;\n" +
                                "    }\n" +
                                "\n" +
                                "    public static String getPassword() {\n" +
                                "        return password;\n" +
                                "    }\n" +
                                "}"

                    );
                        myWriter.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
//END Writing code to the new file and putting all the data from scanners.

// Welcoming sout + back to the beginning of the loop.
                    System.out.println("Welcome to Marcin Banking!");
                    System.out.println("Your name is: " + newName);
                    System.out.println("Your account number is: " + accountNumber);
                    System.out.println("Your current balance is: 0.00");
                    System.out.println("Your email address is: " + newEmailAddress);
                    System.out.println("Your password is: '" + newPassword + "' Don't show it to anyone!");
                    continue;
// Welcoming sout + back to the beginning of the loop.
                }
// FINISH Here is asking for all other data and creating randomly account number, balance at the beginning is 0.00.

//START IF CUSTOMER DOESN'T WANT TO CREATE ACCOUNT IT WILL GO AT THE BEGINNING.
                if (Objects.equals(inputCreateAccount, "no")) {
                    System.out.println("There is no service for you. Have a nice day.");
                }
//FINISH IF CUSTOMER DOESN'T WANT TO CREATE ACCOUNT IT WILL GO AT THE BEGINNING.
            }
        }}

}
