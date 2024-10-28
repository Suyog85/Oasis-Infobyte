package OasisInfobyte.ReservationSystem;

import java.util.Scanner;

public class Cancellation {
    public void cancelTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ticket Cancellation ---");
        System.out.print("Enter PNR Number to cancel: ");
        int pnrNumber = scanner.nextInt();

        // For demonstration, assume any PNR entered is valid
        System.out.println("PNR: " + pnrNumber + " found.");
        System.out.println("Do you want to confirm cancellation? (Y/N)");
        char confirm = scanner.next().charAt(0);

        if (confirm == 'Y' || confirm == 'y') {
            System.out.println("Ticket cancelled successfully!");
        } else {
            System.out.println("Cancellation aborted.");
        }
    }
}
