import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the b value : ");
        int b = sc.nextInt();
        System.out.println("Enter the p value : ");
        int p = sc.nextInt();
        sc.close();

        int res = 1;
        for (int i = 1; i <= p; i++) {

            res = res * b;

        }
        System.out.println("'b' to the power 'p' = " + res);
    }
}
