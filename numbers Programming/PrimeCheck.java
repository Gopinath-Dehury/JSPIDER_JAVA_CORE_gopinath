import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start range : ");
        int start = sc.nextInt();
        System.out.println("enter end range : ");
        int end = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                // count++;
                // if (count % 2 != 0)
                System.out.println(i);
            }
        }
    }

}
