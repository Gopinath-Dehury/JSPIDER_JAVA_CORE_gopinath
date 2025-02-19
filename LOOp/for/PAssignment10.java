import java.util.Scanner;

class PAssignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("-" + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("Y" + " ");
            }
            // if (i != 5)
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("-" + " ");
            }
            for (int j = n; j >= i; j--) {

                System.out.print("X" + " ");
            }

            System.out.println();
        }
    }
}
