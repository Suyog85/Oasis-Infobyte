package OasisInfobyte.ATM_Simulation;

import java.util.Scanner;

public class ATMSystem {
    private double balance = 0.0;
    private StringBuilder transactionHistory = new StringBuilder();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewTransactionHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);
    }

    private void viewTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        if (transactionHistory.length() == 0) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println(transactionHistory);
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.append("Withdrew: $").append(amount).append("\n");
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            transactionHistory.append("Deposited: $").append(amount).append("\n");
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void transfer() {
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter recipient's account number: ");
        String recipientAccount = scanner.next();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.append("Transferred: $").append(amount).append(" to account ").append(recipientAccount).append("\n");
            System.out.println("Transfer successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

