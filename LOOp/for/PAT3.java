import java.util.Scanner;

public class PAT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines of numbers :");
        int n = sc.nextInt();

        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
            spaces--;
        }
    }
}
