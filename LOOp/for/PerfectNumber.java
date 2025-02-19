
// In Java, a perfect number is a positive integer that is equal to the sum - 
// of its proper divisors (divisors excluding the number itself). 
// Example:
// 6 is a perfect number because 1 + 2 + 3 = 6 
// 28 is a perfect number because 1 + 2 + 4 + 7 + 14 = 28 
import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range must +ve : ");
        int start = sc.nextInt();
        System.out.println("Enter the end range must +ve : ");
        int end = sc.nextInt();
        sc.close();
        for (int j = start; j <= end; j++) {
            int sum = 0;
            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    // System.out.print(i + " ,");
                    sum += i;

                }
            }
            // System.out.println("Sum of divisors :" + sum + " = " + n + " is enter number,
            // So");
            if (sum == j) {
                System.out.println(j);
            }
            // else
            // System.out.println(j + " is a not perfect number.");

        }
    }
}
