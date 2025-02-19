import java.util.Scanner;

class PAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        // int spaces = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++) {// for (int j = 1; j <= spaces; j++)
                System.out.print("-");
            }

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
            // spaces++;
        }
    }

}
