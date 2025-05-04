import java.util.ArrayList;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ArrayListReassignFail {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ram"));
        students.add(new Student("Shyam"));
        students.add(new Student("Mohan"));

        // Attempt to reassign in for-each loop
        for (Student s : students) {
            s = new Student("Anonymous"); // Only updates local copy, not the list
        }

        // Print names to see the result
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
