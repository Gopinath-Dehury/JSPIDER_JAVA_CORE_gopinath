import java.util.ArrayList;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ArrayListForEachExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ram"));
        students.add(new Student("Shyam"));
        students.add(new Student("Mohan"));

        // Modify names using for-each loop
        for (Student s : students) {
            s.name = s.name.toUpperCase(); // Works fine
        }

        // Print updated names
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
