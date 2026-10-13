
import java.util.Scanner;

public class EmployeePayrollSystem {

    static Scanner sc = new Scanner(System.in);

    static String[] names = new String[100];
    static int[] ids = new int[100];
    static double[] basicSalaries = new double[100];
    static int count = 0;

    public static void addEmployee() {
        if (count == names.length) {
            System.out.println("Employee capacity reached.");
            return;
        }

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findEmployee(id) != -1) {
            System.out.println("Employee ID already exists.");
            return;
        }

        System.out.print("Enter employee name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter basic salary: Rs. ");
        double salary = sc.nextDouble();
        sc.nextLine();

        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            return;
        }

        ids[count] = id;
        basicSalaries[count] = salary;
        count++;

        System.out.println("Employee added successfully.");
    }

    public static double calculateGrossSalary(int index) {
        double basic = basicSalaries[index];
        double hra = basic * 0.20;
        double da = basic * 0.10;

        return basic + hra + da;
    }

    public static double calculateDeduction(int index) {
        return calculateGrossSalary(index) * 0.05;
    }

    public static double calculateNetSalary(int index) {
        return calculateGrossSalary(index) - calculateDeduction(index);
    }

    public static int findEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                return i;
            }
        }

        return -1;
    }

    public static void displayPayslip(int index) {
        double basic = basicSalaries[index];
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = calculateGrossSalary(index);
        double deduction = calculateDeduction(index);
        double net = calculateNetSalary(index);

        System.out.println("\n======= EMPLOYEE PAYSLIP =======");
        System.out.println("Employee ID: " + ids[index]);
        System.out.println("Employee Name: " + names[index]);

        System.out.printf("Basic Salary: Rs. %.2f%n", basic);
        System.out.printf("HRA (20%%): Rs. %.2f%n", hra);
        System.out.printf("DA (10%%): Rs. %.2f%n", da);
        System.out.printf("Gross Salary: Rs. %.2f%n", gross);
        System.out.printf("Deduction (5%%): Rs. %.2f%n", deduction);
        System.out.printf("Net Salary: Rs. %.2f%n", net);
        System.out.println("================================");
    }

    public static void searchEmployee() {
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        int index = findEmployee(id);

        if (index == -1) {
            System.out.println("Employee not found.");
        } else {
            displayPayslip(index);
        }
    }

    public static void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees registered.");
            return;
        }

        for (int i = 0; i < count; i++) {
            displayPayslip(i);
        }
    }

    public static void showHighestPaidEmployee() {
        if (count == 0) {
            System.out.println("No employee data available.");
            return;
        }

        int highestIndex = 0;

        for (int i = 1; i < count; i++) {
            if (calculateNetSalary(i) >
                calculateNetSalary(highestIndex)) {
                highestIndex = i;
            }
        }

        System.out.println("\nHighest-paid employee:");
        displayPayslip(highestIndex);
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display All Payslips");
            System.out.println("4. Highest-paid Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;

                case 3:
                    displayAllEmployees();
                    break;

                case 4:
                    showHighestPaidEmployee();
                    break;

                case 5:
                    System.out.println("Payroll system closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}