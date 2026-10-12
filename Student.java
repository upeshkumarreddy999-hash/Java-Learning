import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}

public class Student{
    private static final String FILE_NAME = "students.dat";
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadStudents();

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Save & Exit");
            System.out.print("Choose option: ");

            int choice = readMenuChoice(sc);
            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = readNonEmptyInput(sc);
                    System.out.print("Enter age: ");
                    int age = readValidAge(sc);
                    System.out.print("Enter course: ");
                    String course = readNonEmptyInput(sc);
                    students.add(new Student(name, age, course));
                    System.out.println("Student added!");
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    saveStudents();
                    System.out.println("Data saved. Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static int readMenuChoice(Scanner sc) {
        try {
            int choice = sc.nextInt();
            sc.nextLine();
            return choice;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number!");
            sc.nextLine();
            return -1;
        }
    }

    private static String readNonEmptyInput(Scanner sc) {
        String input;
        while (true) {
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.print("This field cannot be empty. Please try again: ");
        }
    }

    private static int readValidAge(Scanner sc) {
        while (true) {
            try {
                int age = Integer.parseInt(sc.nextLine().trim());
                if (age >= 1 && age <= 120) {
                    return age;
                }
                System.out.print("Age must be between 1 and 120. Enter again: ");
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid age: ");
            }
        }
    }

    private static void viewStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void loadStudents() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            students = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                students = new ArrayList<>((List<Student>) obj);
            } else {
                students = new ArrayList<>();
            }
        } catch (EOFException e) {
            students = new ArrayList<>();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Error loading students: " + e.getMessage());
            students = new ArrayList<>();
        }
    }
}
