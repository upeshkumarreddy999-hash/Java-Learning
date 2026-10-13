
import java.util.Scanner;

public class BankingManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String accountHolder = "Demo User";
    static long accountNumber = 123456789L;
    static double balance = 10000.00;
    static int transactions = 0;

    public static void checkBalance() {
        System.out.printf("Current balance: Rs. %.2f%n", balance);
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: Rs. ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            transactions++;
            System.out.println("Deposit successful.");
            checkBalance();
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    public static void withdraw() {
        System.out.print("Enter withdrawal amount: Rs. ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactions++;
            System.out.println("Withdrawal successful.");
            checkBalance();
        }
    }

    public static void displayAccount() {
        System.out.println("\n----- ACCOUNT DETAILS -----");
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        checkBalance();
        System.out.println("Successful transactions: " + transactions);
    }

    public static void calculateInterest() {
        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        if (rate < 0 || years < 0) {
            System.out.println("Invalid interest rate or years.");
            return;
        }

        double interest = balance * rate * years / 100;
        System.out.printf("Estimated simple interest: Rs. %.2f%n", interest);
        System.out.printf(
            "Balance including interest: Rs. %.2f%n",
            balance + interest
        );
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Calculate Simple Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayAccount();
                    break;

                case 2:
                    checkBalance();
                    break;

                case 3:
                    deposit();
                    break;

                case 4:
                    withdraw();
                    break;

                case 5:
                    calculateInterest();
                    break;

                case 6:
                    System.out.println("Thank you for using the bank.");
                    break;

                default:
                    System.out.println("Please select a valid option.");
            }

        } while (choice != 6);

        sc.close();
    }
}