package gameProject;

import java.util.Scanner;

class BankAccount {

    private int balance = 5000;

    public void showBalance() {
        System.out.println(balance);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }

        balance -= amount;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        while (true) {

            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.showBalance();
                    break;

                case 2:
                    System.out.print("Amount: ");
                    account.deposit(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextInt());
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
