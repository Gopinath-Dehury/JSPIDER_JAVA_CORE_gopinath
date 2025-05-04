class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class foreachwith_Non_primitive {
    public static void main(String[] args) {
        Student[] students = { new Student("Ram"), new Student("Ramana"), new Student("Gopinath") };
        for (Student s : students) {
            s.name = s.name.toUpperCase();// with non-primitive type for each loop can modify the values
            // System.out.println(s);
        }

        for (Student s : students) {
            System.out.println(s);
        }

    }
}
