import java.util.Scanner;

public class AutoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int sqr = n * n;
        boolean flag = true;

        while (n > 0) {
            if (n % 10 != sqr % 10) {
                flag = false;
            }
            n /= 10;
            sqr /= 10;
        }
        if (flag) {
            System.out.println("auto");
        } else {
            System.out.println("not auto");
        }
    }
}
