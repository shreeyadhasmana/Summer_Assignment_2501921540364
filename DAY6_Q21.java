import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String binary = "";

        if (n == 0) {
            binary = "0";
        }

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        System.out.println(binary);
    }
}