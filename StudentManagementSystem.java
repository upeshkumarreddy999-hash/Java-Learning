
import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String[] names = new String[100];
    static int[] rollNumbers = new int[100];
    static double[][] marks = new double[100][5];
    static int count = 0;

    static String[] subjects = {
        "Java", "Python", "SQL", "HTML", "Maths"
    };

    public static void addStudent() {
        if (count >= names.length) {
            System.out.println("Student limit reached.");
            return;
        }

        System.out.print("Enter student name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNumbers[count] = sc.nextInt();

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks in " + subjects[i] + ": ");
            marks[count][i] = sc.nextDouble();
        }

        sc.nextLine();
        count++;

        System.out.println("Student added successfully.");
    }

    public static double calculateTotal(int index) {
        double total = 0;

        for (int i = 0; i < subjects.length; i++) {
            total += marks[index][i];
        }

        return total;
    }

    public static double calculatePercentage(int index) {
        return calculateTotal(index) / subjects.length;
    }

    public static String calculateGrade(int index) {
        double percentage = calculatePercentage(index);

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public static void displayStudent(int index) {
        System.out.println("\n----- STUDENT REPORT -----");
        System.out.println("Name: " + names[index]);
        System.out.println("Roll Number: " + rollNumbers[index]);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(
                subjects[i] + ": " + marks[index][i]
            );
        }

        System.out.println("Total: " + calculateTotal(index));
        System.out.printf(
            "Percentage: %.2f%%%n",
            calculatePercentage(index)
        );
        System.out.println("Grade: " + calculateGrade(index));
    }

    public static int findStudent(int rollNumber) {
        for (int i = 0; i < count; i++) {
            if (rollNumbers[i] == rollNumber) {
                return i;
            }
        }

        return -1;
    }

    public static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        int index = findStudent(rollNumber);

        if (index != -1) {
            displayStudent(index);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void displayAllStudents() {
        if (count == 0) {
            System.out.println("No students available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            displayStudent(i);
        }
    }

    public static void findTopper() {
        if (count == 0) {
            System.out.println("No students available.");
            return;
        }

        int topperIndex = 0;

        for (int i = 1; i < count; i++) {
            if (calculateTotal(i) > calculateTotal(topperIndex)) {
                topperIndex = i;
            }
        }

        System.out.println("\n----- CLASS TOPPER -----");
        displayStudent(topperIndex);
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Find Class Topper");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    findTopper();
                    break;

                case 5:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}