import java.util.Scanner;

class HoloTrianglePAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter line number :");
        int n = sc.nextInt();
        int spaces = n - 1;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (i == n || j == 1 || j == stars) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            spaces--;
            stars += 2;
        }

    }
}
