import java.util.Scanner;

public class PAt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of lines :");
        int n = sc.nextInt();
        int m = n * 2;
        for (int i = 1; i <= m; i++) {
            if (i <= (m / 2)) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("X");
                }
            } else {
                for (int j = m - 1; j >= i; j--) {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
