package gameProject;

import java.util.Scanner;

public class BankingAccountSystem {

    // Show Balance
    static void showBalance(int balance) {
        System.out.println("\nYour account balance is: " + balance + " tk");
    }

    // Deposit Money
    static int deposit(int balance, int deposit) {
        balance += deposit;
        System.out.println("\n" + deposit + " tk deposited successfully.");
        System.out.println("Current Balance: " + balance + " tk");
        return balance;
    }

    // Withdraw Money
    static int withdraw(int balance, int amount) {

        if (amount > balance) {
            System.out.println("\nInsufficient Balance!");
            return balance;
        }

        balance -= amount;

        System.out.println("\n" + amount + " tk withdrawn successfully.");
        System.out.println("Current Balance: " + balance + " tk");

        return balance;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 5000;

        while (true) {

            System.out.println("\n==============================");
            System.out.println("      Banking Program");
            System.out.println("==============================");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    showBalance(balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = scanner.nextInt();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance = deposit(balance, deposit);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int amount = scanner.nextInt();

                    if (amount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance = withdraw(balance, amount);
                    }
                    break;

                case 4:
                    System.out.println("\nThank you for using our Banking System.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please enter 1-4.");
            }
        }
    }
}