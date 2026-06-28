import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10];
        int choice;

        do {
            System.out.println("\n1.View Seats");
            System.out.println("2.Book Seat");
            System.out.println("3.Cancel Seat");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Seat " + (i + 1) + " : " + (seats[i] ? "Booked" : "Available"));
                }
            } else if (choice == 2) {
                System.out.print("Enter seat number: ");
                int s = sc.nextInt();
                if (!seats[s - 1]) {
                    seats[s - 1] = true;
                    System.out.println("Seat Booked");
                } else {
                    System.out.println("Already Booked");
                }
            } else if (choice == 3) {
                System.out.print("Enter seat number: ");
                int s = sc.nextInt();
                seats[s - 1] = false;
                System.out.println("Booking Cancelled");
            }

        } while (choice != 4);
    }
}