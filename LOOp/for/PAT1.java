import java.util.Scanner;

class PAT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the line of number :");
        int n = sc.nextInt();
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = spaces; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
