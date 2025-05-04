import java.util.Scanner;

class holoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        int stars = 1;
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || i == n) {
                    System.out.print(a++ +" ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
            stars += 2;
        }
    }
}