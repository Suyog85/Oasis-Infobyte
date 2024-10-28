package OasisInfobyte.ReservationSystem;

import java.util.Scanner;

public class Login {
    public void startLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Reservation System");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Choose an option (1 or 2): ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (option == 1) {
            login();
        } else if (option == 2) {
            register();
        } else {
            System.out.println("Invalid option. Try again.");
            startLogin();
        }
    }
    private void login() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter Username: ");
      String username = scanner.nextLine();
      System.out.print("Enter Password: ");
      String password = scanner.nextLine();
  
      if (User.authenticate(username, password)) {
          System.out.println("Login successful!");
          mainMenu();  // Call mainMenu after successful login
      } else {
          System.out.println("Invalid credentials! Try again.");
          startLogin(); // Restart the login process if credentials are invalid
      }
  }
  
    

    private void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter New Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter New Password: ");
        String password = scanner.nextLine();

        if (User.addUser(username, password)) {
            System.out.println("Registration successful! You can now log in.");
            startLogin();
        } else {
            System.out.println("User already exists. Please try a different username.");
            startLogin();
        }
    }

    private void mainMenu() {
      Scanner scanner = new Scanner(System.in);
  
      System.out.println("\nMain Menu:");
      System.out.println("1. Make a Reservation");
      System.out.println("2. Cancel a Reservation");
      System.out.println("3. Exit");
  
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
  
      switch (choice) {
          case 1:
              Reservation reservation = new Reservation();
              reservation.bookTicket();
              break;
          case 2:
              Cancellation cancellation = new Cancellation();
              cancellation.cancelTicket();
              break;
          case 3:
              System.out.println("Thank you for using the system. Goodbye!");
              System.exit(0);
              break;
          default:
              System.out.println("Invalid choice. Please try again.");
              mainMenu(); // Call mainMenu again for a valid choice
      }
  }
  
}
