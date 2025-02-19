import java.util.Scanner;

class TriangleP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of line :");
        int n = sc.nextInt();

        int spaces = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = (n - 1); j >= i; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            spaces += 2;
        }
    }
}