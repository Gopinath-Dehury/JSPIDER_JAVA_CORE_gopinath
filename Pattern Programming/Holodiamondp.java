import java.util.Scanner;

public class Holodiamondp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int stars = 1;
        int spaces = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || j == stars / 2 + 1 || i == n / 2 + 1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if (i <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
