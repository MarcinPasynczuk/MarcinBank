import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {


//Program starting, checking if you have already account.

        Scanner sc = new Scanner(System.in);
        int banForWrongPassword = 0;


        while(true) {
            System.out.println("Are you existing customer? yes/no");
            String input = sc.nextLine().toLowerCase();


            if (Objects.equals(input, "yes")) {
                System.out.println("Please put your personal ACCOUNT NAME: ");
                String personalAccountName = sc.nextLine();

// Finding file with name starting of personal account name and changing all data in bankAccount file. So now it can compare input with data.

                try {
                    File myObj = new File("src/" + personalAccountName +"Account.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {

// Reading data from paths from input.
                        String accountNumber1 = Files.readAllLines(Paths.get("src/" + personalAccountName +"Account.txt")).get(0);
                        String balance1 = Files.readAllLines(Paths.get("src/" + personalAccountName +"Account.txt")).get(1);
                        String name1 = Files.readAllLines(Paths.get("src/" + personalAccountName +"Account.txt")).get(2);
                        String email1 = Files.readAllLines(Paths.get("src/" + personalAccountName +"Account.txt")).get(3);
                        String password1 = Files.readAllLines(Paths.get("src/" + personalAccountName +"Account.txt")).get(4);
// Reading data from paths from input.

//                        System.out.println(accountNumber1);
//                        System.out.println(balance1);
//                        System.out.println(name1);
//                        System.out.println(email1);
//                        System.out.println(password1);

// Setting all data to bankAccount file. So now it's stored local.
                        bankAccount.setAccountNumber(Integer.parseInt(accountNumber1));
                        bankAccount.setBalance(Double.parseDouble(balance1));
                        bankAccount.setCustomerName(name1);
                        bankAccount.setEmail(email1);
                        bankAccount.setPassword(password1);
// Setting all data to bankAccount file. So now it's stored local.

// Asking for password.
                        System.out.println("Please put your PASSWORD to log in:");
                        String password = sc.nextLine();

// If password is correct:
                        if (Objects.equals(password, bankAccount.getPassword())){
while (true) {
    // When acc number and password from specific account name is correct then:
    System.out.println("Hello, " + bankAccount.getCustomerName() + " what would like to do? deposit/withdraw/transfer");
    String depositOrWithdraw = sc.nextLine().toLowerCase();

    // deposit choice
    if (Objects.equals(depositOrWithdraw, "deposit")) {
        System.out.println("How much do you want to deposit?");
        double newDeposit = sc.nextDouble();
        bankAccount.deposit(newDeposit);
        continue;
    }
    // deposit choice

    // withdraw choice
    if (Objects.equals(depositOrWithdraw, "withdraw")) {
        System.out.println("How much do you want to withdraw?");
        double newWithdraw = sc.nextDouble();
        bankAccount.withdraw(newWithdraw);
        continue;
    }
    // withdraw choice

    // Deposit choice.
    if (Objects.equals(depositOrWithdraw, "transfer")) {
        System.out.println("Please put RECIPIENTS account number");
        int recipientAccountNumber = sc.nextInt();
        try {
            File myObj2 = new File("src/" + recipientAccountNumber +"Account.txt");
            Scanner myReader2 = new Scanner(myObj2);
            while (myReader2.hasNextLine()) {

// Reading data from paths from input.
                String accountNumber2 = Files.readAllLines(Paths.get("src/" + recipientAccountNumber +"Account.txt")).get(0);
                String balance2 = Files.readAllLines(Paths.get("src/" + recipientAccountNumber +"Account.txt")).get(1);
                String name2 = Files.readAllLines(Paths.get("src/" + recipientAccountNumber +"Account.txt")).get(2);
                String email2 = Files.readAllLines(Paths.get("src/" + recipientAccountNumber +"Account.txt")).get(3);
                String password2 = Files.readAllLines(Paths.get("src/" + recipientAccountNumber +"Account.txt")).get(4);
// Reading data from paths from input.

// Setting all data to bankAccount file. So now it's stored local.
                bankAccount.setSecondCustomerAccountNumber(Integer.parseInt(accountNumber2));
                bankAccount.setSecondCustomerBalance(Double.parseDouble(balance2));
                bankAccount.setSecondCustomerCustomerName(name2);
                bankAccount.setSecondCustomerEmail(email2);
                bankAccount.setSecondCustomerPassword(password2);
// Setting all data to bankAccount file. So now it's stored local.

                System.out.println("How much do you want to transfer?");
                int newTransfer = sc.nextInt();
                bankAccount.transfer(newTransfer);
                break;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
//            e.printStackTrace();

        }














    }
    // Deposit choice.
















}
                            // When acc number and password from specific account name is correct then do upper code.
                        }

// When password is wrong.
                        else {
                            banForWrongPassword++;
                            System.out.println("WRONG PASSWORD!");
                            if (banForWrongPassword<=3){
                            System.out.println("You have :" + (3-banForWrongPassword) + " more tries.");}
                            else {
                                System.out.println("Please back in few minutes.");
                                TimeUnit.MINUTES.sleep(5);
                                banForWrongPassword = 0;
                            }
                        }
// When password is wrong.
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Customer does not existing.");
//                    e.printStackTrace();
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
//Start of registration
            else {
                System.out.println("Do you want to create account? yes/no");
                String inputCreateAccount = sc.nextLine().toLowerCase();
                if (Objects.equals(inputCreateAccount, "yes")) {

//Getting account number randomly from 1 to 100mln.
                    int accountNumber = new Random().nextInt(100000000) + 1;
//Getting account number randomly from 1 to 100mln.

                    System.out.println("Your account number is: " + accountNumber);

//Start of registration

//Creating new file to store all data of new account
        try {
            File myObj = new File("src/" + accountNumber +"Account.txt");
            if (myObj.createNewFile()) {
//                System.out.println("Account created!");
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

//START Writing code to the new file and putting all the data from scanners.
                    try {
                        FileWriter myWriter = new FileWriter("src/" + accountNumber +"Account.txt");
                        myWriter.write(
                                accountNumber +"\n"+
                                "0.00\n"+
                                newName +"\n"+
                                newEmailAddress +"\n"+
                                newPassword +"\n" );
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