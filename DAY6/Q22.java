import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();

        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            long rem = binary % 10;
            decimal += rem * base;
            base = base * 2;
            binary = binary / 10;
        }

        System.out.println(decimal);
    }
}
