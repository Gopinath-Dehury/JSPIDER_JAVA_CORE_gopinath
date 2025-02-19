import java.util.Scanner;

class downwardTriangleP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines of number :");
        int n = sc.nextInt();
        int spaces = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = (n * 2) - 1; j >= spaces; j--) {
                System.out.print("*" + " ");
            }

            System.out.println();
            spaces += 2;
        }
    }
}