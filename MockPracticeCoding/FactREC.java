import java.util.Scanner;

public class FactREC {
    static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Factorial of " + n + " is " + fact(5));
    }
}
