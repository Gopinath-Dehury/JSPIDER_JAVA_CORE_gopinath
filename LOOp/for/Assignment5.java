import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find his all divisors : ");
        int n = sc.nextInt();
        System.out.println("All the divisors of " + n + " are ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i != n)
                    sum += i;

                System.out.print(i);
                if (i != n)
                    System.out.print(", ");
            }
        }
        System.out.println("\n");
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");

        }
    }

}
