package OasisInfobyte.ReservationSystem;

import java.util.Scanner;

public class Reservation {
    public void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ticket Reservation ---");
        System.out.print("Enter Passenger Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Train Number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Class Type (e.g., AC, Sleeper): ");
        String classType = scanner.nextLine();
        System.out.print("Enter Date of Journey (DD-MM-YYYY): ");
        String journeyDate = scanner.nextLine();
        System.out.print("Enter From Location: ");
        String from = scanner.nextLine();
        System.out.print("Enter To Location: ");
        String to = scanner.nextLine();

        System.out.println("\nReservation successful!");
        System.out.println("Name: " + name + ", Train No: " + trainNumber + ", Class: " + classType + ", Date: " + journeyDate);
        System.out.println("From: " + from + ", To: " + to);
    }
}
