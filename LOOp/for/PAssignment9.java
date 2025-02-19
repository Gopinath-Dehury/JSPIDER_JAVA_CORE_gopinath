import java.util.Scanner;

class PAssignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" " + " ");
            }

            for (int j = n; j >= i; j--) {
                System.out.print("X" + " ");
            }

            for (int j = n; j > i; j--) {
                System.out.print("X" + " ");
            }
            System.out.println();
        }
    }
}
