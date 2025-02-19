import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int sqr = n * n;
        int m = n;
        int temp = 1;
        while (n > 0) {
            temp *= 10;
            n /= 10;
        }
        if (sqr % temp == m) {
            System.out.println(m + " is a AUTOMORPHIC NUMBER.");
        } else {
            System.out.println(m + " not a AUTOMORPHIC NUMBER.");
        }
    }
}
