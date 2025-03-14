public class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        this("Unknown", 18); // Calls Constructor 2
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Calls default constructor
        Student s2 = new Student("John", 20); // Calls parameterized constructor directly
    }
}

// this() is used to call constructor of the same class and to access the
// reference variable we use this keyword
