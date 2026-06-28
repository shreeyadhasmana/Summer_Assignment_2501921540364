import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        int choice;

        do {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                balance += amt;
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                if (amt <= balance) {
                    balance -= amt;
                    System.out.println("Withdrawal Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else if (choice == 3) {
                System.out.println("Balance = " + balance);
            }

        } while (choice != 4);
    }
}