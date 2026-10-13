
import java.util.Scanner;

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String[] titles = new String[100];
    static String[] authors = new String[100];
    static boolean[] issued = new boolean[100];
    static int count = 0;

    public static void addBook() {
        if (count >= titles.length) {
            System.out.println("Library capacity reached.");
            return;
        }

        System.out.print("Enter book title: ");
        titles[count] = sc.nextLine();

        System.out.print("Enter author name: ");
        authors[count] = sc.nextLine();

        issued[count] = false;
        count++;

        System.out.println("Book added successfully.");
    }

    public static void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n======= LIBRARY BOOKS =======");

        for (int i = 0; i < count; i++) {
            System.out.println("\nBook Number: " + (i + 1));
            System.out.println("Title: " + titles[i]);
            System.out.println("Author: " + authors[i]);
            System.out.println(
                "Status: " + (issued[i] ? "Issued" : "Available")
            );
        }
    }

    public static int searchBook(String title) {
        for (int i = 0; i < count; i++) {
            if (titles[i].equalsIgnoreCase(title)) {
                return i;
            }
        }

        return -1;
    }

    public static void searchBookMenu() {
        System.out.print("Enter book title to search: ");
        String title = sc.nextLine();

        int index = searchBook(title);

        if (index == -1) {
            System.out.println("Book not found.");
        } else {
            System.out.println("Book found.");
            System.out.println("Title: " + titles[index]);
            System.out.println("Author: " + authors[index]);
            System.out.println(
                "Status: " + (issued[index] ? "Issued" : "Available")
            );
        }
    }

    public static void issueBook() {
        System.out.print("Enter title of book to issue: ");
        String title = sc.nextLine();

        int index = searchBook(title);

        if (index == -1) {
            System.out.println("Book not found.");
        } else if (issued[index]) {
            System.out.println("This book is already issued.");
        } else {
            issued[index] = true;
            System.out.println("Book issued successfully.");
        }
    }

    public static void returnBook() {
        System.out.print("Enter title of book to return: ");
        String title = sc.nextLine();

        int index = searchBook(title);

        if (index == -1) {
            System.out.println("Book not found.");
        } else if (!issued[index]) {
            System.out.println("This book was not issued.");
        } else {
            issued[index] = false;
            System.out.println("Book returned successfully.");
        }
    }

    public static void showSummary() {
        int available = 0;
        int issuedCount = 0;

        for (int i = 0; i < count; i++) {
            if (issued[i]) {
                issuedCount++;
            } else {
                available++;
            }
        }

        System.out.println("\n===== LIBRARY SUMMARY =====");
        System.out.println("Total books: " + count);
        System.out.println("Available books: " + available);
        System.out.println("Issued books: " + issuedCount);
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Library Summary");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBookMenu();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    showSummary();
                    break;

                case 7:
                    System.out.println("Library system closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}