import java.util.Scanner;

class Student {

    String S_Firstname;
    String S_Lastname;
    String S_phno;
    String S_Email;
    String S_Address;
    String S_Course;
    int S_Age;
    String S_Last_Education;

    void intialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of student :");
        S_Firstname = sc.nextLine();
        System.out.println("Enter the last name of student :");
        S_Lastname = sc.nextLine();
        System.out.println("Enter the Phone number of student :");
        S_phno = sc.nextLine();
        System.out.println("Enter the Email-Id of student :");
        S_Email = sc.nextLine();
        System.out.println("Enter the Address of student :");
        S_Address = sc.nextLine();
        System.out.println("Enter the Course of student :");
        S_Course = sc.nextLine();
        System.out.println("Enter the Age of student :");
        S_Age = sc.nextInt();
        System.out.println();
        System.out.println("Enter the Latest education of student :");
        S_Last_Education = sc.nextLine();
        System.out.println("initialize.");
        sc.close();

    }

    int count = 1;

    void display() {

        System.out.println("XXXXXXXXXX --Student Details :" + count + "-- XXXXXXXXXX");
        System.out.println();
        System.out.println("Name : " + S_Firstname + " " + S_Lastname + ".");
        System.out.println("Phone : " + S_phno);
        System.out.println("Email : " + S_Email);
        System.out.println("Address : " + S_Address);
        System.out.println("Age : " + S_Age);
        System.out.println("Course Details : " + S_Course);
        System.out.println("Last Education : " + S_Last_Education);
        System.out.println();
        System.out.println("XXXXXXXXXXXXXXXXXXXX  End   XXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();
        System.out.println();

        count++;
    }

}

class Student_Registration {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.intialize();
        System.out.println();
        s1.display();
        // Student s2 = new Student();
        // s2.intialize();
        // s2.display();
    }
}