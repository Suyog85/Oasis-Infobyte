package OasisInfobyte.ATM_Simulation;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String userPin = scanner.nextLine();

        // Check user credentials (for simplicity, assume user ID is "user" and PIN is "1234")
        if (userId.equals("user") && userPin.equals("1234")) {
            System.out.println("Login successful!");
            ATMSystem atmSystem = new ATMSystem();
            atmSystem.showMenu();
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }

        scanner.close();
    }
}
