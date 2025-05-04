import java.util.Scanner;

public class PerfectNumberCheck {

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false; // Perfect numbers are greater than 1

        int sum = 0;
        // Loop to find divisors and sum them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        return sum == num; // Check if sum equals the number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calling the method and printing result
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }

        scanner.close();
    }
}


