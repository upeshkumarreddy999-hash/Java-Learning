import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SaveFileExample4 {
    public static void main(String[] args) {
        Student s1 = new Student("Varampati", 21);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s1);
            System.out.println("Object saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
