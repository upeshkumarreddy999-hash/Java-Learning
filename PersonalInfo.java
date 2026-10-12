import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter your city:");
        String city = sc.nextLine();

        System.out.println("Enter your course:");
        String course = sc.nextLine();

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My city is: " + city);
        System.out.println("My course is: " + course);

        sc.close();
    }
}
