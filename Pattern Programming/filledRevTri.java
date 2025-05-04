import java.util.Scanner;

public class filledRevTri {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int spaces = 0;
        int stars = n * 2 - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}
