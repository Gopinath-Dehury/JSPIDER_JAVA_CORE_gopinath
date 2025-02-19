import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        sc.close();
        boolean flag = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {

                flag = false;
                break;
            }
        }
        
        if (n > 1 && flag) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
