
import java.util.Scanner;

public class PersonalInfo
 {
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        String name= sc.nextLine();
        
        System.out.println("enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline character after nextInt()

        System.out.println("enter your city:");
        String city = sc.nextLine();
          
        System.out.println("enter your course :");
        String course = sc.nextLine();

        System.out.println("my name is :"+name );
        System.out.println("my age is :"+age);
        System.out.println("my city is :"+city);
        System.out.println("my course is :"+ course);
    
    }
    
}
