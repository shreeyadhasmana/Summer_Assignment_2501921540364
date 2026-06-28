import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        double netSalary = basic + bonus - deduction;

        System.out.println("\n----- Salary Details -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Deduction     : " + deduction);
        System.out.println("Net Salary    : " + netSalary);
    }
}