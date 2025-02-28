import java.util.Scanner;

class A {
    // static int j;
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // j=sc.nextInt();
        System.out.println(add(5));
    }

    static int i = 1;

    static int add(int j) {

        if (i >= j)
            return j;

        return add(i) + add(i + 1);
    }
}
