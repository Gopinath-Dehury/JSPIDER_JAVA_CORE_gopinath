import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int reverse = 0;
        for (int i = n; i > 0; i /= 10) {
            reverse = (reverse * 10) + (i % 10);
        }
        if (reverse == n) {
            System.out.println(n + " is a PALLINDROME NUMBER.");
        } else {
            System.out.println(n + " is not a PALLINDROME NUMBER.");
        }
    }
}
