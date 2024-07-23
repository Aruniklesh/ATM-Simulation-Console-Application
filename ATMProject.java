package Marathon;

import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {

        int pin = 1234;
        int balance = 10000;
        String name;

        int addAmount = 0;
        int takeAmount = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your Pin Number: ");
            int passWord = sc.nextInt();

            if (passWord == pin) {
                System.out.println("Enter your Account Holder Name: ");
                name = sc.next();

                System.out.println("......Welcome......");

                while (true) {
                    // using while loop we are getting the input from the user
                    System.out.println("************************************* ");
                    System.out.println("Press 1 to check your Balance: ");
                    System.out.println("Press 2 to Add amount: ");
                    System.out.println("Press 3 to Take amount: ");
                    System.out.println("Press 4 to Take receipt: ");
                    System.out.println("Press 5 to EXIT: ");
                    System.out.println("************************************* ");

                    // getting input from the user
                    try {
                        int option = sc.nextInt();

                        // if the number matches the option the respective case will work
                        switch (option) {
                            case 1:
                                System.out.println("Your Current Balance: " + balance);
                                break;
                            case 2:
                                try {
                                    System.out.println("Please Enter Deposit Amount: ");
                                    addAmount = sc.nextInt();
                                    System.out.println("Successfully Credited");
                                    balance = addAmount + balance;
                                } catch (Exception e) {
                                    System.out.println("Invalid input. Please enter a valid amount.");
                                    sc.next(); // clear the invalid input
                                }
                                break;
                            case 3:
                                try {
                                    System.out.println("Please enter Withdraw amount: ");
                                    takeAmount = sc.nextInt();
                                    if (takeAmount > balance) {
                                        System.out.println("Insufficient Balance... Please Enter correct amount");
                                    } else {
                                        System.out.println("-----Successfully Taken-----");
                                        balance = balance - takeAmount;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Invalid input. Please enter a valid amount.");
                                    sc.next(); // clear the invalid input
                                }
                                break;
                            case 4:
                                System.out.println("************************************* ");
                                System.out.println("-----Welcome to All in one ATM-----");
                                System.out.println("Account Holder Name: " + name);
                                System.out.println("Available Balance: " + balance);
                                System.out.println("Amount Deposited: " + addAmount);
                                System.out.println("Amount Withdrawn: " + takeAmount);
                                System.out.println("Thank You!");
                                System.out.println("-------------------------------------- ");
                                break;
                            case 5:
                                System.out.println("Thank you visit again!");
                                sc.close(); // close the scanner before exiting
                                System.exit(0);
                            default:
                                System.out.println("Invalid option. Please select a valid option.");
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid input.");
                        sc.next(); // clear the invalid input
                    }
                }
            } else {
                System.out.println("Wrong Pin! Please enter correct pin number...");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        } finally {
            sc.close();
        }
    }
}
