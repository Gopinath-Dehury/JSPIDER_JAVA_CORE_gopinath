import java.util.Scanner;

public class PatDiamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of lines :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("X");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}