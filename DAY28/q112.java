import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] phones = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add Contact");
            System.out.println("2.View Contacts");
            System.out.println("3.Search Contact");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                names[count] = sc.nextLine();
                System.out.print("Enter Phone: ");
                phones[count] = sc.nextLine();
                count++;
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println(names[i] + " - " + phones[i]);
                }
            } else if (choice == 3) {
                System.out.print("Enter Name: ");
                String search = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(search)) {
                        System.out.println("Phone: " + phones[i]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Contact Not Found");
                }
            }

        } while (choice != 4);
    }
}