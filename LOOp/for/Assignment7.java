import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter :");
        int n = sc.nextInt();
        int start = 1; // Starting number for the first row

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Odd rows
                for (int j = 0; j < 5; j++) {
                    System.out.print(start + j + " ");
                }
                start += 5; // Increment start by 5 for the next row
            } else { // Even rows
                start += 5;
                // System.out.println(start);// First increment start by 5 to get the starting
                // point for even row
                for (int j = start - 1; j >= start - 5; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}