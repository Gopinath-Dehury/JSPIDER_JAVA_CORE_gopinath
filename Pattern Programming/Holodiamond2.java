import java.util.Scanner;

public class Holodiamond2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int spaces = n - 1;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;

            }
        }
    }
}
