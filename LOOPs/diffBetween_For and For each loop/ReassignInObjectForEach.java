class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ReassignInObjectForEach {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ram"),
                new Student("Shyam"),
                new Student("Mohan")
        };

        // Try reassigning the whole object (won't work)
        for (Student s : students) {
            s = new Student("Anonymous"); // Reassigns only the local copy `s`
            System.out.println(s.name);
        }

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
