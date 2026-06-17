import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(result);
    }
}
