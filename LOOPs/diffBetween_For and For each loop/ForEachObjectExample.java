class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ForEachObjectExample {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ram"),
            new Student("Shyam"),
            new Student("Mohan")
        };

        // Modify name using for-each loop
        for (Student s : students) {
            s.name = s.name.toUpperCase(); // This works!
        }

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
