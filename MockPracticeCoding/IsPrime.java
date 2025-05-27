import java.util.Scanner;

public class IsPrime {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = end; i >=start ; i--) {
            if (isPrime(i))
                System.out.println(i);
                break;
        }
    }
}
