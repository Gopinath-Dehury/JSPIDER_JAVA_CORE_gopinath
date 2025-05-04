import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CompStudent {
    public static void main(String[] args) {
        Student[] s= { new Student("umesh", 100), new Student("ram", 199), new Student("ramu", 109),
        new Student("ash", 193),
        new Student("rami", 14) };

        List<Student> students = new ArrayList<>(Arrays.asList(s));

                System.out.println();

        students.sort(null);

        System.out.println(students+"\n");
    }

}
