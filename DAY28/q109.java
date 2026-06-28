import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];
        boolean[] issued = new boolean[10];
        int n;

        System.out.print("Enter number of books: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book name: ");
            books[i] = sc.nextLine();
            issued[i] = false;
        }

        int choice;

        do {
            System.out.println("\n1.View Books");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.println((i + 1) + ". " + books[i] + " - " + (issued[i] ? "Issued" : "Available"));
                }
            } else if (choice == 2) {
                System.out.print("Enter book number: ");
                int b = sc.nextInt();
                if (!issued[b - 1]) {
                    issued[b - 1] = true;
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Already Issued");
                }
            } else if (choice == 3) {
                System.out.print("Enter book number: ");
                int b = sc.nextInt();
                issued[b - 1] = false;
                System.out.println("Book Returned");
            }

        } while (choice != 4);
    }
}