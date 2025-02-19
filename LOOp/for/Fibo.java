import java.util.Scanner;

class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        for (int i = 1; i <= n; i++) { // while(a<=n) fibo series less than n

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
